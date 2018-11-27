package Inteligencia;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Estados.Buscar;

/**
 * 
 * @author  Aldana Cas� (104870), Facundo Pierrestegui (99694), Stefania Heirich (106205)
 *
 */

public class Buscador extends Inteligencia {	
	
	//Constructor
	public Buscador (Enemigo e) {
		super(e);
	}
	
	//Metodos
	
	public void ejecutar() {
		estado.ejecutar();		
	}
	
	public void establecerAtaque() {
		estado = new Buscar(this,enemigo) ;
	}
}
