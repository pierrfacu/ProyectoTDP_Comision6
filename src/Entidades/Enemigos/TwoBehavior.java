package Entidades.Enemigos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.ColisionadorEnemigo;
import Inteligencia.Buscador;
import Inteligencia.Mareado;

public class TwoBehavior  extends Enemigo{
	
	//Constructor
	public TwoBehavior(Point p) {
		super(p, 40, 40);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.imagen[2] = null;
		this.imagen[3] = null;
		this.imagen[4] = null;
		
		velocidad = 10;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 10;
		danioImpacto = 25;
		colisionador = new ColisionadorEnemigo(this);
		inteligencia = new Buscador(this);
	}
	
	//Metodos
	
	public void restarVida(int i) {
		super.restarVida(i);
		if(porcentajeVida <= 50) {
			inteligencia = new Mareado(this);
		}
			
	}
	
}
