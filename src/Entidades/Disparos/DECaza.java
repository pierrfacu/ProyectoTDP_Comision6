package Entidades.Disparos;

import java.awt.Point;

import javax.swing.ImageIcon;

import Colisionador.ColisionadorDisparoEnemigo;

public class DECaza extends DisparoEnemigo{

	public DECaza(Point p) {
		super(p, 3, 5);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/de.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/de.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/de.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/de.png"));
		this.imagen[4] = null;
		
		velocidad = 10;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = -2;
		danioImpacto = 10;
		colisionador = new ColisionadorDisparoEnemigo(this);
		
	}
}
