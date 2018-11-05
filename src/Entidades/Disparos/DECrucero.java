package Entidades.Disparos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.ColisionadorDisparoEnemigo;

/**
 * Clase DECrucero que extiende de DisparoEnemigo.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class DECrucero extends DisparoEnemigo{
	
	//Constructor
	public DECrucero(Point p) {
		super(p, 10, 12);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/deCrucero.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/deCrucero.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/deCrucero.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Disparos/deCrucero.png"));
		this.imagen[4] = null;
		
		velocidad = 10;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = -4;
		danioImpacto = 20;
		colisionador = new ColisionadorDisparoEnemigo(this);
	}
}
