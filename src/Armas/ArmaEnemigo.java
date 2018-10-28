package Armas;

import Entidades.Enemigos.EnemigoArmado;

public abstract class ArmaEnemigo extends Arma{
	
	protected EnemigoArmado enemigo;
	
	//Constructor
	public ArmaEnemigo(EnemigoArmado e) {
		super();
		enemigo = e;
	}

}
