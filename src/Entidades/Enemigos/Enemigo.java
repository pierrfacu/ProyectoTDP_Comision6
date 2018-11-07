package Entidades.Enemigos;

import Entidades.Entidad;
import Entidades.PowerUps.PowerUp;
import Inteligencia.Inteligencia;
import java.awt.Point;

/**
 * Clase abstracta Enemigo que extiende de Entidad.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public abstract class Enemigo extends Entidad{
	
	protected boolean doyPU;
	protected PowerUp pU;
	protected Inteligencia inteligencia;
	
	//Constructor
	protected Enemigo(Point p, int w, int h) {
		super(p, w, h);
	}
	
	//Metodos
	
	public void mover() {
		inteligencia.ejecutar();
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
	
	/**
	 * Establece en el enemigo su inteligencia.
	 * @param i inteligencia a establecer.
	 */
	public void establecerInteligencia(Inteligencia i) {
		inteligencia = i;
	}
	
	/**
	 * Devuelve la inteligencia del enemigo.
	 * @return inteligencia enemigo.
	 */
	public Inteligencia obtenerInteligencia() {
		return inteligencia;
	}
}
