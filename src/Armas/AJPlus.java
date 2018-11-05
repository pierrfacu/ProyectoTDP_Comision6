package Armas;

import java.awt.Point;
import Entidades.Jugador;
import Entidades.Disparos.DJPlus;
import Juego.JuegoJugador;

/**
 * Clase AJPlus que extiende de ArmaJugador.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class AJPlus extends ArmaJugador {
	
	//Constructor
	public AJPlus(Jugador j) {
		super(j);
	}

	//Metodos
	public void accionar() {
		JuegoJugador juego = JuegoJugador.getInstance();
		Point posJugador = jugador.getPosition();
		int ancJ = jugador.anchoEntidad();
		Point p = new Point(posJugador.x + (ancJ / 2) - 2, posJugador.y + 2);
		DJPlus disp = new DJPlus(p);
		disp.establecerDanio(disp.obtenerDanio()*danioExtra);
		juego.addDisparoJugador(disp);
	}	
}
