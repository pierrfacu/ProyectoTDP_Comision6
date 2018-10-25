package Inteligencia;

import java.awt.Point;
import java.util.Random;

import Entidades.Enemigos.Enemigo;
import Juego.JuegoEnemigo;

public class Mareado extends Inteligencia {
	
	
	public Mareado(Enemigo e) {
		super (e);
	}
	
	//Metodos
	
	public void atacar() {
		
		ejecutarMovimientoAleatorio();
		
	}
}
