package Inteligencia;

import java.util.Random;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Estados.Tontear;

public class Mareado extends Inteligencia {
	
	
	public Mareado(Enemigo e) {
		super (e);
	}
	
	//Metodos
	
	public void ejecutar() {
		
		Random rnd = new Random();
		int n=rnd.nextInt(30);
		if (estado.isAtaco() && n<1)
			estado = new Tontear(this,enemigo) ;
		estado.ejecutar();
		
	}
}
