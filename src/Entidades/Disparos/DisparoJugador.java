package Entidades.Disparos;

import java.awt.Point;

import Colisionador.Colisionador;

public class DisparoJugador extends Disparo{
	
	
	//Constructor
	protected DisparoJugador(Point p) {
		super(p);
	}

	//Metodos
	
	public void mover() {
		
	}

	public void meColisionan(Colisionador c) {
		c.colisionarDisparoJugador(this);
	}
}
