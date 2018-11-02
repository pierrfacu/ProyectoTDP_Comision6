package Entidades.Enemigos;

import javax.swing.ImageIcon;
import java.awt.Point;
import Colisionador.*;
import Inteligencia.Buscador;
import Inteligencia.Congelado;
import Inteligencia.Mareado;
import Inteligencia.Standard;

/**
 * 
 * @author 
 *
 */
public class E1 extends Enemigo{
	
	
	//Constructor
	public E1(Point p) {
		super(p, 40, 40);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[2] = null;
		this.imagen[3] = null;
		this.imagen[4] = null;
		
		
		velocidad = 10;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 10;
		danioImpacto = 25;
		colisionador = new ColisionadorEnemigoKamikaze(this);
		inteligencia= new Buscador(this);
	}

	@Override
	public void meColisionan(Colisionador c) {
		c.colisionarEnemigoKamikaze(this);
		
	}
}
