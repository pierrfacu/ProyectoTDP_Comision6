package Juego;

import java.io.*;
import java.util.*;
import Entidades.Enemigo;
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
	 * 
	 * @return
	 */
	public int obtenerNivelMax() {
		return N_Final;
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
            			x = leerX(i, sCurrentLine);
            			i = i + 3;
            			y = leerY(i, sCurrentLine);
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
			e = new E1(10, x, y);
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
	private int leerX(int i, String sCurrentLine) {
		String x = "";
		int j = 0;
		while(j < 3 && i < sCurrentLine.length()){
			x = x + sCurrentLine.charAt(i);
			i++;
			j++;
		}
		return Integer.parseInt(x);
	}
	
	/**
	 * 
	 * @param i
	 * @param sCurrentLine
	 * @return
	 */
	private int leerY(int i, String sCurrentLine) {
		String y = "";
		int j = 0;
		while(j < 3 && i < sCurrentLine.length()){
			y = y + sCurrentLine.charAt(i);
			i++;
			j++;
		}
		return Integer.parseInt(y);
	}
}
