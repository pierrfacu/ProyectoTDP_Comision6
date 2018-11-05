package Hilos;

import java.util.HashMap;
import java.util.LinkedList;
import Entidades.Enemigos.Enemigo;
import Inteligencia.Congelado;
import Inteligencia.Inteligencia;
import Juego.JuegoHilo;

/**
 * Clase HiloCongelar que extiende de Thread.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class HiloCongelar extends Thread{
	
	//Constructor
	public HiloCongelar(){
	}
	
	//Metodos
	
	public void run() {
		JuegoHilo juego = JuegoHilo.getInstance();
		LinkedList<Enemigo> enemigos = juego.obtenerEnemigos();
		HashMap<Enemigo, Inteligencia> backupInt = new HashMap <Enemigo, Inteligencia>();
		
		for(Enemigo e : enemigos) {
			backupInt.put(e, e.obtenerInteligencia());
			e.establecerInteligencia(new Congelado(e));
			e.setGrafico(1);
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		enemigos = juego.obtenerEnemigos();
		for(Enemigo e : enemigos) {
			e.establecerInteligencia(backupInt.get(e));
			e.setGrafico(0);
		}		
	}
}
