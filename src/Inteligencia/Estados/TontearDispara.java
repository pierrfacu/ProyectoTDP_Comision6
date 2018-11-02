package Inteligencia.Estados;

import java.util.Random;

import Entidades.Enemigos.EnemigoArmado;
import Inteligencia.Inteligencia;

public class TontearDispara extends Tontear {
	protected EnemigoArmado enemigo;
	
	public TontearDispara(Inteligencia i, EnemigoArmado enemigo) {
		super(i, enemigo);
		this.enemigo = enemigo;
	}

	public void ejecutar() {
		super.ejecutar();
		ejecutarDisparo();		
	}	
	
	//Metodos privados
	private void ejecutarDisparo() {
	
		Random rnd =new Random ();
		int dir =rnd.nextInt(2);
		
		switch(dir) {
		
		case 0: //no hace nada
			break;
		case 1:
			this.enemigo.disparar(); 
		    break;
		}
	}
}
