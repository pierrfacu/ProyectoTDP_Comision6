package Armas;

import java.awt.Point;
import Entidades.Jugador;
import Entidades.Disparos.DJSimple;
import Juego.JuegoJugador;

/**
 * Clase AJSimple que extiende de ArmaJugador.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class AJSimple extends ArmaJugador {
	
	//Constructor
	public AJSimple(Jugador j) {
		super(j);
	}
	
	//Metodos
	
	public void accionar() {
		JuegoJugador juego = JuegoJugador.getInstance();
		Point posJugador = jugador.getPosition();
		int ancJ = jugador.anchoEntidad();
		Point p = new Point(posJugador.x + (ancJ / 2), posJugador.y + 2);
		DJSimple disp = new DJSimple(p);
		disp.establecerDanio(disp.obtenerDanio()*danioExtra);
		juego.addDisparoJugador(disp);
	}
}