package Inteligencia;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Estados.Tontear;

/**
 * 
 * @author  Aldana Cas� (104870), Facundo Pierrestegui (99694), Stefania Heirich (106205)
 *
 */

public class Mareado extends Inteligencia {
	
	//Constructor
	public Mareado(Enemigo e) {
		super (e);
	}
	
	//Metodos
	
	public void ejecutar() {
		estado.ejecutar();		
	}
	
	public void establecerAtaque() {
		estado = new Tontear(this,enemigo) ;
	}
}
