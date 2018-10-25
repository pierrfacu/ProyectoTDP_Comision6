package Inteligencia;

import java.awt.Point;
import java.util.Random;

import Entidades.Enemigos.Enemigo;
import Juego.JuegoEnemigo;

public abstract class Inteligencia {
	protected static final int velFormacion = 50;
	protected Enemigo enemigo;
	protected Point posicionFormacion;
	protected int velocidad;
	protected boolean ataco;
	protected int contSecMF;
	
	//Constructor
	public Inteligencia(Enemigo e) {
		enemigo = e;
		posicionFormacion = enemigo.getPosition();
		velocidad = enemigo.getVelocidad();
		contSecMF = 0;
		ataco=false;
	}
	
	//Metodos
	
	public void ejecutar() {
		if (ataco)
			atacar();
		else
		   moverFormacion();
	}
	
	public void setPosFormacion(Point p) {
		if(p!=null)
		   posicionFormacion = p;	
	}
	
	public Point getPosFormacion() {
		return posicionFormacion;
	}
	
	
	protected void moverFormacion() {
		Point p = enemigo.getPosition();
		switch (contSecMF) {
		case 0 : //izquierda
			enemigo.setPosition(new Point(p.x - velFormacion,p.y));
			break; 
		case 1 : //derecha
			enemigo.setPosition(new Point(p.x + velFormacion, p.y));
			break;
		case 2 : //derecha
			posicionFormacion.setLocation(p.x + velFormacion, p.y); //esta bien que se use posicionFormacion aca?
			break;
		case 3 : //izquierda
			posicionFormacion.setLocation(p.x - velFormacion, p.y);//esta bien que se use posicionFormacion aca?
			break;
		}
		
		contSecMF ++;
		if(contSecMF == 4)
			contSecMF = 0;
    } 
	
	/**
	 * 
	 * Requiere que el enemigo sea posicionado en la parte superior afuera de la ventana.
	 */
	protected void volverFormacion() {
		Point pos=enemigo.getPosition();
		pos.setLocation(posicionFormacion.x, 0);
		if(posicionFormacion.y > pos.y)
			pos.setLocation(posicionFormacion.x, pos.y + velocidad);
		enemigo.setGrafico(0);
	}
	
    protected void ejecutarMovimientoAleatorio() {
		
		JuegoEnemigo juego = JuegoEnemigo.getInstance();
		int ancho = juego.obtenerGrafica().anchoGrafica();
		Point p = enemigo.getPosition();
        Random r = new Random (3);
		int d=r.nextInt();
		
		switch(d) {
		
		case 0: //izquierda
			if ((p.x - velocidad) < 0)
				p.setLocation(0, p.y);
			else
				p.setLocation(p.x - velocidad, p.y);
			enemigo.setPosition(p);
			enemigo.setGrafico(0);
			break; 
			
		case 1: //derecha controla tope hasta 50
			if ((p.x + velocidad) > (ancho - 50))
				p.setLocation((ancho - 50), p.y);
			else 
				p.setLocation(p.x + velocidad, p.y);
			enemigo.setPosition(p);
			enemigo.setGrafico(0);
			
			break;
			
		case 2: //abajo
			p.setLocation(p.x, p.y + velocidad);
			enemigo.setPosition(p);
			enemigo.setGrafico(0);
			break;
	    }	
	}
	
	//Metodos abstractos
	public abstract void atacar();
	
}
