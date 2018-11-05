package Colisionador;

import Entidades.Jugador;
import Entidades.Enemigos.Enemigo;
import Entidades.Obstaculos.Obstaculo;
import Entidades.PowerUps.PowerUp;
import Juego.JuegoJugador;
import Entidades.Disparos.*;

/**
 * Clase ColisionadorDisparoJugador que extiende de Colisionador.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
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

	public void colisionarEnemigoArmado(Enemigo e) {
		if(!disparo.estoyMuerto() && !e.estoyMuerto()) {
			e.restarVida(disparo.obtenerDanio());
			if(e.estoyMuerto()) {
				JuegoJugador juego = JuegoJugador.getInstance();
				Jugador jugador = juego.obtenerJugador();
				jugador.sumarPuntaje(e.getPuntaje());
			}
			disparo.restarVida(100);
		}
	}	
	
	public void colisionarEnemigoKamikaze(Enemigo e){
		if(!disparo.estoyMuerto() && !e.estoyMuerto()) {
			e.restarVida(disparo.obtenerDanio());
			if(e.estoyMuerto()) {
				JuegoJugador juego = JuegoJugador.getInstance();
				Jugador jugador = juego.obtenerJugador();
				jugador.sumarPuntaje(e.getPuntaje());
			}
			disparo.restarVida(100);
		}
	}
	
	public void colisionarObstaculo(Obstaculo o) {
		if(!disparo.estoyMuerto() && !o.estoyMuerto()) {
			o.restarVida(disparo.obtenerDanio());
			if(o.estoyMuerto()) {
				JuegoJugador juego = JuegoJugador.getInstance();
				Jugador jugador = juego.obtenerJugador();
				jugador.sumarPuntaje(o.getPuntaje());
			}
			disparo.restarVida(100);
		}
	}
	
	public void colisionarObstaculoBarricada(Obstaculo o) {
		if(!disparo.estoyMuerto() && !o.estoyMuerto()) {
			o.restarVida(disparo.obtenerDanio());
			if(o.estoyMuerto()) {
				JuegoJugador juego = JuegoJugador.getInstance();
				Jugador jugador = juego.obtenerJugador();
				jugador.sumarPuntaje(o.getPuntaje());
			}
			disparo.restarVida(100);
		}
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
