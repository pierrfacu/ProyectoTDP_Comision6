package Juego;

import Entidades.Jugador;
import GUI.gui;

/**
 * Interfaz JuegoGrafica.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public interface JuegoGrafica {
	
	/**
	 * Devuelve la instancia del juego para la grafica.
	 * @return instancia del juego.
	 */
	public static JuegoGrafica getInstance() {
		return Juego.getInstance();
	};
	
	/**
	 * Devuelve el puntaje acumulado por el jugador en la partida.
	 * @return Puntaje jugador.
	 */
	public int obtenerPuntaje();
	
	/**
	 * Devuelve el nivel en el que se encuentra el juego.
	 * @return nivel actual.
	 */
	public int obtenerNivel();
	
	/**
	 * Devuelve el jugador de la partida.
	 * @return jugador.
	 */
	public Jugador obtenerJugador();
	
	/**
	 * Establece la grafica del juego.
	 * @param g grafica a establecer.
	 */
	public void establecerGrafica(gui g);
	
	/**
	 * Inicia el juego en el primer nivel.
	 */
	public void iniciarJuego();
}
