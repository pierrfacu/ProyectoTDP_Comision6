package Entidades.Enemigos;

import java.awt.Point;

import Armas.Arma;
import Colisionador.Colisionador;

public abstract class EnemigoArmado extends Enemigo{
	
	protected Arma arma;
	
	//Constructor
	protected EnemigoArmado(Point p, int w, int h) {
		super(p, w, h);
	}
	
	//Metodos
	
	public void meColisionan(Colisionador c) {
		if (arma != null)
			c.colisionarEnemigoArmado(this);
		else c.colisionarEnemigoKamikaze(this);
	}
	
	//Metodos abstractos
	
	public abstract void disparar();
}
