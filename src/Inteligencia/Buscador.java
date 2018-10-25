package Inteligencia;

import Entidades.Enemigos.Enemigo;
import Juego.JuegoEnemigo;

import java.awt.Point;

public class Buscador extends Inteligencia {	
	
	public Buscador (Enemigo e) {
		super(e);
	}
	
	//Metodos
	
	public void atacar() {
		JuegoEnemigo juegoEnem = JuegoEnemigo.getInstance();
		Point posJug = juegoEnem.obtenerJugador().getPosition();
		Point posEnem=enemigo.getPosition();
		Point posNueva=new Point(0,0);
		int ancho=juegoEnem.obtenerGrafica().anchoGrafica();
	    if(posEnem.x < posJug.x && posEnem.y < posJug.y) //Derecha
		    if((posEnem.x + velocidad) > (ancho - 50))
		        posNueva.setLocation(posEnem.x + velocidad, posEnem.y + velocidad);
	    if(posEnem.x > posJug.x && posEnem.y < posJug.y) //Izquierda
	    	if((posEnem.x - velocidad) < 0)
        	    posNueva.setLocation(posEnem.x - velocidad, posEnem.y + velocidad);
        if(posEnem.x == posJug.x && posEnem.y > posJug.y) //Solo bajar
            posNueva.setLocation(posEnem.x, posEnem.y + velocidad);
        enemigo.setPosition(posNueva);
        enemigo.setGrafico(0);
	}
}
