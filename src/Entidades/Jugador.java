package Entidades;

import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.util.Random;
import Entidades.Enemigos.Enemigo;
import Juego.Juego;

/**
 * 
 * @author 
 *
 */
public class Jugador extends Entidad{
	
	private int cantVidas;
	private int porcentajeVida;

	public Jugador(int vel, int x, int y) {
		super(vel, x, y);
		
		this.image[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		
		cantVidas = 3;
		porcentajeVida = 100;
	}
	
	//Metodos
	
	/**
	 * Devuelve la cantidad de vidas que tiene el jugador
	 * @return Cantidad de vidas.
	 */
	public int cantVidas() {
		return cantVidas;
	}
	
	/**
	 * Resta de la vida el porcentaje recibido.
	 * @param p Porcentaje de vida a restar.
	 */
	public void restarVida(int p) {
		int resta = (porcentajeVida * p) / 100;
		porcentajeVida = porcentajeVida - resta;
		if(porcentajeVida < 0) {
			porcentajeVida = 100 + porcentajeVida;
			cantVidas--;
		}
	}
	
	/**
	 * 
	 */
	public void mover(int d) {
		//Investigar como hacer para no salirse de la ventana
		switch (d) {
			case 0 : //Izquierda
				if ((pos.x - velocidad) < 0)
					pos.setLocation(0, pos.y);
				else pos.setLocation(pos.x - velocidad, pos.y);
				break;
			case 1 : //Derecha
				if ((pos.x + velocidad) > 550)
					pos.setLocation(550, pos.y);
				else pos.setLocation(pos.x + velocidad, pos.y);
				break;
		}
		setGrafico(d);
	}
	
	public void disparar(Juego j) {//Provisorio
		LinkedList<Enemigo> enem = j.obtenerEnemigos();
		if (!enem.isEmpty()) {
			Random rnd = new Random();
			int x = rnd.nextInt(enem.size());
			Enemigo e = enem.get(x);
			e.morir(j);
		}
	}
}
