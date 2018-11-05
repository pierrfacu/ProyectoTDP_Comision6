package Entidades.Enemigos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Armas.AECrucero;
import Colisionador.ColisionadorEnemigoArmado;
import Inteligencia.Standard;

/**
 * Clase Crucero que extiende de EnemigoArmado.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class Crucero extends EnemigoArmado{
	
	//Constructor
	public Crucero(Point p) {
		super(p, 50, 70);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/crucero.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/crucero_congelado.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/crucero.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/crucero.png"));
		this.imagen[4] = null;
		
		velocidad = 9;
		cantVidas = 2;
		porcentajeVida = 100;
		puntaje = 40;
		danioImpacto = 30;
		colisionador = new ColisionadorEnemigoArmado(this);
		inteligencia = new Standard(this);
		arma = new AECrucero(this);
	}
	
	
	//Metodos
	
	public void disparar() {
		if(arma != null)
			arma.accionar();
	}
}
