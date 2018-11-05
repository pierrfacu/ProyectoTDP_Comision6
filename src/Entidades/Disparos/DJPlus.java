package Entidades.Disparos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.ColisionadorDisparoJugador;

/**
 * Clase DJPlus que extiende de DisparoJugador.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class DJPlus extends DisparoJugador{
	
	//Constructor
	public DJPlus(Point p) {
		super(p, 6, 8);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/djPlus.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/djPlus.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/djPlus.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/djPlus.png"));
		this.imagen[4] = null;
		
		velocidad = 10;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 0;
		danioImpacto = 50;
		colisionador = new ColisionadorDisparoJugador(this);	
	}
}
