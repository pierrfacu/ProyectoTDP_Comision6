package Entidades.Disparos;

import java.awt.Point;

import Colisionador.Colisionador;

public class DisparoEnemigo extends Disparo{

	//Constructor
	protected DisparoEnemigo(Point p) {
		super(p);
	}

	//Metodos
	
	public void mover() {
		
	}
	
	public void meColisionan(Colisionador c) {
		c.colisionarDisparoEnemigo(this);
	}

}
