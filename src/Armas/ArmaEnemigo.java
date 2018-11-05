package Armas;

import Entidades.Enemigos.EnemigoArmado;

/**
 * Clase abstracta Arma enemigo que extiende de Arma.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public abstract class ArmaEnemigo extends Arma{
	
	protected EnemigoArmado enemigo;
	
	//Constructor
	protected ArmaEnemigo(EnemigoArmado e) {
		super();
		enemigo = e;
	}
}
