package Juego;

import Entidades.Jugador;
import Entidades.PowerUps.PowerUp;
import GUI.gui;

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
}
