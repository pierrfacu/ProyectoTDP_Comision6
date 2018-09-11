package Juego;

import Entidades.Enemigo;
import Entidades.Enemigos.E1;

import java.util.LinkedList;

/**
 * 
 * @author 
 *
 */
public class Nivel {
	//Atributos de clase
	private static int N_Inicial = 1;
	private static int N_Final = 3; //No definido aun
	
	//Atributos de instancia
	private int N_Actual;
		
	//Constructor
	public Nivel() {
		N_Actual = N_Inicial;
	}
	
	//Metodos
	
	/**
	 * Devuelve el nivel actual del juego
	 * @return nivel actual del juego.
	 */
	public int obtenerNivelActual(){
		return N_Actual;
	}
	
	/**
	 * 
	 */
	public void siguienteNivel(){
		if (N_Actual < N_Final)
			N_Actual++;
	}
	
	/**
	 * Devuelve una coleccion de enemigos de acuerdo al nivel a cargar, requiere que se establezca el siguiente nivel.
	 * @return Coleccion de enemigos.
	 */
	public LinkedList<Enemigo> obtenerEnemigos(){
		LinkedList<Enemigo> e = new LinkedList<Enemigo>();
		
		Enemigo e1 = new E1(10, 100, 150);
		e.addLast(e1);
		Enemigo e2 = new E1(10, 250, 150);
		e.addLast(e2);
		Enemigo e3 = new E1(10, 400, 150);
		e.addLast(e3);
			
		return e;		
	}
	
	
	//Metodos privados
}
