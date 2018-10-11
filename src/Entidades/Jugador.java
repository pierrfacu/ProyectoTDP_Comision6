package Entidades;

import java.awt.event.KeyEvent;
import java.awt.Point;
import javax.swing.ImageIcon;
import Juego.Juego;
import Colisionador.*;

/**
 * 
 * @author 
 *
 */
public class Jugador extends Entidad{
	
	public Jugador(Point p) {
		super(p);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		
		velocidad = 10;
		cantVidas = 3;
		porcentajeVida = 100;
		puntaje = 0;
		colisionador = new ColisionadorJugador();
	}
	
	//Metodos
	
	public void mover(int d) {
		
		switch (d){
		case KeyEvent.VK_LEFT : //Izquierda
			if ((pos.x - velocidad) < 0)
				pos.setLocation(0, pos.y);
			else pos.setLocation(pos.x - velocidad, pos.y);
			setGrafico(0);
			break;
		case KeyEvent.VK_RIGHT : //Derecha
			if ((pos.x + velocidad) > 550)
				pos.setLocation(550, pos.y);
			else pos.setLocation(pos.x + velocidad, pos.y);
			setGrafico(0);
			break;
		}
	}
	
	public void disparar(Juego j, int d) {
		if (d == KeyEvent.VK_SPACE) {
			
		}
	}
	
	public void mover() {
		
	}

	public void meColisionan(Colisionador c) {
		c.colisionarJugador(this);
	}
}
