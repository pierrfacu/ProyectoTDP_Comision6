package Juego;

import Entidades.Jugador;
import Entidades.Disparos.DisparoJugador;
import GUI.gui;

/**
 * 
 * @author 
 *
 */
public interface JuegoJugador {

	/**
	 * Devuelve la instancia del juego para la entidad jugador.
	 * @return
	 */
	public static JuegoJugador getInstance() {
		return Juego.getInstance();
	}
	
	/**
	 * Agrega al juego el disparo generado por el jugador.
	 * @param dJ
	 */
	public void addDisparoJugador(DisparoJugador dJ);
	
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