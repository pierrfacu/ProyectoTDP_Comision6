package Entidades.PowerUps;

import java.awt.Point;
import java.util.Random;
import Colisionador.Colisionador;
import Entidades.Entidad;
import Juego.JuegoEnemigo;
import Juego.JuegoPowerUp;

/**
 * Clase abstracta PowerUp que extiende de Entidad.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public abstract class PowerUp extends Entidad{
	
	//Constructor
	protected PowerUp(Point p, int w, int h) {
		super(p, w, h);

		velocidad = 10;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 0;
		danioImpacto = 0;
	}
	
	//Metodos
	
	public void mover() {
		JuegoPowerUp juego = JuegoPowerUp.getInstance();
		int ancho = juego.obtenerGrafica().anchoGrafica();
		int alto = juego.obtenerGrafica().altoGrafica();
		
		Random rnd = new Random();
		int d = rnd.nextInt(3);
		
		switch (d){
		case 0 : //Abajo
			pos.setLocation(pos.x, pos.y + velocidad);
			if (pos.y > alto)
				restarVida(100);
			setGrafico(0);
			break;
		case 1 : //Derecha
			if ((pos.x + velocidad) > (ancho - 50))
				pos.setLocation((ancho - 50), pos.y);
			else pos.setLocation(pos.x + velocidad, pos.y);
			setGrafico(0);
			break;
		case 2 : //Izquierda
			if ((pos.x - velocidad) < 0)
				pos.setLocation(0, pos.y);
			else pos.setLocation(pos.x - velocidad, pos.y);
			setGrafico(0);
			break;
		}
	}

	public void meColisionan(Colisionador c) {
		c.colisionarPowerUp(this);
	}
	
	public void muerteSubita() {
		//No llevo una bomba en mi interior, ohh sii (?
	}
	
	public void meSali() {
		JuegoEnemigo juego = JuegoEnemigo.getInstance();
		int altoGrafica = juego.obtenerGrafica().altoGrafica();
		if(pos.y > altoGrafica){
			cantVidas = 0;
			porcentajeVida = 100;
		}
	}
	
	//Metdos abstractos
	
	/**
	 * Aplica lo que hace el power up en el juego.
	 */
	public abstract void activar();
}
