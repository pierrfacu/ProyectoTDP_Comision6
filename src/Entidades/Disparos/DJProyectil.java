package Entidades.Disparos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.ColisionadorDisparoJugador;

/**
 * Clase DJProyectil que extiende de DisparoJugador.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class DJProyectil extends DisparoJugador{
	
	//Constructor
	public DJProyectil(Point p) {
		super(p, 10, 12);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/djProyectil.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/djProyectil.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/djProyectil.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/djProyectil.png"));
		this.imagen[4] = null;
		
		velocidad = 15;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 0;
		danioImpacto = 100;
		colisionador = new ColisionadorDisparoJugador(this);	
	}
}
