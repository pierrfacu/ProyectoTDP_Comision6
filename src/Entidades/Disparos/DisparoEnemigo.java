package Entidades.Disparos;

import java.awt.Point;
import Colisionador.*;

/**
 * Clase abstracta DisparoEnemigo que extiende de Disparo.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class DisparoEnemigo extends Disparo{

	//Constructor
	protected DisparoEnemigo(Point p, int w, int h) {
		super(p, w, h);		
	}

	//Metodos
	
	public void mover() {
		pos.setLocation(pos.x, pos.y + velocidad);
		setGrafico(0);
	}
	
	public void meColisionan(Colisionador c) {
		c.colisionarDisparoEnemigo(this);
	}
}
