package Inteligencia.Estados;

import java.awt.Point;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Inteligencia;
import Juego.JuegoEnemigo;

/**
 * 
 * @author Aldana Cas� (104870), Facundo Pierrestegui (99694), Stefania Heirich (106205)
 *
 */

public class Buscar extends Estado{
	//Constructor
	public Buscar(Inteligencia i, Enemigo enemigo) {
		super(i,enemigo);
	}
	
	//Metodos
	public void ejecutar() {
		
		JuegoEnemigo juegoEnem = JuegoEnemigo.getInstance();
		Point posJug = juegoEnem.obtenerJugador().getPosition();
		Point posEnem=enemigo.getPosition();
		Point posNueva= new Point(posEnem.x,0);
	    if(posEnem.x < posJug.x && posEnem.y < posJug.y) //Derecha
		    posNueva.setLocation(posEnem.x + velocidad, posEnem.y + velocidad);
	    if(posEnem.x > posJug.x && posEnem.y < posJug.y) //Izquierda
	    	posNueva.setLocation(posEnem.x - velocidad, posEnem.y + velocidad);
	    if(posEnem.x == posJug.x && posEnem.y < posJug.y) //Solo bajar
            posNueva.setLocation(posEnem.x, posEnem.y + velocidad);
        if(posEnem.x != posJug.x && posEnem.y >= posJug.y)
        	posNueva.setLocation(posEnem.x, posEnem.y + velocidad);
        enemigo.setPosition(posNueva);
        enemigo.setGrafico(0);
        int alto = juegoEnem.obtenerGrafica().altoGrafica();
 		if(enemigo.getPosition().y > alto) 
 			inteligencia.setEstado(new VolverFormacion(inteligencia, enemigo));
	}
	
}
