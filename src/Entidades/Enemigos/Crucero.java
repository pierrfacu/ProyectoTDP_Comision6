package Entidades.Enemigos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Armas.AECrucero;
import Colisionador.ColisionadorEnemigo;
import Inteligencia.Standard;

/**
 * 
 * @author
 *
 */
public class Crucero extends EnemigoArmado{
	
	//Constructor
	protected Crucero(Point p) {
		super(p, 0, 0);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[2] = null;
		this.imagen[3] = null;
		this.imagen[4] = null;
		
		velocidad = 9;
		cantVidas = 2;
		porcentajeVida = 100;
		puntaje = 40;
		danioImpacto = 30;
		colisionador = new ColisionadorEnemigo(this);
		inteligencia = new Standard(this);
		arma = new AECrucero(this);
	}
	//Metodos
	public void disparar() {
		if(arma != null)
			arma.accionar();
	}
}
