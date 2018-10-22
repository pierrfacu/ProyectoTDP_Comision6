package Entidades.Enemigos;

import Entidades.Entidad;
import Juego.JuegoEnemigo;

import java.awt.Point;

import Colisionador.Colisionador;

/**
 * 
 * @author 
 *
 */
public abstract class Enemigo extends Entidad{
	
	protected static JuegoEnemigo juego;
	
	//Constructor
	protected Enemigo(Point p) {
		super(p, 40 , 40);
		juego = JuegoEnemigo.getInstance();
	}
	
	//Metodos
	
	public void mover() {
		
		/*switch (d) {
			case 0 : //izquierda
				pos.setLocation(pos.x - velocidad, pos.y);
				break; 
			case 1 : //derecha
				pos.setLocation(pos.x + velocidad, pos.y);
				break;
		}
		setGrafico(d);*/
	}
	
	public void meColisionan(Colisionador c) {
		c.colisionarEnemigo(this);
	}
}
