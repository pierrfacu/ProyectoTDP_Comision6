package Juego;

import Entidades.Disparos.DisparoEnemigo;
import Entidades.PowerUps.PowerUp;

/**
 * 
 * @author
 *
 */
public interface JuegoEnemigo {
	
	/**
	 * Devuelve la instancia del juego para lass entidades de enemigos.
	 * @return instancia del juego.
	 */
	public static JuegoEnemigo getInstance() {
		return Juego.getInstance();
	}
	
	/**
	 * Agrega al juego el disparo generado por un enemigo.
	 * @param dE disparo enemigo.
	 */
	public void addDisparoEnemigo(DisparoEnemigo dE);
	
	/**
	 * Agrega el juego el power up que entregaba el enemigo al morir.
	 * @param pU power up
	 */
	public void addPowerUp(PowerUp pU);
}
