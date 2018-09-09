package Juego;

import GUI.gui;

import java.awt.event.KeyEvent;
import java.util.LinkedList;
import Entidades.*;

/**
 * 
 * @author 
 *
 */
public class Juego {

	private Jugador jugador;
	private LinkedList<Enemigos> enemigos;
	private Nivel nivel;
	
	
	//Constructor
	public Juego(gui gui) {
		//Creacion de jugador
		jugador = new Jugador(10, 270, 600);
		gui.add(jugador.getGrafico());
		
		//Creacion del gestor de niveles
		nivel = new Nivel();
		
		//Carga de enemigos
		enemigos = nivel.obtenerEnemigos();
	
	}
	
	// Metodos
	
	/**
	 * 
	 * @return
	 */
	public boolean hayEnemigos() {
		//return !(enemigos.size() == 0);
		return true; //Sacar cuando ya este la carga de enemigos.
	}
	
	/**
	 * 
	 * @param x
	 */
	public void moverJugador(int x) {
		int dir = 0;
		
		switch (x){
			case KeyEvent.VK_LEFT : //Izquierda
				dir = 0;
				break;
			case KeyEvent.VK_RIGHT : //Derecha
				dir = 1;
				break;
		}
		jugador.mover(dir);
	}
	
	//Metodos privados
	
}
