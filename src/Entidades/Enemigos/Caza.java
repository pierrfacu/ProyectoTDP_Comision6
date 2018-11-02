package Entidades.Enemigos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Armas.AECaza;
import Colisionador.ColisionadorEnemigoArmado;
import Colisionador.ColisionadorEnemigoKamikaze;
import Inteligencia.Buscador;
import Inteligencia.Standard;

/**
 * 
 * @author
 *
 */
public class Caza extends EnemigoArmado{
	
	//Constructor
	public Caza(Point p) {
		super(p, 0, 0);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[2] = null;
		this.imagen[3] = null;
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
