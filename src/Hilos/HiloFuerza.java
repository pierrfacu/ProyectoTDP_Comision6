package Hilos;

import Armas.Arma;
import Juego.JuegoHilo;

/**
 * Clase HiloFuerza que extiende de Thread.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class HiloFuerza extends Thread{
	
	//Constructor
	public HiloFuerza(){
	}
	
	//Metodos
	
	public void run() {
		JuegoHilo juego = JuegoHilo.getInstance();
		
		juego.obtenerGrafica().setFuerza(true);
		
		Arma a = juego.obtenerJugador().obtenerArma();
		a.aumentarDanio(2);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		a.aumentarDanio(1);
		
		juego.obtenerGrafica().setFuerza(false);
	}
}
