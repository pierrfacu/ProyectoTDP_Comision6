package Colisionador;

import Entidades.Jugador;
import Entidades.Disparos.DisparoEnemigo;
import Entidades.Disparos.DisparoJugador;
import Entidades.Enemigos.Enemigo;
import Entidades.Obstaculos.Obstaculo;
import Entidades.PowerUps.PowerUp;

/**
 * Clase ColisionadorEnemigoKamikaze que extiende de Colisionador.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class ColisionadorEnemigoKamikaze extends Colisionador{
	
	private Enemigo enemigo;
	
	//Constructor
	public ColisionadorEnemigoKamikaze(Enemigo e) {
		enemigo = e;;
	}
	
	//Metodos
	
	public void colisionarJugador(Jugador j) {
		if(j.tengoProteccion()) {
			enemigo.restarVida(100);
			j.activarEscudo();
			j.sumarPuntaje(enemigo.getPuntaje());
		}		
		else{
			j.restarVida(enemigo.obtenerDanio());
			enemigo.restarVida(j.obtenerDanio());
			j.sumarPuntaje(-enemigo.getPuntaje());
		}
			
	}

	public void colisionarEnemigoArmado(Enemigo e) {
		//No hace nada
	}
		
	public void colisionarEnemigoKamikaze(Enemigo e){
		//No hace nada
	}
	
	public void colisionarObstaculo(Obstaculo o) {
		o.restarVida(enemigo.obtenerDanio());
		enemigo.restarVida(o.obtenerDanio());
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