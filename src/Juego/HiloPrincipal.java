package Juego;

/**
 * 
 * @author
 *
 */
public class HiloPrincipal extends Thread{
	
	private Juego juego;

	public HiloPrincipal(Juego j){
		juego = j;
	}
	
	//Metodos
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		/**
		 * cuando se acaben los enemigos, luego hay que
		 * realizar la carga del siguiente nivel
		 */
	}
}
