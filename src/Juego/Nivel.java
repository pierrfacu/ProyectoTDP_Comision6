package Juego;

import java.io.*;
import java.util.*;
import java.awt.Point;
import Entidades.Enemigos.*;


/**
 * 
 * @author 
 *
 */
public class Nivel {
	//Atributos de clase
	private static int N_Inicial = 1;
	private static int N_Final = 1; //No definido aun
	
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
	 * Devuelve el nivel maximo del juego
	 * @return nivel maximo.
	 */
	public int obtenerNivelMax() {
		return N_Final;
	}
	
	/**
	 * Devuelve verdadero si se pudo establecer el siguiente nivel, caso contrario falso, indicando que no hay mas niveles.
	 * @return verdadero si se avanzo de nivel, caso contrario falso.
	 */
	public boolean siguienteNivel(){
		boolean haySig = false;
		if (N_Actual < N_Final) {
			N_Actual++;
			haySig = true;
		}
		return haySig;
	}
	
	/**
	 * Devuelve una coleccion de enemigos de acuerdo al nivel a cargar, requiere que se establezca el siguiente nivel.
	 * @return Coleccion de enemigos.
	 */
	public LinkedList<Enemigo> obtenerEnemigos(){
		LinkedList<Enemigo> e = new LinkedList<Enemigo>();
		
		BufferedReader br = null;
		File fileNAct = new File(this.getClass().getResource("/Galaxian/Niveles/n"+N_Actual+".txt").getPath());
		
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(fileNAct));
			// Para cada linea del archivo, representa una fila en la formación
            while ((sCurrentLine = br.readLine()) != null) {
            	// Para cada letra de la linea
            	int i = 0;
            	while(i < sCurrentLine.length()){
            		char tipo = sCurrentLine.charAt(i); //Obtengo tipo de enemmigo
            		int x = 0;
            		int y = 0;
            		i++;
            		while(i < sCurrentLine.length() && sCurrentLine.charAt(i) != ' ') {
            			x = leerVariable(i, sCurrentLine);
            			i = i + 3;
            			y = leerVariable(i, sCurrentLine);
            			i = i + 3;
            		}
            		if(i < sCurrentLine.length())
            			if(sCurrentLine.charAt(i) == ' ')
            				i++;
             		e.addLast(crearEnemigo(tipo, x, y));
            	}
            }
			
		} catch (IOException u) { // Esto es por si ocurre un error
            u.printStackTrace();
        } finally { // Esto es para que, haya ocurrido error o no
            try {
                if (br != null)br.close(); // Cierre el archivo
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		return e;		
	}
	
	
	//Metodos privados
	
	/**
	 * 
	 * @param tipo
	 * @param x
	 * @param y
	 * @return
	 */
	private Enemigo crearEnemigo(char tipo, int x, int y) {
		Enemigo e = null;
		switch (tipo) {
		case 'a' : // Si aparece una a
			e = new E1(new Point( x, y));
			break;
		case 'b' :
			
			break;
		case 'c' :
			
			break;
		}
		return e;
	}
	
	/**
	 * 
	 * @param i
	 * @param sCurrentLine
	 * @return
	 */
	private int leerVariable(int i, String sCurrentLine) {
		String variable = "";
		int j = 0;
		while(j < 3 && i < sCurrentLine.length()){
			variable = variable + sCurrentLine.charAt(i);
			i++;
			j++;
		}
		return Integer.parseInt(variable);
	}
}
