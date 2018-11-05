package Entidades.PowerUps;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.ColisionadorPowerUp;
import Entidades.Jugador;
import Juego.JuegoPowerUp;

/**
 * Clase Vida que extiende de PowerUp.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class Vida extends PowerUp{
	
	//Constructor
	public Vida(Point p) {
		super(p, 30, 30);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/vida.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/vida.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/vida.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/vida.png"));
		this.imagen[4] = null;
		
		colisionador = new ColisionadorPowerUp(this);	
	}

	//Metodos
	
	public void activar() {
		JuegoPowerUp juego = JuegoPowerUp.getInstance();
		Jugador j = juego.obtenerJugador();
		j.sumarPorcentajeVida(100);
	}
}
