package Inteligencia;

import java.awt.Point;

import Entidades.Enemigos.Enemigo;

public abstract class Inteligencia {
	protected static Enemigo enemigo;
	protected static Point posicionFormacion;
	protected int velocidad;
	protected boolean ataco;
	protected int contSecMF;
	
	//Constructor
	public Inteligencia(Enemigo e) {
		enemigo = e;
		posicionFormacion = enemigo.getPosition();
		velocidad=enemigo.getVelocidad();
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
	
	
	
	
	
	protected void moverFormacion() {
		Point p = enemigo.getPosition();
		switch (contSecMF) {
		case 0 : //izquierda
			enemigo.setPosition(new Point(p.x - velocidad,p.y));
			break; 
		case 1 : //derecha
			enemigo.setPosition(new Point(p.x + velocidad, p.y));
			break;
		case 2 : //derecha
			posicionFormacion.setLocation(p.x + velocidad, p.y);
			break;
		case 3 : //izquierda
			posicionFormacion.setLocation(p.x - velocidad, p.y);
			break;
		}
		
		contSecMF ++;
		if(contSecMF == 4)
			contSecMF = 0;
    } 
	
	//Metodos abstractos
	public abstract void atacar();
	
}
