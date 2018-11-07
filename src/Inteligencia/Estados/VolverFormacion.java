package Inteligencia.Estados;

import java.awt.Point;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Inteligencia;

/**
 * 
 * @author Aldana Cas� (104870), Facundo Pierrestegui (99694), Stefania Heirich (106205)
 *
 */

public class VolverFormacion extends Estado{
	
	//Constructor
	public VolverFormacion(Inteligencia i, Enemigo enemigo) {
		super (i,enemigo);
		enemigo.getPosition().setLocation(inteligencia.getPosFormacion().x, 0 - enemigo.altoEntidad());
		//enemigo.setGrafico(0);
	}
	
	//Metodos
	public void ejecutar(){
		
		Point posicionFormacion = inteligencia.getPosFormacion();
		Point pos=enemigo.getPosition();
			
		if(pos.y + velocidad < posicionFormacion.y) {
		   pos.setLocation(posicionFormacion.x, pos.y + velocidad);
		}
	    else { 
		   pos.setLocation(posicionFormacion.x, posicionFormacion.y);
		   inteligencia.setEstado(new EnFormacion(inteligencia, enemigo));
	    }
		enemigo.setGrafico(0);
    }
		
}