package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;   
import Hilos.HiloPrincipal;
import Juego.JuegoGrafica;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Clase GUI que extiende de JFrame.
 * @author Aldana Cas√© (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
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
	private Icon imagenVida[];
	private Icon imagenFuerza[];
	private Icon imagenCongelar[];
	private Icon imagenAEspecial[];
	private Icon imagenFinal[];
	
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
		
		/**
		 * Ver si es necesario ejecutar actualizarIndicadores().
		 */
		
	}
	
	
	//Metodos extras
	
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
		 * Vida
		 * Puntaje Falta tamaÒo texto
		 * Nivel.
		 */
		JuegoGrafica juego = JuegoGrafica.getInstance();
		
		puntaje.setText(""+juego.obtenerPuntaje());
		puntaje.setForeground(Color.white); 
		nivel.setText("Nivel: "+juego.obtenerNivel());
		nivel.setForeground(Color.white);
		
	}
	
	/**
	 * Cambia el panel de la ventana al panel de fin de juego mostrando el resultado de la
	 * partida. Si el resultado recibido como par√°metro es verdadero, se indica que se gano,
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
		pFinal = new JPanel();
		//pFinal.setBounds(100, 100, 200, 150);
		pFinal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pFinal);
		pFinal.setLayout(null);
		pFinal.setBackground(new Color(000));
		
		
		/*imagenFinal = new Icon [2];
		imagenFinal[0] =  new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/fuerza_on.png"));
		imagenFinal[1] =  new ImageIcon(this.getClass().getResource("/Galaxian/Interfaz/fuerza_off.png"));
		*/
		JLabel etiquetaGanar = new JLabel();
		//etiquetaGanar.setBounds(10, 10, 30, 30);
		//this.add(etiquetaGanar);
		
		etiquetaGanar.setFont(new Font("Italica", Font.ITALIC, 15));
		etiquetaGanar.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaGanar.setBounds(200, 100, 150, 42);
		pFinal.add(etiquetaGanar);
		
		JLabel etiquetaPerder= new JLabel();
		//etiquetaPerder.setBounds(10, 10, 30, 30);
		//this.add(etiquetaPerder);
		
		etiquetaPerder.setFont(new Font("Italica", Font.ITALIC, 15));
		etiquetaPerder.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaPerder.setBounds(200, 100, 150, 42);
		pFinal.add(etiquetaPerder);
		
		JuegoGrafica juego = JuegoGrafica.getInstance();
		JLabel PuntajeO = new JLabel();
		
		PuntajeO.setFont(new Font("Italica", Font.ITALIC, 15));
		PuntajeO.setHorizontalAlignment(SwingConstants.CENTER);
		PuntajeO.setBounds(200, 150, 150, 42);
		pFinal.add(PuntajeO);
		
		if(gano) {
			etiquetaGanar.setText("°Has ganado! ");
			etiquetaGanar.setForeground(Color.blue);
			//etiquetaGanar.setIcon(imagenFinal[1]);
		    PuntajeO.setText("Puntaje Obtenido: "+juego.obtenerPuntaje());
		    PuntajeO.setForeground(Color.yellow); 	
		}
		else {
			etiquetaPerder.setText("°Has perdido! ");
			etiquetaPerder.setForeground(Color.red); 
			//etiquetaPerder.setIcon(imagenFinal[0]);
		    PuntajeO.setText("Puntaje Obtenido: "+juego.obtenerPuntaje());
		    PuntajeO.setForeground(Color.white); 	
		}
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
		int x[]= new int[3];
		
		vida = new JLabel[3];
		for(int i=0; i<vida.length; i++){
			vida[i] = new JLabel();
			vida[i].setBounds(width - 40, 5, 30, 30);
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


	//METODOS PRIVADOS
	
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
