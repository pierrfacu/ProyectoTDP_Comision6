package Entidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 * @author 
 *
 */
public class Jugador extends Entidad{

	public Jugador(int vel, int x, int y) {
		super(vel, x, y);
		
		this.image[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Jugador/jugador.png"));
		
	}
	
	//Metodos
	
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
}
