package Inteligencia.Estados;

import java.util.Random;

import Entidades.Enemigos.EnemigoArmado;
import Inteligencia.Inteligencia;

/**
 * 
 * @author Aldana Cas� (104870), Facundo Pierrestegui (99694), Stefania Heirich (106205)
 *
 */

public class TontearDispara extends Tontear {
	
	protected EnemigoArmado enemigo;
	
	//Constructor
	
	public TontearDispara(Inteligencia i, EnemigoArmado enemigo) {
		super(i, enemigo);
		this.enemigo = enemigo;
	}

	//Metodos
	
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
