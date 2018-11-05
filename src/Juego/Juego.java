package Juego;

import GUI.gui;
import java.awt.Point;
import java.util.LinkedList;
import Entidades.*;
import Entidades.Disparos.*;
import Entidades.Enemigos.Enemigo;
import Entidades.PowerUps.PowerUp;

/**
 * Clase Juego que implementa a JuegoGrafica, JuegoEnemigo, JuegoJugador, JuegoHilo, JuegoPowerUp, JuegoNivel.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class Juego implements JuegoGrafica, JuegoEnemigo, JuegoJugador, JuegoHilo, JuegoPowerUp, JuegoNivel {
	
	private static Juego instance;
	
	private gui gui;
	private Nivel gestorNivel; //Gestor de niveles
	
	private Jugador jugador;
	private LinkedList<DisparoJugador> dispJugEspera;
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
		
		jugador = new Jugador(new Point(280, 600));
		gui.add(jugador.getGrafico());
		dispJugEspera = new LinkedList<DisparoJugador>();
		
		entidades = new LinkedList<Entidad>();
		enemigos = new LinkedList<Enemigo>();
		
		gestorNivel = new Nivel();
		gestorNivel.cargarEntidadesAlJuego();
		
	}
	
	public void siguienteNivel() {
		if(gestorNivel.siguienteNivel()) {
			jugador.pausarDisparos();
			muerteSubita();
			gestorNivel.cargarEntidadesAlJuego();
			jugador.pausarDisparos();
		}
		else {
			gui.partidaFinalizada(true);
		}
	}
	
	public void seMurioJugador() {
		gui.partidaFinalizada(false);
	}
	
	public int obtenerPuntaje() {
		return jugador.getPuntaje();
	}
	
	public int obtenerNivel() {
		return gestorNivel.obtenerNivelActual();
	}
	
	public boolean hayEnemigos() {
		return !(enemigos.isEmpty());
	}
	
	public gui obtenerGrafica() {
		return gui;
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
	
	public void agregarEntidad(Entidad e) {
		if(e != null) {
			entidades.add(e);
			gui.add(e.getGrafico());
		}
	}
	
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
			//gui.repaint();
		}
	}
	
	public void eliminarEnemigo(Enemigo e) {
		if (e != null) {
			if(e.doyPowerUp()) {
				PowerUp pU = e.obtenerPowerUp();
				agregarEntidad(pU);
			}
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
	
	public void addDisparoJugador(DisparoJugador dJ) {
		if(dJ != null) {
			dispJugEspera.add(dJ);
		}
	}
	
	public void cargarDisparosJugador() {
		LinkedList<DisparoJugador> listClon = (LinkedList<DisparoJugador>) dispJugEspera.clone();
		dispJugEspera.clear();
		for(DisparoJugador dJ : listClon) {
			entidades.add(dJ);
			gui.add(dJ.getGrafico());
		}
	}
	
	//Metodos privados
	
	/**
	 * Quita del juego todas las entidades que no deben estar luego de terminar un nivel.
	 * Se quitan todos los disparos y obstaculos que no se hayan destruido.
	 * Los Power Ups no son eliminados.
	 */
	public void muerteSubita() {
		for(Entidad ent : entidades) {
			ent.muerteSubita();
			if(ent.estoyMuerto())
				eliminarEntidad(ent);
		}
	}
}
