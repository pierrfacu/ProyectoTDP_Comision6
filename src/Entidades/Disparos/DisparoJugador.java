package Entidades.Disparos;

import java.awt.Point;

import javax.swing.ImageIcon;

import Colisionador.*;
import Entidades.Jugador;

public class DisparoJugador extends Disparo{
	
	private Jugador jugador;
	
	//Constructor
	public DisparoJugador(Point p, Jugador jug) {
		super(p);
		jugador = jug;
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/dj.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/dj.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/dj.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/dj.png"));
		
		velocidad = 5;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 0;
		danioImpacto = 100;
		colisionador = new ColisionadorDisparoJugador(this);
		
	}

	//Metodos
	
	public void mover() {
		pos.setLocation(pos.x, pos.y - velocidad);
	}

	public void meColisionan(Colisionador c) {
		c.colisionarDisparoJugador(this);
	}
	
	/**
	 * Recibe el puntaje para entregarselo al jugador
	 * @param puntj Puntaje que recibe.
	 */
	public void recibirPuntaje(int puntj) {
		jugador.sumarPuntaje(puntj);
	}
}
