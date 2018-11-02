package Inteligencia.Estados;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Inteligencia;

public abstract class Estado {
	
	protected Inteligencia inteligencia;
	protected Enemigo enemigo;
	
	protected Estado(Inteligencia i, Enemigo e) {
		inteligencia = i;
		enemigo = e;
	}
	
	public abstract void ejecutar();
	
}
