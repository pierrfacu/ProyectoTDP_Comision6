package Inteligencia.Estados;

import java.awt.Point;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Inteligencia;

/**
 *
 * @author Aldana Cas� (104870), Facundo Pierrestegui (99694), Stefania Heirich (106205)
 *
 */
public class EnFormacion extends Estado {

	protected static final int velFormacion = 40;
	protected int contSecMF;
	
	//Constructor
	public EnFormacion (Inteligencia i, Enemigo enemigo) {
		super(i, enemigo); 
		contSecMF = 0;
	}
	
	//Metodos
	
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
		enemigo.setGrafico(0);
		contSecMF ++;
		if(contSecMF == 4)
			contSecMF = 0;
    } 
	
	public boolean isAtaco() {
    	return true;
    }
	
}
		


