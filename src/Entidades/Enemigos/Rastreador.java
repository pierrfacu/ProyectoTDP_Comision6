package Entidades.Enemigos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.ColisionadorEnemigo;
import Inteligencia.Buscador;

/**
 * 
 * @author
 *
 */
public class Rastreador extends Enemigo{

	protected Rastreador(Point p) {
		super(p, 40, 40);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[2] = null;
		this.imagen[3] = null;
		this.imagen[4] = null;
		
		velocidad = 12;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 15;
		danioImpacto = 23;
		colisionador = new ColisionadorEnemigo(this);
		inteligencia = new Buscador(this);
	}
}
