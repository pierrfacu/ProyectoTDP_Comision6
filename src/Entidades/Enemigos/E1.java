package Entidades.Enemigos;

import javax.swing.ImageIcon;
import java.awt.Point;
import Colisionador.*;

/**
 * 
 * @author 
 *
 */
public class E1 extends Enemigo{
	
	
	//Constructor
	public E1(Point p) {
		super(p);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		
		velocidad = 10;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 10;
		dañoImpacto = 25;
		colisionador = new ColisionadorEnemigo(this);
	}
}
