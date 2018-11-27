package Inteligencia;

import java.awt.Point;
import Entidades.Enemigos.Enemigo;
import Inteligencia.Estados.EnFormacion;
import Inteligencia.Estados.Estado;

/**
 * CLase abstracta Inteligencia
 * @author  Aldana Cas� (104870), Facundo Pierrestegui (99694), Stefania Heirich (106205)
 *
 */

public abstract class Inteligencia {
	
	protected static final int velFormacion = 40;
	protected Enemigo enemigo;
	protected Point posicionFormacion;
	protected int velocidad;
	protected int contSecMF;
	protected Estado estado;
	
	//Constructor
	public Inteligencia(Enemigo e) {
		enemigo = e;
		posicionFormacion = new Point (enemigo.getPosition().x, enemigo.getPosition().y);
		velocidad = enemigo.getVelocidad();
		contSecMF = 0;
		estado = new EnFormacion (this, e);
	} 
	
	//Metodos abstractos
	
	/**
	 * Metodo que evalua la inteligencia de cada enemigo
	 */
	public abstract void ejecutar();
	
	/**
	 * Cambia la inteligencia al estado de ataque.
	 */
	public abstract void establecerAtaque();
	
	//Metodos
	
	/**
	 * Establece el estado del enemigo con el pasado por parametro.
	 * @param e estado a exteblecerle al enemigo.
	 */
	public void setEstado(Estado e) {
		estado = e;
	}
	
	/**
	 * Devuelve el estado del enemigo.
	 * @return estado del enemigo
	 */
	public Estado getEstado() {
		return estado;
	}
	
	/**
	 * Establece la posicion de la formacion con la posicion pasada por parametro.
	 * @param p posicion a establecerle a la posicion formacion.
	 */
	public void setPosFormacion(Point p) {
		if(p!=null)
		   posicionFormacion = p;	
	}
	
	/**
	 * Devuelve la posicion de la formacion.
	 * @return posicion de la formacion.
	 */
	public Point getPosFormacion() {
		return posicionFormacion;
	}	
}
