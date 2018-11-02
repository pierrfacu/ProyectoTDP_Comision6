package Colisionador;

import Entidades.*;
import Entidades.Disparos.*;
import Entidades.Enemigos.Enemigo;
import Entidades.Obstaculos.Obstaculo;
import Entidades.PowerUps.PowerUp;

public abstract class Colisionador {
		
	public abstract void colisionarJugador(Jugador j);
	
	public abstract void colisionarEnemigoArmado(Enemigo e);
	
	public abstract void colisionarEnemigoKamikaze(Enemigo e);
	
	public abstract void colisionarObstaculo(Obstaculo o);
	
	public abstract void colisionarObstaculoBarricada(Obstaculo o);
	
	public abstract void colisionarPowerUp(PowerUp pU);
	
	public abstract void colisionarDisparoJugador(DisparoJugador dJ);
	
	public abstract void colisionarDisparoEnemigo(DisparoEnemigo dE);
	
}