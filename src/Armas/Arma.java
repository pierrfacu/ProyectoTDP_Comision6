package Armas;

/**
 * Clase abstracta Arma.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public abstract class Arma {
	
	protected int danioExtra;
	
	//Constructor
	protected Arma() {
		danioExtra = 1;
	}
	
	//Metodos
	
	/**
	 * Genera el disparo.
	 */
	public abstract void accionar();
	
	/**
	 * Multiplica la fuerza de impacto del disparo del arma.
	 * @param d 
	 */
	public void aumentarDanio(int d) {
		danioExtra = d;
	}
}
