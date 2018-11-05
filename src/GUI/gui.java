package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;   
import Hilos.HiloPrincipal;
import Juego.JuegoGrafica;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Clase GUI que extiende de JFrame.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private  int width = 600;
	private int height = 700;
	
	private JPanel contentPane;
	
	private HiloPrincipal hiloPrincipal;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public gui() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				accionesJugador(arg0);
			}
		});
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(width, height));
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(000));
		
		JuegoGrafica juego = JuegoGrafica.getInstance();
		juego.establecerGrafica(this);
		juego.iniciarJuego();
		hiloPrincipal = new HiloPrincipal();
		hiloPrincipal.start();
	}
	
	
	//Metodos extras
	
	public int altoGrafica() {
		return height;
	}
	
	public int anchoGrafica() {
		return width;
	}
	
	protected void accionesJugador(KeyEvent key){
		JuegoGrafica juego = JuegoGrafica.getInstance();
		juego.obtenerJugador().accionar(key.getKeyCode());
		this.repaint();
	}
	
	/**
	 * Actualiza los indicadores de estado en la interfaz del juego.
	 */
	public void actualizarIndicadores() {
		/**
		 * TERMINAR
		 * 1) Lado superior izquierdo: nivel.
		 * 2) Lado superior derecho: puntaje.
		 * 3) lado inferior izquierdo: vidas del jugador.
		 * 4) lado inferior derecho, power ups activos/inactivos.
		 */
		JuegoGrafica juego = JuegoGrafica.getInstance();
		System.out.println(juego.obtenerPuntaje());
		
	}
	
	/**
	 * Cambia el panel de la ventana al panel de fin de juego mostrando el resultado de la
	 * partida. Si el resultado recibido como parámetro es verdadero, se indica que se gano,
	 * caso contrario, se perdio.
	 * @param gano verdadero si se gano, caso conrario, se perdio.
	 */
	public void partidaFinalizada(boolean gano) {
		/**
		 * TERMINAR
		 * -Agregar:
		 * 1) panel final
		 * 2) Poner el estado final de la partida con el puntaje obtenido.
		 * 3) Botones de: volver a jugar y salir.
		 * 4) Opcional, cambiar fondo.
		 */
		if(gano)
			System.out.println("Has ganado.");
		else System.out.println("Has perdido.");
		JuegoGrafica juego = JuegoGrafica.getInstance();
		System.out.println(juego.obtenerPuntaje());
		//hiloPrincipal.stop();
	}
}
