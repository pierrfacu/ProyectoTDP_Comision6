package Inteligencia;

import java.awt.Point;
import java.util.Random;

import Entidades.Enemigos.Enemigo;
import Juego.JuegoEnemigo;

public class Mareado extends Inteligencia {
	
	
	public Mareado(Enemigo e) {
		super (e);
	}
	
	//Metodos
	
	public void atacar() {
		
		JuegoEnemigo juego   = JuegoEnemigo.getInstance();
		int ancho = juego.obtenerGrafica().anchoGrafica();
		Point p = enemigo.getPosition();
        Random r = new Random (3);
		int d =r.nextInt();
		
		//para moverse aleatoriamente
		switch(d) {
		
		case 0: //izquierda
			if ((p.x - velocidad) < 0)
				p.setLocation(0, p.y);
			else
				p.setLocation(p.x - velocidad, p.y);
			
			break; 
			
		case 1: //derecha controla tope hasta 50
			if ((p.x + velocidad) > (ancho - 50))
				p.setLocation((ancho - 50), p.y);
			else 
				p.setLocation(p.x + velocidad, p.y);
			break;
			
		case 2: //abajo
			p.setLocation(p.x, p.y + velocidad);
			
			break;
		}
		
	}
 
}
