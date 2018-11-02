package Inteligencia.Estados;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Inteligencia;

public abstract class Estado {
	
	protected Inteligencia inteligencia;
	protected Enemigo enemigo;
	protected int velocidad;
	
	protected Estado(Inteligencia i, Enemigo e) {
		inteligencia = i;
		enemigo = e;
		velocidad = e.getVelocidad();
	}
	
	public boolean isAtaco() {
    	return false;
    }
	
	public abstract void ejecutar();
	

	
}
