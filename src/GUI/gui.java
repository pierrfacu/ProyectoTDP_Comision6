package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.HiloPrincipal;
import Juego.Juego;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 
 * @author 
 *
 */
public class gui extends JFrame {
	private JPanel contentPane;
	
	private Juego juego;
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
		setSize(new Dimension(600, 700));
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(000));
		
		juego = new Juego(this);
		hiloPrincipal = new HiloPrincipal(juego);
		hiloPrincipal.start();
	}
	
	protected void accionesJugador(KeyEvent key){
		juego.obtenerJugador().mover(key.getKeyCode());
		juego.obtenerJugador().disparar(juego, key.getKeyCode());
		this.repaint();
	}
}
