package Armas;

import Entidades.Jugador;

public abstract class ArmaJugador extends Arma{
	
	protected Jugador jugador;
	
	//Constructor
	public ArmaJugador(Jugador j) {
		jugador = j;
	}
}
