package Entidades;

import java.awt.event.KeyEvent;
import java.awt.Point;
import javax.swing.ImageIcon;
import Juego.Juego;
import Juego.JuegoJugador;
import Colisionador.*;
import Entidades.Disparos.*;

/**
 * 
 * @author 
 *
 */
public class Jugador extends Entidad{
	
	protected static JuegoJugador juego;
	
	public Jugador(Point p) {
		super(p, 40, 40);
		
		juego = JuegoJugador.getInstance();
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		
		velocidad = 10;
		cantVidas = 3;
		porcentajeVida = 100;
		puntaje = 0;
		danioImpacto = 100;
		colisionador = new ColisionadorJugador(this);
	}
	
	//Metodos
	
	/**
	 * Devuelve verdadero si el jugador no tiene mas vida, caso contrario falso.
	 * @return verdadero si el jugador murio, caso contrario falso.
	 */
	public boolean estoyMuerto() {
		return cantVidas() == 0;
	}
	
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
	
	public void disparar(int d) {
		if (d == KeyEvent.VK_SPACE) {
			Point p = new Point(pos.x + 20, pos.y); 
			DisparoJugador disp = new DisparoJugador(p, this);
			juego.addDisparoJugador(disp);
		}
	}
	
	public void mover() {
		
	}

	public void meColisionan(Colisionador c) {
		c.colisionarJugador(this);
	}
	
	/**
	 * Suma al puntaje del jugar el recibido como parámetro, si es negativo, le resta.
	 * @param puntj puntaje a sumar o restar.
	 */
	public void sumarPuntaje(int puntj) {
		puntaje = puntaje + puntj;
		if (puntaje < 0)
			puntaje = 0;
	}
}
