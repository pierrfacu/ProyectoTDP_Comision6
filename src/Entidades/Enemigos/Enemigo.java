package Entidades.Enemigos;

import Entidades.Entidad;
import Entidades.PowerUps.PowerUp;
import Inteligencia.Inteligencia;
import java.awt.Point;
import Colisionador.Colisionador;

/**
 * 
 * @author 
 *
 */
public abstract class Enemigo extends Entidad{
	
	protected boolean doyPU;
	protected PowerUp pU;
	protected Inteligencia inteligencia;
	
	//Constructor
	protected Enemigo(Point p) {
		super(p, 40 , 40);
	}
	
	//Metodos
	
	public void mover() {
		inteligencia.ejecutar();
		setGrafico(0);
	}
	
	public void meColisionan(Colisionador c) {
		c.colisionarEnemigo(this);
	}
	
	/**
	 * Devuelve verdadero si el enemigo libera un power up, caso contrario falso.
	 * @return verdadero si entraga premio, caso contrario falso.
	 */
	public boolean doyPowerUp() {
		return doyPU;
	}
	
	/**
	 * Establece el power up que entrega el enemigo al morir.
	 * @param pU power up que entregara enemigo.
	 */
	public void establecerPowerUp(PowerUp pU) {
		if(this.pU == null) {
			this.pU = pU;
			doyPU = true;
		}
	}
	
	/**
	 * Devuelve el power up que entrega el enemigo, requiere que se verifique si da algun power up.
	 * @return power up.
	 */
	public PowerUp obtenerPowerUp() {
		pU.setPosition(new Point(pos.x + (width/2), pos.y + (height/2)));
		return pU;
	}
}
