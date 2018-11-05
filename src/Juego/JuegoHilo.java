package Juego;

import java.util.LinkedList;
import Entidades.Entidad;
import Entidades.Jugador;
import Entidades.Enemigos.Enemigo;

/**
 * Interfaz JuegoHilo.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public interface JuegoHilo {
	
	/**
	 * Devuelve la instancia del juego para el hilo.
	 * @return instancia del juego.
	 */
	public static JuegoHilo getInstance() {
		return Juego.getInstance();
	}
	
	/**
	 * Devuelve el jugador de la partida.
	 * @return jugador.
	 */
	public Jugador obtenerJugador();
	

	/**
	 * El juego termina estableciendo que se perdio la partida.
	 * Requiere que se verifique si el jugador esta muerto.
	 */
	public void seMurioJugador();
	
	/**
	 * Deuelve verdadero si hay enemigos, caso contrario, falso.
	 * @return Verdadero si hay enemigos, caso contrario, falso.
	 */
	public boolean hayEnemigos();
	
	/**
	 * Devuelve la colección de enemigos.
	 * @return Coleccion de enemigos.
	 */
	public LinkedList<Enemigo> obtenerEnemigos();
	
	/**
	 * Devuelve la colección de entidades.
	 * @return Colección de entidades.
	 */
	public LinkedList<Entidad> obtenerEntidades();
	
	/**
	 * Elimina el enemigo del juego.
	 * @param e Enemigo a eliminar.
	 */
	public void eliminarEnemigo(Enemigo e);
	
	/**
	 * Elimina la entidad del juego.
	 * @param e Entidad a eliminar.
	 */
	public void eliminarEntidad(Entidad e);
	
	/**
	 * Avanza el juego al siguiente nivel, si ya se jugo el ultimo, se termina la partida.
	 */
	public void siguienteNivel();
	
	/**
	 * Carga los disparos del jugador al juego.
	 */
	public void cargarDisparosJugador();
}
