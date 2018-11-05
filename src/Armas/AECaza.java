package Armas;

import java.awt.Point;

import Entidades.Disparos.DECaza;
import Entidades.Enemigos.EnemigoArmado;
import Juego.JuegoEnemigo;

/**
 * Clase AECaza que extiende de ArmaEnemigo.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
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
		Point p = new Point(posEnemigo.x + (ancE / 2), posEnemigo.y + altE); 
		DECaza disp = new DECaza(p);
		disp.establecerDanio(disp.obtenerDanio()*danioExtra);
		juego.addDisparoEnemigo(disp);
	}
}