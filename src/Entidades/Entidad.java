package Entidades;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.JLabel;

import Colisionador.Colisionador;

/**
 * 
 * @author 
 *
 */
public abstract class Entidad {

	protected final int width = 40; //modificar a tamaño definitivo
	protected final int height = 40; //modificar a tamaño definitivo
	protected JLabel grafico;
	protected Icon imagen[];
	protected Point pos;
	protected int velocidad;
	protected int puntaje;
	protected int cantVidas;
	protected int porcentajeVida;
	protected int danioImpacto;
	
	protected Colisionador colisionador;
	
	//constructor
	protected Entidad(Point p) {
		pos = p;
		imagen = new Icon[4];
		
	}
	
	//Metodos publicos
	
	/**
	 * Devuelve el puntaje de la entidad.
	 * @return puntaje de la entidad.
	 */
	public int getPuntaje() {
		return puntaje;
	}
	
	/**
	 * Establece el puntaje de la entidad por la recibida como parametro.
	 * @param p puntaje a establecer.
	 */
	public void setPuntaje(int p) {
		puntaje = p;
	}
	
	/**
	 * Devuelve la velocidad de desplazamiento de la entidad.
	 * @return velocidad de desplazamiento de la entidad.
	 */
	public int getVelocidad(){
		return velocidad;
	}
	
	/**
	 * Establece la velocidad de desplazamiento de la entidad por la recibida como parametro.
	 * @param v velocidad a establecer.
	 */
	public void setVelovidad(int v){
		velocidad = v;		
	}
	
	/**
	 * Devuelve la cantidad de vidas que tiene la entidad.
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
		porcentajeVida = porcentajeVida - p;
		if(porcentajeVida < 0) {
			porcentajeVida = 100 - porcentajeVida;
			cantVidas--;
		}
	}
	
	/**
	 * Devuelve la posición de la entidad.
	 * @return posición de la entidad.
	 */
	public Point getPosition(){
		return pos;
	}
	
	/**
	 * Devuelve el grafico de la entidad.
	 * @return grafico de la entidad.
	 */
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(imagen[0]);
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
			this.grafico.setIcon(this.imagen[dir]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
	}
	
	/**
	 * 
	 * @param e
	 */
	public void colisionar(Entidad e) {
		e.meColisionan(colisionador);
	}
	
	/**
	 * Devuelve el daño de impacto que ocaciona la entidad en porcentaje.
	 * @return Daño de impacto que ocasiona.
	 */
	public int obtenerDanio() {
		return danioImpacto;
	}
	
	/**
	 * Establece el daño de impacto que ocaciona la entidad en porcentaje. Requiere que el valor sea entre 0 a 100.
	 * @param d Daño de impacto.
	 */
	public void establecerDanio(int d) {
		danioImpacto = d;
	}
	
	// Metodos abstractos
	
	/**
	 * 
	 */
	public abstract void mover();
	
	/**
	 * 
	 * @param c
	 */
	public abstract void meColisionan(Colisionador c);
	
}
