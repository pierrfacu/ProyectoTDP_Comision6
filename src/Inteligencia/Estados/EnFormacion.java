package Inteligencia.Estados;

import java.awt.Point;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Inteligencia;

/**
 *
 * @author
 *
 */
public class EnFormacion extends Estado {

	protected static final int velFormacion = 40;
	protected int contSecMF;
	
	public EnFormacion (Inteligencia i, Enemigo enemigo) {
		super(i, enemigo); 
		contSecMF = 0;
	}
	
	public void ejecutar() {
		
		
		Point p = enemigo.getPosition();
		switch (contSecMF) {
		case 0 : //izquierda
			enemigo.setPosition(new Point(p.x - velFormacion,p.y));
			break; 
		case 1 : //derecha
			enemigo.setPosition(new Point(p.x + velFormacion, p.y));
			break;
		case 2 : //derecha
			enemigo.setPosition(new Point(p.x + velFormacion, p.y));
			break;
		case 3 : //izquierda
			enemigo.setPosition(new Point(p.x - velFormacion,p.y));
			break;
		}
		
		contSecMF ++;
		if(contSecMF == 4)
			contSecMF = 0;
    } 
	
}
		


