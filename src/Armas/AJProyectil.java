package Armas;

import java.awt.Point;
import Entidades.Jugador;
import Entidades.Disparos.DJProyectil;
import Juego.JuegoJugador;

/**
 * Clase AJProyectil que extiende ArmaJugador.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class AJProyectil extends ArmaJugador {
	
	//Constructor
	public AJProyectil(Jugador j) {
		super(j);
	}

	//Metodos
	public void accionar() {
		JuegoJugador juego = JuegoJugador.getInstance();
		Point posJugador = jugador.getPosition();
		int ancJ = jugador.anchoEntidad();
		Point p = new Point(posJugador.x + (ancJ / 2) - 4, posJugador.y + 2); 
		DJProyectil disp = new DJProyectil(p);
		disp.establecerDanio(disp.obtenerDanio()*danioExtra);
		juego.addDisparoJugador(disp);
	}

}
