package Entidades.Enemigos;

import javax.swing.ImageIcon;
import Entidades.*;

/**
 * 
 * @author 
 *
 */
public class E1 extends Enemigo{
	
	
	//Constructor
	public E1(int vel, int x, int y) {
		super(vel, x, y);
		
		this.image[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		this.image[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Enemigos/enemy.png"));
		
	}
}
