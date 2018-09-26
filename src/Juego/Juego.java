package Juego;

import GUI.gui;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import Entidades.*;
import Entidades.Enemigos.Enemigo;

/**
 * 
 * @author 
 *
 */
public class Juego {
	

	private Nivel nivel; //Gestor de niveles
	
	private Jugador jugador;
	private int puntaje;
	
	private LinkedList<Enemigo> enemigos;
	
	private int contSecMF; //Contador para secuencia de movimiento formacion enemigos, variable temporal.
	
	//Constructor
	public Juego(gui gui) {
		//Creacion de jugador
		jugador = new Jugador(10, 270, 600);
		gui.add(jugador.getGrafico());
		puntaje = 0;
		
		//Creacion del gestor de niveles
		nivel = new Nivel();
		
		//Carga de enemigos
		enemigos = nivel.obtenerEnemigos();
		Iterator<Enemigo> i = enemigos.iterator();
		while(i.hasNext()) {
			gui.add(i.next().getGrafico());
		}	
	}
	
	// Metodos
	
	/**
	 * 
	 * @param p
	 */
	public void sumarPuntaje(int p) {
		puntaje = puntaje + p;
	}
	
	/**
	 * 
	 * @return
	 */
	public int obtenerPuntaje() {
		return puntaje;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean hayEnemigos() {
		return !(enemigos.size() == 0);
	}
	
	/**
	 * 
	 * @param x
	 */
	public void moverJugador(int x) {
		
		switch (x){
			case KeyEvent.VK_LEFT : //Izquierda
				jugador.mover(0);
				break;
			case KeyEvent.VK_RIGHT : //Derecha
				jugador.mover(1);
				break;
		}
		
	}
	
	/**
	 * 
	 */
	public void moverFormacion() {//Provisorio
		int d = 0;
		switch (contSecMF) {
		case 0 : //izquierda
			d = 0;
			break; 
		case 1 : //derecha
			d = 1;
			break;
		case 2 : //derecha
			d = 1;
			break;
		case 3 : //izquierda
			d = 0;
			break;
		}
		
		Iterator<Enemigo> i = enemigos.iterator();
		while(i.hasNext()) {
			i.next().mover(d);
		}
		contSecMF ++;
		if(contSecMF == 4)
			contSecMF = 0;
	}
	//Metodos privados
	
}
