package Armas;

import java.awt.Point;

import Entidades.Jugador;
import Entidades.Disparos.DJProyectil;
import Juego.JuegoJugador;

public class AJProyectil extends ArmaJugador {
	
	//Constructor
	public AJProyectil(Jugador j) {
		super(j);
	}

	//Metodos
	public void accionar() {
		JuegoJugador juego = JuegoJugador.getInstance();
		Point posJugador = jugador.getPosition();
		Point p = new Point(posJugador.x + (jugador.anchoEntidad() / 2), posJugador.y); 
		DJProyectil disp = new DJProyectil(p);
		disp.establecerDanio(disp.obtenerDanio()*danioExtra);
		juego.addDisparoJugador(disp);
	}

}
