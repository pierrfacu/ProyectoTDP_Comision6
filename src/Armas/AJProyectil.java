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
		Point p = new Point(posJugador.x + 20, posJugador.y); 
		DJProyectil disp = new DJProyectil(p);
		juego.addDisparoJugador(disp);
	}

}
