package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.HiloPrincipal;
import Juego.JuegoGrafica;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 
 * @author 
 *
 */
public class gui extends JFrame {
	
	private static final int width = 600;
	private static final int height = 700;
	
	private JPanel contentPane;
	
	private JuegoGrafica juego;
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
		
		juego = JuegoGrafica.getInstance();
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
		juego.obtenerJugador().mover(key.getKeyCode());
		juego.obtenerJugador().disparar(key.getKeyCode());
		this.repaint();
	}
}
