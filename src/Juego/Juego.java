package Juego;

import GUI.gui;
import java.awt.Point;
import java.util.Iterator;
import java.util.LinkedList;
import Entidades.*;
import Entidades.Disparos.*;
import Entidades.Enemigos.Enemigo;
import Entidades.PowerUps.PowerUp;

/**
 * 
 * @author 
 *
 */
public class Juego implements JuegoGrafica, JuegoEnemigo, JuegoJugador, JuegoHilo {
	
	private static Juego instance;
	
	private gui gui;
	private Nivel nivel; //Gestor de niveles
	
	private Jugador jugador;
	
	private LinkedList<Enemigo> enemigos;
	private LinkedList<Entidad> entidades;
	
	//Constructor e instancia
	private Juego() {
		
	}
	
	public static Juego getInstance() {
		if(instance == null) {
			instance = new Juego();
		}
		return instance;
	}
	
	// Metodos
	
	public void establecerGrafica(gui g) {
		if(gui == null)
			gui = g;
	}
	
	public void iniciarJuego() {
		//Creacion de jugador
		jugador = new Jugador(new Point(270, 600));
		gui.add(jugador.getGrafico());
		
		//Creacion del gestor de niveles
		nivel = new Nivel();
		
		entidades = new LinkedList<Entidad>();
		
		//Carga de enemigos
		enemigos = nivel.obtenerEnemigos();
		Iterator<Enemigo> i = enemigos.iterator();
		while(i.hasNext()) {
			gui.add(i.next().getGrafico());
		}
	}
	
	public void siguienteNivel() {
		if(nivel.siguienteNivel()) {
			
		}
		else {
			/**
			 * Cargar en la GUI que se gano la partida.
			 */
		}
	}
	
	public void seMurioJugador() {
		/**
		 * Cargar en la GUI GAME OVER.
		 */
	}
	
	public int obtenerPuntaje() {
		return jugador.getPuntaje();
	}
	
	public int obtenerNivel() {
		return nivel.obtenerNivelActual();
	}
	
	public boolean hayEnemigos() {
		return !(enemigos.isEmpty());
	}
	
	public Jugador obtenerJugador() {
		return jugador;		
	}
	
	public LinkedList<Enemigo> obtenerEnemigos(){
		return enemigos;
	}
	
	
	public LinkedList<Entidad> obtenerEntidades(){
		return entidades;
	}
	
	/**
	 * Agrega la entidad recibida como parámetro al juego.
	 * @param e Entidad a agregar.
	 */
	public void agregarEntidad(Entidad e) {
		if(e != null) {
			entidades.add(e);
			gui.add(e.getGrafico());
		}
	}
	
	/**
	 * Agrega el enemigo recibido como parámetro al juego.
	 * @param e Enemigo a agregar.
	 */
	public void agregarEnemigo(Enemigo e) {
		if(e != null) {
			enemigos.add(e);
			gui.add(e.getGrafico());
		}
	}
	
	public void eliminarEntidad(Entidad e) {
		if (e != null) {
			entidades.remove(e);
			gui.remove(e.getGrafico());
			gui.repaint();
		}
	}
	
	public void eliminarEnemigo(Enemigo e) {
		if (e != null) {
			enemigos.remove(e);
			gui.remove(e.getGrafico());
			gui.repaint();
		}
	}
	
	public void addDisparoEnemigo(DisparoEnemigo dE) {
		if(dE != null) {
			entidades.add(dE);
			gui.add(dE.getGrafico());
		}
	}
	
	public void addPowerUp(PowerUp pU) {
		if(pU != null) {
			entidades.add(pU);
			gui.add(pU.getGrafico());
		}
	}
	
	public void addDisparoJugador(DisparoJugador dJ) {
		if(dJ != null) {
			entidades.add(dJ);
			gui.add(dJ.getGrafico());
		}
	}
	
	//Metodos privados
	
}
