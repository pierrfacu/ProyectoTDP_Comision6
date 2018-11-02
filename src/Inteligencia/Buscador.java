package Inteligencia;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Estados.Buscar;
import java.util.Random;

public class Buscador extends Inteligencia {	
	
	public Buscador (Enemigo e) {
		super(e);
	}
	
	//Metodos
	
	public void ejecutar() {
		Random rnd = new Random();
		int n=rnd.nextInt(30);
		if (estado.isAtaco() && n<1)
			estado = new Buscar(this,enemigo) ;
		estado.ejecutar();
		
	}
}
