package Colisionador;

import Entidades.Jugador;
import Entidades.Enemigos.Enemigo;
import Entidades.Obstaculos.Obstaculo;
import Entidades.PowerUps.PowerUp;
import Entidades.Disparos.*;

/**
 * Clase ColisionadorJugador que extiende de Colisionador.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class ColisionadorJugador extends Colisionador{
	
	private Jugador jugador;
	
	//Constructor
	
	public ColisionadorJugador(Jugador j) {
		jugador = j;
	}
	
	//Metodos
	
	public void colisionarJugador(Jugador j) {
		//No hace nada
	}

	public void colisionarEnemigoArmado(Enemigo e) {
		//No hace nada
	}
	
	public void colisionarEnemigoKamikaze(Enemigo e){
		//No hace nada
	}

	public void colisionarObstaculo(Obstaculo o) {
		//No hace nada
	}

	public void colisionarObstaculoBarricada(Obstaculo o) {
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
