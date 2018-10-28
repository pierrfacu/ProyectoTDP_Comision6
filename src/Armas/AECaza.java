package Armas;

import java.awt.Point;

import Entidades.Disparos.DECaza;
import Entidades.Enemigos.EnemigoArmado;
import Juego.JuegoEnemigo;

public class AECaza extends ArmaEnemigo{
	
	//Constructor
	public AECaza(EnemigoArmado e) {
		super(e);
	}
	
	//Metodos
	
	public void accionar() {
		JuegoEnemigo juego = JuegoEnemigo.getInstance();
		Point posEnemigo = enemigo.getPosition();
		int altE = enemigo.altoEntidad();
		int ancE = enemigo.anchoEntidad();
		Point p = new Point((posEnemigo.x + altE) + (ancE / 2), posEnemigo.y); 
		DECaza disp = new DECaza(p);
		disp.establecerDanio(disp.obtenerDanio()*danioExtra);
		juego.addDisparoEnemigo(disp);
	}
}