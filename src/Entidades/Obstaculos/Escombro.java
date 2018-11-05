package Entidades.Obstaculos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.Colisionador;
import Colisionador.ColisionadorObstaculo;

/**
 * Clase Escombro que extiende de Obstaculo.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class Escombro extends Obstaculo{
	
	//Constructor
	public Escombro(Point p) {
		super(p, 60, 40);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Obstaculos/escombro.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Obstaculos/escombro.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Obstaculos/escombro.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Obstaculos/escombro.png"));
		this.imagen[4] = null;
		
		velocidad = 0;
		cantVidas = 1;
		porcentajeVida = 50;
		puntaje = 5;
		danioImpacto = 15;
		colisionador = new ColisionadorObstaculo(this);
	}
	
	//Metodos
	
	public void meColisionan(Colisionador c) {
		c.colisionarObstaculo(this);
	}
}
