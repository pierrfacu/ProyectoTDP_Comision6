package Entidades.Disparos;

import java.awt.Point;

import javax.swing.ImageIcon;

import Colisionador.*;

public class DisparoJugador extends Disparo{
	
	
	//Constructor
	public DisparoJugador(Point p) {
		super(p);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/dj.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/dj.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/dj.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/dj.png"));
		
		velocidad = 5;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 0;
		dañoImpacto = 100;
		colisionador = new ColisionadorDisparoJugador(this);
		
	}

	//Metodos
	
	public void mover() {
		
		
		
	}

	public void meColisionan(Colisionador c) {
		c.colisionarDisparoJugador(this);
	}
}
