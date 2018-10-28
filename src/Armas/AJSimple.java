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
		int ancJ = jugador.anchoEntidad();
		Point p = new Point(posJugador.x + (ancJ / 2), posJugador.y); 
		DJSimple disp = new DJSimple(p);
		disp.establecerDanio(disp.obtenerDanio()*danioExtra);
		juego.addDisparoJugador(disp);
	}
}
