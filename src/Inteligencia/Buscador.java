package Inteligencia;

import Entidades.Enemigos.Enemigo;
import Juego.JuegoEnemigo;

import java.awt.Point;

import Entidades.Jugador;

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
        if(posEnem.x < posJug.x && posEnem.y < posJug.y)
        	posNueva.setLocation(posEnem.x + velocidad, posEnem.y + velocidad);
        if(posEnem.x > posJug.x && posEnem.y < posJug.y)
        	posNueva.setLocation(posEnem.x - velocidad, posEnem.y + velocidad);
        if(posEnem.x == posJug.x && posEnem.y > posJug.x)
        	posNueva.setLocation(posEnem.x, posEnem.y + velocidad);
        enemigo.setPosition(posNueva);
        enemigo.setGrafico(0);
	}
}
