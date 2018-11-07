package Entidades;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.JLabel;
import Colisionador.Colisionador;

/**
 * Clase abstracta Entidad.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public abstract class Entidad {

	protected int width;
	protected int height;
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
	protected Entidad(Point p, int w, int h) {
		pos = p;
		width = w;
		height = h;

		imagen = new Icon[5];
	}
	
	//Metodos
	
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
	public void setVelocidad(int v){
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
	 * Devuelve el porcentaje de la vida que tiene la entidad.
	 * @return porcentaje vida.
	 */
	public int porcentajeVida() {
		return porcentajeVida;
	}
	
	/**
	 * Resta de la vida el porcentaje recibido.
	 * @param p Porcentaje de vida a restar.
	 */
	public void restarVida(int p) {
		porcentajeVida = porcentajeVida - p;
		if(porcentajeVida <= 0) {
			porcentajeVida = 100 + porcentajeVida;
			cantVidas--;
		}
		if(cantVidas <= 0) {
			cantVidas = 0;
			porcentajeVida = 0;
		}
	}
	
	/**
	 * Devuelve verdadero si la entidad no tiene mas vida, caso contrario falso.
	 * @return verdadero si la entidad murio, caso contrario falso.
	 */
	public boolean estoyMuerto() {
		return cantVidas() <= 0;
	}
	
	/**
	 * Genera una muerte subita en la entidad.
	 */
	public void muerteSubita() {
		cantVidas = 0;
		porcentajeVida = 100;
	}
	
	/**
	 * Devuelve la posición de la entidad.
	 * @return posición de la entidad.
	 */
	public Point getPosition(){
		return pos;
	}
	
	/**
	 * Establece la posicion de la entidad con la posicion recibida por parametro.
	 * @param p posicion a asignar.
	 */
	public void setPosition(Point p) {
		pos = p;
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
	 * Establece el grafico de la entidad.
	 * @param dir numero de grafico.
	 */
	public void setGrafico(int dir){
		if(this.grafico != null){
			this.grafico.setIcon(this.imagen[dir]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
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
	
	/**
	 * Devuelve la altura de la entidad.
	 * @return altura entidad.
	 */
	public int altoEntidad() {
		return height;
	}
	
	/**
	 * Devuelve el ancho de la entidad.
	 * @return ancho entidad.
	 */
	public int anchoEntidad() {
		return width;
	}
	
	/**
	 * Colisiona a la entidad que recibe por parámetro.
	 * @param e entidad.
	 */
	public void colisionar(Entidad e) {
		e.meColisionan(colisionador);
	}
	
	// Metodos abstractos
	
	/**
	 * Mueve la entidad.
	 */
	public abstract void mover();
	
	/**
	 * Le indica al colisionador la entidad a la que esta colisionando.
	 * @param c colisionador.
	 */
	public abstract void meColisionan(Colisionador c);
	
}
