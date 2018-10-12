package Colisionador;

import Entidades.Jugador;
import Entidades.Disparos.*;
import Entidades.Enemigos.Enemigo;
import Entidades.Obstaculos.Obstaculo;
import Entidades.PowerUps.PowerUp;

public class ColisionadorDisparoEnemigo extends Colisionador{
	
	private DisparoEnemigo disparo;
	
	//Constructor
	public ColisionadorDisparoEnemigo(DisparoEnemigo d) {
		disparo = d;
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
