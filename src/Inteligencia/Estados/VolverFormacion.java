package Inteligencia.Estados;

import java.awt.Point;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Inteligencia;

public class VolverFormacion extends Estado{
	
	public VolverFormacion(Inteligencia i, Enemigo enemigo) {
		super (i,enemigo);
	}
	
	public void ejecutar(){
		
		Point posicionFormacion = inteligencia.getPosFormacion();
		
		Point pos=enemigo.getPosition();
		if(pos.y < posicionFormacion.y) {
			if(pos.y + velocidad < posicionFormacion.y)
				pos.setLocation(posicionFormacion.x, posicionFormacion.y + velocidad);
			else {
				pos.setLocation(posicionFormacion.x, posicionFormacion.y);
		        inteligencia.setEstado(new EnFormacion(inteligencia, enemigo));
			}
		}
		/*pos.setLocation(posicionFormacion.x, posicionFormacion.y);
		if(posicionFormacion.y > pos.y)
			pos.setLocation(posicionFormacion.x, pos.y + velocidad);*/
		enemigo.setGrafico(0);
	}

}
