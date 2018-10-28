package Inteligencia;

import Entidades.Enemigos.Enemigo;

public class Mareado extends Inteligencia {
	
	
	public Mareado(Enemigo e) {
		super (e);
	}
	
	//Metodos
	
	public void atacar() {
		
		ejecutarMovimientoAleatorio();
		
	}
}
