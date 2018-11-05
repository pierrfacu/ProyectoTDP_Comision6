package Entidades.Disparos;

import java.awt.Point;
import Entidades.Entidad;

/**
 * Clase abstracta Disparo que extiende de Entidad.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public abstract class Disparo extends Entidad {
	
	//Constructor
	protected Disparo(Point p, int w, int h) {
		super(p, w, h);		
	}
	
	//Metodos abstracto
	
	/**
	 * Verifica si el disparo se salio de la ventana, si se salio lo elimina.
	 */
	public abstract void meSali();
}
