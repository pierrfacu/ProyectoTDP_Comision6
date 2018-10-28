package Entidades.PowerUps;

import java.awt.Point;
import javax.swing.ImageIcon;
import Colisionador.ColisionadorPowerUp;
import Entidades.Jugador;
import Juego.JuegoPowerUp;

public class Puntaje extends PowerUp{
	//Constructor
	public Puntaje(Point p) {
		super(p, 20, 20);
	
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Puntos/puntos.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Puntos/puntos.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Puntos/puntos.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Puntos/puntos.png"));
		this.imagen[4] = null;
		
		colisionador = new ColisionadorPowerUp(this);
		puntaje = 500;
		
	}
	
	//Metodos
	
	public void activar() {
		JuegoPowerUp juego = JuegoPowerUp.getInstance();
		Jugador j = juego.obtenerJugador();
		j.sumarPuntaje(puntaje); 
	}
}
