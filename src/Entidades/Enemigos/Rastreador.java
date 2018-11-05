package Entidades.Enemigos;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.Colisionador;
import Colisionador.ColisionadorEnemigoKamikaze;
import Inteligencia.Buscador;

/**
 * Clase Rastreador que extiende de Enemigo.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class Rastreador extends Enemigo{
	
	//Constructor
	public Rastreador(Point p) {
		super(p, 36, 40);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/rastreador.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/rastreador_congelado.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/rastreador.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/rastreador.png"));
		this.imagen[4] = null;
		
		velocidad = 12;
		cantVidas = 1;
		porcentajeVida = 100;
		puntaje = 15;
		danioImpacto = 23;
		colisionador = new ColisionadorEnemigoKamikaze(this);
		inteligencia = new Buscador(this);
	}
	
	//Metodos
	
	public void meColisionan(Colisionador c) {
		c.colisionarEnemigoKamikaze(this);
	}
}
