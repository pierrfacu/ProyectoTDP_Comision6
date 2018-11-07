package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	
	private JPanel pFinal;
	
	private HiloPrincipal hiloPrincipal;
	
	//Atributos panel juego
	private JLabel nivel;
	private JLabel puntaje;
	private JLabel vida [];
	private JLabel fuerza;
	private JLabel congelar;
	private JLabel armEspecial;
	private int x_vida[];
	private Icon imagenVida[];
	private Icon imagenFuerza[];
	private Icon imagenCongelar[];
	private Icon imagenAEspecial[];
	
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
		
		/**
		 * ACA ESTABLECER LA POSICION DE LOS INDICADORES
		 * Posiciones:
		 * 1) Lado superior izquierdo: nivel. Poner Nivel en 1
		 * 2) Lado superior derecho: puntaje. Al puntaje ponerlo en cero.
		 * 3) lado inferior izquierdo: vidas del jugador.  Vidas, completas. Imagenes 30*30
		 * 4) Lado inferior derecho: poner Powerup en estado inactivo. Siendo, congelarTiempo, fuerza y proyectil. Imagenes 30x30
		 */
		
		crearIndicadores();
		
		JuegoGrafica juego = JuegoGrafica.getInstance();
		juego.establecerGrafica(this);
		juego.iniciarJuego();
		hiloPrincipal = new HiloPrincipal();
		hiloPrincipal.start();
		
		actualizarIndicadores();		
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
		//juego.obtenerJugador().getGrafico().repaint();
		//this.repaint();
		
	}
	
	/**
	 * Actualiza los indicadores de estado en la interfaz del juego.
	 */
	public void actualizarIndicadores() {
		/**
		 * TERMINAR
		 * Se actualizaran:
		 * Vida LISTO
		 * Puntaje Falta tama�o texto
		 * Nivel.Falta tama�o texto
		 */
		JuegoGrafica juego = JuegoGrafica.getInstance();
		
		puntaje.setText(""+juego.obtenerPuntaje());
		puntaje.setForeground(Color.white); 
		
		nivel.setText("Nivel: "+juego.obtenerNivel());
		nivel.setForeground(Color.white);
		
		actualizarVidas(juego.obtenerJugador().cantVidas(), juego.obtenerJugador().porcentajeVida());
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
		 * 3) Opcional, Botones de: volver a jugar y salir.
		 * 4) Opcional, cambiar fondo.
		 */
		if(gano)
			System.out.println("Has ganado.");
		else System.out.println("Has perdido.");
		JuegoGrafica juego = JuegoGrafica.getInstance();
		System.out.println(juego.obtenerPuntaje());
		hiloPrincipal.stop();
	}
	
	public void setFuerza(boolean est) {
		if(est)
			fuerza.setIcon(imagenFuerza[1]);
		else
			fuerza.setIcon(imagenFuerza[0]);
			
	}
	
	public void setCongelarTiempo(boolean est) {
     	if(est)
				congelar.setIcon(imagenCongelar[1]);
			else
				congelar.setIcon(imagenCongelar[0]);
	}
	
	public void setArmaEspecial(boolean est) {
    	if(est)
			armEspecial.setIcon(imagenAEspecial[1]);
		else
			armEspecial.setIcon(imagenAEspecial[0]);
	}
	
	//METODOS PRIVADOS
	
	private void crearIndicadores(){
		cargarImagenes();
		
		//Nivel 
		nivel = new JLabel();
		nivel.setBounds(5, 5, 60, 20);
		this.add(nivel);
		
		//Puntaje
		puntaje = new JLabel();
		puntaje.setBounds(width - 40, 5, 60, 20);
		this.add(puntaje);
		
		//Vidas
		x_vida = new int[3];
		x_vida[0] = 5;
		x_vida[1] = 40;
		x_vida[2] = 75;
		
		vida = new JLabel[3];
		for(int i=0; i<vida.length; i++){
			vida[i] = new JLabel(imagenVida[0]);
			vida[i].setBounds(x_vida[i], height - 65, 30, 30);
			this.add(vida[i]);
		}
		
		//Fuerza
		fuerza = new JLabel();
		fuerza.setIcon(imagenFuerza[0]);
		fuerza.setBounds(width - 120,height - 65, 30, 30);
		this.add(fuerza);
		
		//Congelar tiempo
		congelar = new JLabel();
		congelar.setIcon(imagenCongelar[0]);
		congelar.setBounds(width - 80,height - 65, 30, 30);
		this.add(congelar);
		
		//Arma especial
		armEspecial = new JLabel();
		armEspecial.setIcon(imagenAEspecial[0]);
		armEspecial.setBounds(width - 40,height - 65, 30, 30);
		this.add(armEspecial);
	}
	
	private void actualizarVidas(int cantVidas, int porcVid) {
		
		
		switch (cantVidas){
		case 0 : {//No deberia entrar aca, peeeeeero por las dudas
			for(int i=0; i<vida.length; i++){
				vida[i].setIcon(imagenVida[4]);
				vida[i].setBounds(x_vida[i], height - 65, 30, 30);
			}
			break;
		}
		case 1 : {//Vida 1
			int cantV = cantVidas - 1;
			
			vida[cantV].setIcon(imagenVidaPorcentaje(porcVid));
			vida[cantV].setBounds(x_vida[cantV], height - 65, 30, 30);
			
			for(int i = (cantV + 1); i < 3; i++) {			
				vida[i].setIcon(imagenVida[4]);
				vida[i].setBounds(x_vida[i], height - 65, 30, 30);
			}
			break;
		}
		case 2 : {//Vida 2
			int cantV = cantVidas - 1;
			
			vida[0].setIcon(imagenVida[0]);
			vida[0].setBounds(x_vida[0], height - 65, 30, 30);
			
			vida[cantV].setIcon(imagenVidaPorcentaje(porcVid));
			vida[cantV].setBounds(x_vida[cantV], height - 65, 30, 30);
			
			vida[2].setIcon(imagenVida[4]);
			vida[2].setBounds(x_vida[2], height - 65, 30, 30);
			break;
		}
		case 3 : {//Vida 3
			int cantV = cantVidas - 1;
			
			for(int i = 0; i < (cantV + 1); i++) {			
				vida[i].setIcon(imagenVida[0]);
				vida[i].setBounds(x_vida[i], height - 65, 30, 30);
			}
			
			vida[cantV].setIcon(imagenVidaPorcentaje(porcVid));
			vida[cantV].setBounds(x_vida[cantV], height - 65, 30, 30);
			break;
		}
		}	
		
	}
	
	private Icon imagenVidaPorcentaje(int porcV) {
		Icon image = null;
		
		if(porcV == 0)
			image = imagenVida[4];
		if(porcV > 0 && porcV <= 25)
			image = imagenVida[3];
		if(porcV > 25 && porcV <= 50)
			image = imagenVida[2];
		if(porcV > 50 && porcV <= 75)
			image = imagenVida[1];
		if(porcV > 75 && porcV <= 100)
			image = imagenVida[0];
		
		return image;
	}
	
	private void cargarImagenes() {
		imagenVida = new Icon[5];
		imagenVida[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/vida100.png"));
		imagenVida[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/vida75.png"));
		imagenVida[2] = new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/vida50.png"));
		imagenVida[3] = new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/vida25.png"));
		imagenVida[4] = new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/vida0.png"));
		
		imagenFuerza = new Icon[2];
		imagenFuerza[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/fuerza_off.png"));
		imagenFuerza[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/fuerza_on.png"));
		
		imagenCongelar = new Icon[2];
		imagenCongelar[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/congelartiempo_off.png"));
		imagenCongelar[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/congelartiempo_on.png"));
		
		imagenAEspecial = new Icon[2];
		imagenAEspecial[0] = new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/proyectil_off.png"));
		imagenAEspecial[1] = new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/proyectil_on.png"));
	}
	
} 
