package Entidades.Obstaculos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.Colisionador;
import Colisionador.ColisionadorObstaculoBarricada;

/**
 * Clase CampoFuerza que extiende de Obstaculo.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class CampoFuerza extends Obstaculo{
	
	//Constructor
	public CampoFuerza(Point p) {
		super(p, 60, 20);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Obstaculos/campofuerza.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Obstaculos/campofuerza.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Obstaculos/campofuerza.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Obstaculos/campofuerza.png"));
		this.imagen[4] = null;
		
		velocidad = 0;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 4;
		danioImpacto = 0;
		colisionador = new ColisionadorObstaculoBarricada(this);
	}
	
	//Metodos
	
	public void meColisionan(Colisionador c) {
		c.colisionarObstaculoBarricada(this);
	}
}
