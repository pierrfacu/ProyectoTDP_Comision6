package Colisionador;

import Entidades.Jugador;
import Entidades.Enemigos.Enemigo;
import Entidades.Obstaculos.Obstaculo;
import Entidades.PowerUps.PowerUp;
import Entidades.Disparos.*;

public class ColisionadorObstaculo extends Colisionador {
	
	private Obstaculo obstaculo;
	
	//Constructor
	
	public ColisionadorObstaculo(Obstaculo o) {
		obstaculo = o;
	}
	
	//Metodos
	
	public void colisionarJugador(Jugador j) {
		//No hace nada
	}

	public void colisionarEnemigo(Enemigo e) {
		//No hace nada
	}

	public void colisionarObstaculo(Obstaculo o) {
		//No hace nada
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
