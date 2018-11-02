package Inteligencia;

import java.awt.Point;
import java.util.Random;

import Entidades.Enemigos.Enemigo;
import Entidades.Enemigos.EnemigoArmado;
import Juego.JuegoEnemigo;

public class Standard extends Inteligencia{
	
	    EnemigoArmado enemigo;
		//Constructor
	public Standard(EnemigoArmado e) {
		super(e);
		this.enemigo = e;
	}

	//Metodos
	public void atacar() {
		
		ejecutarDisparo();
		ejecutarMovimientoAleatorio();
		
	}	
	
	//Metodos privados
	private void ejecutarDisparo() {
	
		JuegoEnemigo juego = JuegoEnemigo.getInstance();
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
