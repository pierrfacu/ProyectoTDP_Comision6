package Colisionador;

import Entidades.Jugador;
import Entidades.Enemigos.Enemigo;
import Entidades.Obstaculos.Obstaculo;
import Entidades.PowerUps.PowerUp;
import Entidades.Disparos.*;

public class ColisionadorEnemigo extends Colisionador{
	
	private Enemigo enemigo;
	
	//Constructor
	public ColisionadorEnemigo(Enemigo e) {
		enemigo = e;
	}
	
	//Metodos

	public void colisionarJugador(Jugador j) {
		j.restarVida(enemigo.obtenerDanio());
		enemigo.restarVida(j.obtenerDanio());
		j.sumarPuntaje(-enemigo.getPuntaje());
	}

	public void colisionarEnemigo(Enemigo e) {
		//No hace nada
	}

	public void colisionarObstaculo(Obstaculo o) {
		/**
		 * Imprementar esquivarlo. Charlarlo.
		 */
	}

	public void colisionarPowerUp(PowerUp pU) {
		//No hace nada
	}

	public void colisionarDisparoJugador(DisparoJugador dJ) {
		//No hace nada
	}

	public void colisionarDisparoEnemigo(DisparoEnemigo dE) {
		//No hace nada
	}
}
