package Juego;

import Entidades.Jugador;
import Entidades.Disparos.DisparoEnemigo;
import GUI.gui;

/**
 * Interfaz JuegoEnemigo.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public interface JuegoEnemigo {
	
	/**
	 * Devuelve la instancia del juego para las entidades de enemigos.
	 * @return instancia del juego.
	 */
	public static JuegoEnemigo getInstance() {
		return Juego.getInstance();
	}
	
	/**
	 * Agrega al juego el disparo generado por el enemigo.
	 * @param dE disparo enemigo.
	 */
	public void addDisparoEnemigo(DisparoEnemigo dE);
	
	/**
	 * Devuelve la interfaz grafica del juego.
	 * @return interfaz grafica.
	 */
	public gui obtenerGrafica();
	
	/**
	 * Devuelve el jugador de la partida.
	 * @return jugador.
	 */
	public Jugador obtenerJugador();
}
