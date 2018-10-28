package Entidades.Obstaculos;

import java.awt.Point;

import javax.swing.ImageIcon;

public class CampoFuerza extends Obstaculo{
	
	//Constructor
	public CampoFuerza(Point p) {
		super(p, 40, 40);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[4] = null;
		
		velocidad = 0;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 4;
		danioImpacto = 0;
		//colisionador = new ColisionadorObstaculo(this);
	}
}
