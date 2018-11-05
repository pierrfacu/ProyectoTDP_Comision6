package Entidades.Obstaculos;

import java.awt.Point;
import Entidades.Entidad;

/**
 * Clase abstracta Obstaculo que extiende de Entidad.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public abstract class Obstaculo extends Entidad{
	
	//Constructor
	protected Obstaculo(Point p, int w, int h) {
		super(p, w, h);
	}
	
	//Metodos
	
	public void mover() {
		//Soy una entidad que nacio sin poder moverse.
	}
}
