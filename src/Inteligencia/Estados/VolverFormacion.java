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
		pos.setLocation(posicionFormacion.x, 0);
		if(posicionFormacion.y > pos.y)
			pos.setLocation(posicionFormacion.x, pos.y + velocidad);
		enemigo.setGrafico(0);
	}

}
