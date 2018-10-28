package Entidades.PowerUps;

import java.awt.Point;
import javax.swing.ImageIcon;
import Armas.AJPlus;
import Colisionador.ColisionadorPowerUp;
import Entidades.Jugador;
import Juego.JuegoPowerUp;

public class MejoraArma extends PowerUp{

	public MejoraArma(Point p) {
		super(p, 0, 0);
		
		this.imagen[0] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Vida/vida.png"));
		this.imagen[1] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Vida/vida.png"));
		this.imagen[2] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Vida/vida.png"));
		this.imagen[3] = new ImageIcon(this.getClass().getResource("/Galaxian/PowerUp/Vida/vida.png"));
		this.imagen[4] = null;
		
		colisionador = new ColisionadorPowerUp(this);
	}

	public void activar() {
		JuegoPowerUp juego = JuegoPowerUp.getInstance();
		Jugador jugador = juego.obtenerJugador();
		AJPlus arma = new AJPlus(jugador);
		jugador.establecerArma(arma);
	}
}
