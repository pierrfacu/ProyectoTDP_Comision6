package Colisionador;

import Entidades.Jugador;
import Entidades.Enemigos.Enemigo;
import Entidades.Obstaculos.Obstaculo;
import Entidades.PowerUps.PowerUp;
import Entidades.Disparos.*;

public class ColisionadorDisparoJugador extends Colisionador {
	
	private DisparoJugador disparo;
	
	//Constructor
	public ColisionadorDisparoJugador(DisparoJugador d) {
		disparo = d;
	}
	
	//Metodos
	
	public void colisionarJugador(Jugador j) {
		//No hace nada
	}

	public void colisionarEnemigo(Enemigo e) {
		e.restarVida(disparo.obtenerDaño());
		disparo.recibirPuntaje(e.getPuntaje());
		disparo.restarVida(100);
	}

	public void colisionarObstaculo(Obstaculo o) {
		o.restarVida(disparo.obtenerDaño());
		disparo.recibirPuntaje(o.getPuntaje());
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
