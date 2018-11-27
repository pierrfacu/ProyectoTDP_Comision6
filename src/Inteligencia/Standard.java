package Inteligencia;

import Entidades.Enemigos.EnemigoArmado;
import Inteligencia.Estados.TontearDispara;

/**
 * 
 * @author  Aldana Cas� (104870), Facundo Pierrestegui (99694), Stefania Heirich (106205)
 *
 */

public class Standard extends Inteligencia{
	
	protected EnemigoArmado enemigo;
	
	//Constructor
	public Standard(EnemigoArmado e) {
		super(e);
		this.enemigo = e;
	}

	//Metodos
	public void ejecutar() {
		estado.ejecutar();		
	}
	
	public void establecerAtaque() {
		estado = new TontearDispara(this, this.enemigo) ;
	}
}
