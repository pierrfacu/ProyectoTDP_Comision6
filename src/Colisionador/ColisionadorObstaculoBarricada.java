package Colisionador;

import Entidades.Jugador;
import Entidades.Disparos.DisparoEnemigo;
import Entidades.Disparos.DisparoJugador;
import Entidades.Enemigos.Enemigo;
import Entidades.Obstaculos.Obstaculo;
import Entidades.PowerUps.PowerUp;

/**
 * Clase ColisionadorObstaculoBarricada que extiende de Colisionador.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class ColisionadorObstaculoBarricada extends Colisionador{
	
	private Obstaculo obstaculo;
	
	//Constructor
	public ColisionadorObstaculoBarricada(Obstaculo o) {
		obstaculo = o;
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
