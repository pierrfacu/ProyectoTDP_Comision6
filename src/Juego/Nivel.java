package Juego;

import Entidades.Enemigos;
import java.util.LinkedList;

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
	public LinkedList<Enemigos> obtenerEnemigos(){
		LinkedList<Enemigos> e = new LinkedList<Enemigos>();
		
		//Completar
			
		return e;		
	}
	
	
	//Metodos privados
}
