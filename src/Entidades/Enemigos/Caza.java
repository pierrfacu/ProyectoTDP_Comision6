package Entidades.Enemigos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Armas.AECaza;
import Colisionador.ColisionadorEnemigoArmado;
import Colisionador.ColisionadorEnemigoKamikaze;
import Inteligencia.Buscador;
import Inteligencia.Standard;

/**
 * Clase Caza que extiende de EnemigoArmado.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class Caza extends EnemigoArmado{
	
	//Constructor
	public Caza(Point p) {
		super(p, 40, 60);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/caza.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/caza_congelado.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/caza.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/caza.png"));
		this.imagen[4] = null;
		
		velocidad = 15;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 10;
		danioImpacto = 20;
		colisionador = new ColisionadorEnemigoArmado(this);
		inteligencia = new Standard(this);
		arma = new AECaza(this);
	}

	//Metodos
	
	public void disparar() {
		if(arma != null)
			arma.accionar();
	}
	
	public void restarVida(int i) {
		super.restarVida(i);
		if(porcentajeVida <= 50 && arma != null) {
			inteligencia = new Buscador(this);
			arma = null;
			colisionador = new ColisionadorEnemigoKamikaze(this);
		}
	}
}
