package Entidades.Enemigos;

import Entidades.Entidad;
import java.awt.Point;

import Colisionador.Colisionador;

/**
 * 
 * @author 
 *
 */
public abstract class Enemigo extends Entidad{
		
	//Constructos
	protected Enemigo(Point p) {
		super(p);
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
