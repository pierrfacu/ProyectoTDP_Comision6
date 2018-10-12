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
		
	}

	public void colisionarEnemigo(Enemigo e) {
		
	}

	public void colisionarObstaculo(Obstaculo o) {
		
	}

	public void colisionarPowerUp(PowerUp pU) {
		
	}

	public void colisionarDisparoJugador(DisparoJugador dJ) {
		
	}

	public void colisionarDisparoEnemigo(DisparoEnemigo dE) {
		
	}
}
