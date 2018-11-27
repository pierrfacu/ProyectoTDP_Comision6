package Inteligencia.Estados;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Inteligencia;

/**
 * Clase abstracta Estado
 * @author Aldana Cas� (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205)
 *
 */

public abstract class Estado {
	
	protected Inteligencia inteligencia;
	protected Enemigo enemigo;
	protected int velocidad;
	
	//Constructor
	protected Estado(Inteligencia i, Enemigo e) {
		inteligencia = i;
		enemigo = e;
		velocidad = e.getVelocidad();
	}
	
	/**
	 * Metodo que define el estado de un enemigo.
	 */
	public abstract void ejecutar();
}
