package Entidades.Enemigos;

import Entidades.Entidad;

/**
 * 
 * @author 
 *
 */
public abstract class Enemigo extends Entidad{
	
	//Constructos
	protected Enemigo(int vel, int x, int y) {
		super(vel, x, y);
	}
	
	//Metodos
	
	/**
	 * 
	 */
	public void mover(int d) {
		switch (d) {
			case 0 : //izquierda
				pos.setLocation(pos.x - velocidad, pos.y);
				break; 
			case 1 : //derecha
				pos.setLocation(pos.x + velocidad, pos.y);
				break;
		}
		setGrafico(d);
	}
}
