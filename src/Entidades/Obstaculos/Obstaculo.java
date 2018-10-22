package Entidades.Obstaculos;

import java.awt.Point;

import Colisionador.Colisionador;
import Entidades.Entidad;

/**
 * 
 * @author 
 *
 */
public abstract class Obstaculo extends Entidad{
	
	//Constructor
	protected Obstaculo(Point p, int w, int h) {
		super(p, w, h);
	}
	
	//Metodos
	
	public void mover() {
		//No hace nada, no se mueven los obstaculos.
	}
	
	public void meColisionan(Colisionador c) {
		c.colisionarObstaculo(this);
	}
}
