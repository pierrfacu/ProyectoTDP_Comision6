package Entidades.Disparos;

import java.awt.Point;
import Colisionador.*;

public abstract class DisparoJugador extends Disparo{
	
	
	//Constructor
	public DisparoJugador(Point p, int w, int h) {
		super(p, w, h);
	}

	//Metodos
	
	public void mover() {
		pos.setLocation(pos.x, pos.y - velocidad);
		setGrafico(0);
	}

	public void meColisionan(Colisionador c) {
		c.colisionarDisparoJugador(this);
	}
}
