package Armas;

public abstract class Arma {
	
	protected int danioExtra;
	
	//Constructor
	protected Arma() {
		danioExtra = 1;
	}
	
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
