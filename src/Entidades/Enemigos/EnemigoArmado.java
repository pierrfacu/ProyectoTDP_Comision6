package Entidades.Enemigos;

import java.awt.Point;

import Armas.Arma;

public abstract class EnemigoArmado extends Enemigo{
	
	protected Arma arma;
	
	//Constructor
	protected EnemigoArmado(Point p, int w, int h) {
		super(p, w, h);
	}
	
	//Metodos abstractos
	public abstract void disparar();
}
