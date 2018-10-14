package Juego;

import java.util.LinkedList;
import Entidades.*;
import Entidades.Enemigos.Enemigo;

/**
 * 
 * @author
 *
 */
public class HiloPrincipal extends Thread{
	
	private Juego juego;
	
	private LinkedList<Enemigo> enemigos;
	private LinkedList<Entidad> entidades;
	private LinkedList<Enemigo> elimEnemigos;
	private LinkedList<Entidad> elimEntidades;

	public HiloPrincipal(Juego j){
		juego = j;
		
		enemigos = juego.obtenerEnemigos();
		entidades = juego.obtenerEntidades();
		elimEnemigos = new LinkedList<Enemigo>();
		elimEntidades = new LinkedList<Entidad>();
	}
	
	//Metodos
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			colisionarEnemigos();
			colisionarEntidades();
			elimEnemigos();
			elimEntidades();
			
			
		}
		
	}

	//Metodos Privados

	private void colisionarEnemigos() {
		for(Enemigo enem : enemigos) {
			enem.mover();
			
			//Colisionar entidades
			for(Entidad ent: entidades) {
				
			}
			
			//colisionar Jugador
			
			//agregar enemigo sin vida a eliminar
			if(enem.cantVidas() <= 0) {
				elimEnemigos.add(enem);
			}
		}
	}

	private void colisionarEntidades() {
		for(Entidad ent : entidades) {
			ent.mover();
			
			//Colisionar entidades
			for(Enemigo enem : enemigos) {
				
			}
			
			//colisionar Jugador
			
			//agregar entidad sin vida a eliminar
			if(ent.cantVidas() <= 0) {
				elimEntidades.add(ent);
			}
		}
	}

	private void elimEnemigos() {
		for(Enemigo enem : elimEnemigos) {
			juego.eliminarEnemigo(enem);
		}
	}
	
	private void elimEntidades() {
		for(Entidad ent : elimEntidades) {
			juego.eliminarEntidad(ent);
		}
	}
}