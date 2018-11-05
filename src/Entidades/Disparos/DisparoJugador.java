package Entidades.Disparos;

import java.awt.Point;
import Colisionador.*;

/**
 * Clase abstracta DisparoJugador que extiende de Disparo.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public abstract class DisparoJugador extends Disparo{
	
	//Constructor
	protected DisparoJugador(Point p, int w, int h) {
		super(p, w, h);
	}

	//Metodos
	
	public void mover() {
		meSali();
		pos.setLocation(pos.x, pos.y - velocidad);
		setGrafico(0);
	}

	public void meColisionan(Colisionador c) {
		c.colisionarDisparoJugador(this);
	}
	
	public void meSali() {
		if((pos.y + altoEntidad()) < 0){
			muerteSubita();
		}
	}
}
