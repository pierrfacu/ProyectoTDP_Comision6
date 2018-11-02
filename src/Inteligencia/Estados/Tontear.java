package Inteligencia.Estados;

import java.awt.Point;
import java.util.Random;


import Entidades.Enemigos.Enemigo;
import Inteligencia.Inteligencia;
import Juego.JuegoEnemigo;

public class Tontear extends Estado{
	
	public Tontear(Inteligencia i, Enemigo enemigo) {
		super(i,enemigo);
	}
	
	public void ejecutar() {
		
		JuegoEnemigo juego = JuegoEnemigo.getInstance();
		int ancho = juego.obtenerGrafica().anchoGrafica();
		Point p = enemigo.getPosition();
        Random r = new Random ();
		int d=r.nextInt(3);
		
        switch(d) {
		
		 	case 0: //izquierda
		 		if ((p.x - velocidad) < 0)
		 			p.setLocation(0, p.y);
		 		else
		 			p.setLocation(p.x - velocidad, p.y);
		 		enemigo.setPosition(p);
		 		enemigo.setGrafico(0);
		 		break; 
			
		 	case 1: //derecha controla tope hasta 50
		 		if ((p.x + velocidad) > (ancho - 50))
		 			p.setLocation((ancho - 50), p.y);
		 		else 
		 			p.setLocation(p.x + velocidad, p.y);
		 		enemigo.setPosition(p);
		 		enemigo.setGrafico(0);
			
		 		break;
			
		 	case 2: //abajo
		 		p.setLocation(p.x, p.y + velocidad);
		 		enemigo.setPosition(p);
		 		enemigo.setGrafico(0);
			
		 		int alto = juego.obtenerGrafica().altoGrafica();
		 		if(enemigo.getPosition().y > alto) {
		 			inteligencia.setEstado(new VolverFormacion(inteligencia, enemigo)); //si se pasa vuelve a la formacion
		 		}
		 		break;
	    }	
        
	}

}
