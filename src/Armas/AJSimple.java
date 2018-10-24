package Armas;

import java.awt.Point;

import Entidades.Jugador;
import Entidades.Disparos.DJSimple;
import Juego.JuegoJugador;

public class AJSimple extends ArmaJugador {
	
	//Constructor
	public AJSimple(Jugador j) {
		super(j);
	}
	
	//Metodos
	
	public void accionar() {
		JuegoJugador juego = JuegoJugador.getInstance();
		Point posJugador = jugador.getPosition();
		Point p = new Point(posJugador.x + 20, posJugador.y); 
		DJSimple disp = new DJSimple(p);
		juego.addDisparoJugador(disp);
	}
}
