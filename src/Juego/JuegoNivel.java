package Juego;

import Entidades.Entidad;
import Entidades.Enemigos.Enemigo;

/**
 * Interfaz JuegoNivel.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public interface JuegoNivel {
	
	/**
	 * Devuelve la instancia del juego para el gestor de niveles.
	 * @return instancia del juego.
	 */
	public static JuegoNivel getInstance() {
		return Juego.getInstance();
	}
	
	/**
	 * Agrega la entidad recibida como parámetro al juego.
	 * @param e Entidad a agregar.
	 */
	public void agregarEntidad(Entidad e);
	
	/**
	 * Agrega el enemigo recibido como parámetro al juego.
	 * @param e Enemigo a agregar.
	 */
	public void agregarEnemigo(Enemigo e);
}
