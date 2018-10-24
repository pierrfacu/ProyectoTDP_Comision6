package Entidades;

import java.awt.event.KeyEvent;
import java.awt.Point;
import javax.swing.ImageIcon;

import Armas.*;
import Juego.JuegoJugador;
import Colisionador.*;
import Entidades.Disparos.*;

/**
 * 
 * @author 
 *
 */
public class Jugador extends Entidad{
	
	private Arma arma;
	private Arma armaEspecial;
	
	public Jugador(Point p) {
		super(p, 40, 40);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.imagen[4] = null;
		
		arma = new AJSimple(this);
		armaEspecial = null;
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
	
	public void accionar(int d) {
		JuegoJugador j = JuegoJugador.getInstance();
		int ancho = j.obtenerGrafica().anchoGrafica();
		
		switch (d){
		case KeyEvent.VK_LEFT : //Izquierda
			if ((pos.x - velocidad) < 0)
				pos.setLocation(0, pos.y);
			else pos.setLocation(pos.x - velocidad, pos.y);
			setGrafico(0);
			break;
		case KeyEvent.VK_RIGHT : //Derecha
			if ((pos.x + velocidad) > (ancho - 50))//550)
				pos.setLocation((ancho - 50), pos.y);
			else pos.setLocation(pos.x + velocidad, pos.y);
			setGrafico(0);
			break;
		case KeyEvent.VK_SPACE : //Disparo
			arma.accionar();
		case KeyEvent.VK_ALT : //Disparo especial
			if(armaEspecial != null) {
				
			}
		}
	}
	
	public void establecerArma(ArmaJugador a) {
		arma = a;
	}
	
	public void establecerArmaEspecial(AJProyectil p) {
		if(armaEspecial == null) {
			armaEspecial = p;
		}
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
	
	public void sumarPorcentajeVida(int p) {
		porcentajeVida = porcentajeVida + p;
		if(porcentajeVida > 100) {
			porcentajeVida = porcentajeVida - 100;
			cantVidas++;
		}
		if(cantVidas > 3) {
			cantVidas--;
			porcentajeVida = 100;
		}
	}

	public void mover() {
		
	}
}
