package Colisionador;

import Entidades.Jugador;
import Entidades.Enemigos.Enemigo;
import Entidades.Obstaculos.Obstaculo;
import Entidades.PowerUps.PowerUp;
import Entidades.Disparos.*;

public class ColisionadorPowerUp extends Colisionador{
	
	private PowerUp powerUp;
	
	//Constructor
	
	public ColisionadorPowerUp(PowerUp pU) {
		powerUp = pU;
	}
	
	//Metodos
	
	public void colisionarJugador(Jugador j) {
		/**
		 * Imprementar darle el power up al jugador
		 */
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
