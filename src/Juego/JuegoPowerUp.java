package Juego;

import java.util.LinkedList;
import Entidades.Jugador;
import Entidades.Enemigos.Enemigo;
import GUI.gui;

/**
 * Interfaz JuegoPowerUp.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public interface JuegoPowerUp {
	
	/**
	 * Devuelve la instancia del juego para el hilo.
	 * @return instancia del juego.
	 */
	public static JuegoPowerUp getInstance() {
		return Juego.getInstance();
	}
	
	/**
	 * Devuelve el jugador de la partida.
	 * @return jugador.
	 */
	public Jugador obtenerJugador();
	
	/**
	 * Devuelve la interfaz grafica del juego.
	 * @return interfaz grafica.
	 */
	public gui obtenerGrafica();
	
	/**
	 * Devuelve la colección de enemigos.
	 * @return Coleccion de enemigos.
	 */
	public LinkedList<Enemigo> obtenerEnemigos();
}
