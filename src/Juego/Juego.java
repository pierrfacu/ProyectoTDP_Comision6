package Juego;

import GUI.gui;
import java.util.LinkedList;
import Entidades.*;

public class Juego {

	private Jugador jugador;
	private LinkedList<Enemigos> enemigos;
	private Nivel nivel;
	
	
	//Contructor
	public Juego(gui gui) {
		//Creacion de jugador
		jugador = new Jugador();
		
		//Creacion del gestor de niveles
		nivel = new Nivel();
		
		//Carga de enemigos
		enemigos = nivel.obtenerEnemigos();
	
	}
	
	// Metodos
	
	/**
	 * 
	 * @param x
	 */
	public void moverJugador(int x) {
		
	}
	
	//Metodos privados
	
}
