package Entidades.Enemigos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.Colisionador;
import Colisionador.ColisionadorEnemigoKamikaze;
import Inteligencia.Mareado;

/**
 * 
 * @author
 *
 */
public class Tonto extends Enemigo{
	
	//Constructor
	public Tonto(Point p) {
		super(p, 40, 40);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[2] = null;
		this.imagen[3] = null;
		this.imagen[4] = null;
		
		velocidad = 10;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 5;
		danioImpacto = 20;
		colisionador = new ColisionadorEnemigoKamikaze(this);
		inteligencia = new Mareado(this);
	}
	
	//Metodos
	
	public void meColisionan(Colisionador c) {
		c.colisionarEnemigoKamikaze(this);
	}
}
