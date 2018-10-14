package Entidades.Disparos;

import java.awt.Point;

import javax.swing.ImageIcon;

import Colisionador.*;

public class DisparoEnemigo extends Disparo{

	//Constructor
	public DisparoEnemigo(Point p) {
		super(p);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/de.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/de.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/de.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/de.png"));
		
		velocidad = 5;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 1;
		danioImpacto = 10;
		colisionador = new ColisionadorDisparoEnemigo(this);
		
	}

	//Metodos
	
	public void mover() {
		pos.setLocation(pos.x, pos.y + velocidad);
	}
	
	public void meColisionan(Colisionador c) {
		c.colisionarDisparoEnemigo(this);
	}

}
