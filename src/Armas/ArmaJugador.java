package Armas;

import Entidades.Jugador;

/**
 * Clase abstracta ArmaJugador que extiende de Arma.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public abstract class ArmaJugador extends Arma{
	
	protected Jugador jugador;
	
	//Constructor
	protected ArmaJugador(Jugador j) {
		super();
		jugador = j;
	}
}
