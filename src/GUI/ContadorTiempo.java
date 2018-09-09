package GUI;

import Juego.Juego;

/**
 * 
 * @author
 *
 */
public class ContadorTiempo extends Thread{
	
	private Juego game;

	public ContadorTiempo(Juego g){
		game = g;
	}
	
	//Metodos
	
	public void run() {
		while(game.hayEnemigos()) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//game.mover();
		}
		/**
		 * cuando se acaben los enemigos, luego hay que
		 * realizar la carga del siguiente nivel y
		 * re posicionar al jugador en el centro.
		 */
	}
}
