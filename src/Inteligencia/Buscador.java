package Inteligencia;

import Entidades.Enemigos.Enemigo;
import Inteligencia.Estados.Buscar;
import java.util.Random;

/**
 * 
 * @author  Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heirich (106205)
 *
 */

public class Buscador extends Inteligencia {	
	
	//Constructor
	public Buscador (Enemigo e) {
		super(e);
	}
	
	//Metodos
	
	public void ejecutar() {
		Random rnd = new Random();
		int n=rnd.nextInt(30);
		if (estado.isAtaco() && n<1)
			estado = new Buscar(this,enemigo) ;
		estado.ejecutar();
		
	}
}
