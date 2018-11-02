package Inteligencia;


import java.util.Random;


import Entidades.Enemigos.EnemigoArmado;
import Inteligencia.Estados.TontearDispara;


public class Standard extends Inteligencia{
	
	protected EnemigoArmado enemigo;
	
	//Constructor
	public Standard(EnemigoArmado e) {
		super(e);
		this.enemigo = e;
	}

	//Metodos
	public void ejecutar() {
		
		Random rnd = new Random();
		int n=rnd.nextInt(30);
		if (estado.isAtaco() && n<1)
			estado = new TontearDispara(this, this.enemigo) ;
		estado.ejecutar();
		
	}
}
