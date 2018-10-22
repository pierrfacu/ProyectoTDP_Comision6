package Juego;

import Entidades.Disparos.DisparoJugador;

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
}