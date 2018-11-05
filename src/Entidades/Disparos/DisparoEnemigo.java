package Entidades.Disparos;

import java.awt.Point;
import Colisionador.*;
import Juego.JuegoEnemigo;

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
		meSali();
		pos.setLocation(pos.x, pos.y + velocidad);
		setGrafico(0);
	}
	
	public void meColisionan(Colisionador c) {
		c.colisionarDisparoEnemigo(this);
	}
	
	public void meSali() {
		JuegoEnemigo juego = JuegoEnemigo.getInstance();
		int altoGrafica = juego.obtenerGrafica().altoGrafica();
		if(pos.y > altoGrafica){
			muerteSubita();
		}
	}
}
