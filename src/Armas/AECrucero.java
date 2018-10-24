package Armas;

import java.awt.Point;

import Entidades.Disparos.DECrucero;
import Entidades.Enemigos.EnemigoArmado;
import Juego.JuegoEnemigo;

public class AECrucero extends ArmaEnemigo{
	 
	//Constructor
	public AECrucero(EnemigoArmado e) {
		super(e);
	}
	
	//Metodos
	
	public void accionar() {
		JuegoEnemigo juego = JuegoEnemigo.getInstance();
		Point posEnemigo = enemigo.getPosition();
		int altE = enemigo.altoEntidad();
		int ancE = enemigo.anchoEntidad();
		Point p = new Point((posEnemigo.x + altE) + (ancE / 2), posEnemigo.y); 
		DECrucero disp = new DECrucero(p);
		juego.addDisparoEnemigo(disp);
	}
}