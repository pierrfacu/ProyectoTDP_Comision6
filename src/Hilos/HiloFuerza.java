package Hilos;

import Armas.Arma;
import Juego.JuegoHilo;

public class HiloFuerza extends Thread{
	
	//Constructor
	public HiloFuerza(){
	}
	
	//Metodos
	
	public void run() {
		JuegoHilo juego = JuegoHilo.getInstance();
		Arma a = juego.obtenerJugador().obtenerArma();
		a.aumentarDanio(2);
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		a.aumentarDanio(1);
	}
}
