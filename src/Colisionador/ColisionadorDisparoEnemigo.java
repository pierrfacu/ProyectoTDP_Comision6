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
		j.restarVida(disparo.obtenerDanio());
		j.sumarPuntaje(disparo.getPuntaje());
		disparo.restarVida(100);		
	}

	public void colisionarEnemigo(Enemigo e) {
		//No hace nada
	}

	public void colisionarObstaculo(Obstaculo o) {
		disparo.restarVida(100);
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
