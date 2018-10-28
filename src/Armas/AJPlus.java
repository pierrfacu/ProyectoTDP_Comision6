package Armas;

import java.awt.Point;

import Entidades.Jugador;
import Entidades.Disparos.DJPlus;
import Juego.JuegoJugador;

public class AJPlus extends ArmaJugador {
	
	//Constructor
	public AJPlus(Jugador j) {
		super(j);
	}

	//Metodos
	public void accionar() {
		JuegoJugador juego = JuegoJugador.getInstance();
		Point posJugador = jugador.getPosition();
		Point p = new Point(posJugador.x + 20, posJugador.y); 
		DJPlus disp = new DJPlus(p);
		disp.establecerDanio(disp.obtenerDanio()*danioExtra);
		juego.addDisparoJugador(disp);
	}	
}
