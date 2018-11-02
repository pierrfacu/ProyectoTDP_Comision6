package Entidades.Obstaculos;

import java.awt.Point;
import javax.swing.ImageIcon;

import Colisionador.Colisionador;
import Colisionador.ColisionadorObstaculo;

public class Escombro extends Obstaculo{
	
	//Constructor
	public Escombro(Point p) {
		super(p, 40, 40);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[4] = null;
		
		velocidad = 0;
		cantVidas = 1;
		porcentajeVida = 50;
		puntaje = 5;
		danioImpacto = 15;
		colisionador = new ColisionadorObstaculo(this);
	}
	
	//Metodos
	
	public void meColisionan(Colisionador c) {
		c.colisionarObstaculo(this);
	}
}
