package Entidades.PowerUps;

import java.awt.Point;

import Colisionador.Colisionador;
import Entidades.Entidad;

/**
 * 
 * @author
 *
 */
public abstract class PowerUp extends Entidad{
	
	//Constructor
	protected PowerUp(Point p, int w, int h) {
		super(p, w, h);
	}
	
	//Metodos
	
	public void mover() {
		
	}

	public void meColisionan(Colisionador c) {
		c.colisionarPowerUp(this);
	}
}
