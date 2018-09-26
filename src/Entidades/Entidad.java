package Entidades;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 * 
 * @author 
 *
 */
public abstract class Entidad {

	protected JLabel grafico;
	protected Icon image[]; //Podriamos usar map?
	protected final int width = 40; //modificar a tamaño definitivo
	protected final int height = 40; //modificar a tamaño definitivo
	protected Point pos;
	protected int velocidad;
	
	//constructor
	protected Entidad(int vel,int x, int y) {
		pos = new Point(x, y);
		velocidad = vel;
		image = new Icon[4];
		
	}
	
	//Metodos publicos
	
	/**
	 * 
	 * @return
	 */
	public int getVelocidad(){
		return velocidad;
	}
	
	/**
	 * 
	 * @param v
	 */
	public void setVelovidad(int v){
		velocidad = v;		
	}
	
	/**
	 * 
	 * @return
	 */
	public Point getPosition(){
		return pos;
	}
	
	/**
	 * 
	 * @return
	 */
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(image[0]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
		return grafico;
	}
	
	/**
	 * 
	 * @param dir
	 */
	protected void setGrafico(int dir){
		if(this.grafico != null){
			this.grafico.setIcon(this.image[dir]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
	}
	
	// Metodos abstractos
	
	public abstract void mover(int d);
	
}
