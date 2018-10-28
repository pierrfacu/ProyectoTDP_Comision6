package Entidades.PowerUps;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.ColisionadorPowerUp;
import Entidades.Jugador;
import Juego.JuegoPowerUp;

public class Proteccion extends PowerUp{
	
	//Constructor
	public Proteccion(Point p) {
		super(p, 20, 20);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Vida/vida.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Vida/vida.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Vida/vida.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Vida/vida.png"));
		this.imagen[4] = null;
		
		colisionador = new ColisionadorPowerUp(this);
		
	}

	//Metodos
	
	public void activar() {
		JuegoPowerUp juego = JuegoPowerUp.getInstance();
		Jugador jugador = juego.obtenerJugador();
		jugador.activarEscudo();
	}
}
