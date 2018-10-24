package Juego;

import java.util.LinkedList;

import javax.swing.JLabel;

import Entidades.*;
import Entidades.Enemigos.Enemigo;

/**
 * 
 * @author
 *
 */
public class HiloPrincipal extends Thread{
	
	private LinkedList<Enemigo> enemigos;
	private LinkedList<Entidad> entidades;
	private LinkedList<Enemigo> elimEnemigos;
	private LinkedList<Entidad> elimEntidades;

	public HiloPrincipal(){
		JuegoHilo juego = JuegoHilo.getInstance();
		enemigos = juego.obtenerEnemigos();
		entidades = juego.obtenerEntidades();
	}
	
	//Metodos
	
	public void run() {
		JuegoHilo juego = JuegoHilo.getInstance();
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			elimEnemigos = new LinkedList<Enemigo>();
			elimEntidades = new LinkedList<Entidad>();
			colisionarEnemigos();
			elimEnemigos();
			colisionarEntidades();
			elimEntidades();
			
			if(!juego.hayEnemigos()) {
				juego.siguienteNivel();
			}
		}
		
	}

	//Metodos Privados

	private void colisionarEnemigos() {
		for(Enemigo enem : enemigos) {
			enem.mover();
			
			//Colisionar entidades
			for(Entidad ent: entidades) {
				if(colisionan(enem.getGrafico(), ent.getGrafico())) {
					enem.colisionar(ent);
				}	
			}
			
			//colisionar Jugador
			JuegoHilo juego = JuegoHilo.getInstance();
			if(colisionan(enem.getGrafico(), juego.obtenerJugador().getGrafico())) {
				enem.colisionar(juego.obtenerJugador());
				verificarVidaJugador();
			}
			//agregar enemigo sin vida a eliminar
			if(enem.cantVidas() <= 0) {
				elimEnemigos.add(enem);
			}
		}
	}

	private void colisionarEntidades() {
		for(Entidad ent : entidades) {
			ent.mover();
			
			//Colisionar entidades
			for(Enemigo enem : enemigos) {
				if(colisionan(ent.getGrafico(), enem.getGrafico())) {
					ent.colisionar(enem);
				}					
			}
			
			//colisionar Jugador
			JuegoHilo juego = JuegoHilo.getInstance();
			if(colisionan(ent.getGrafico(), juego.obtenerJugador().getGrafico())) {
				ent.colisionar(juego.obtenerJugador());
				verificarVidaJugador();
			}
			
			//agregar entidad sin vida a eliminar
			if(ent.cantVidas() <= 0) {
				elimEntidades.add(ent);
			}
		}
	}

	private void elimEnemigos() {
		JuegoHilo juego = JuegoHilo.getInstance();
		for(Enemigo enem : elimEnemigos) {
			juego.eliminarEnemigo(enem);
		}
	}
	
	private void elimEntidades() {
		JuegoHilo juego = JuegoHilo.getInstance();
		for(Entidad ent : elimEntidades) {
			juego.eliminarEntidad(ent);
		}
	}
	
	private boolean colisionan(JLabel l1, JLabel l2) {
		boolean colisionan = false;
		
		int x_centro = l1.getX() + l1.getWidth();
		int y_centro = l1.getY() + l1.getHeight();
		int x_centro2 = l2.getX() + l2.getWidth();
		int y_centro2 = l2.getY() + l2.getHeight();
		
		if((x_centro > l2.getX()) && (x_centro < x_centro2))
			if((y_centro > l2.getY()) && (y_centro < y_centro2)) 
				colisionan = true;
		
		return colisionan;
	}
	
	private void verificarVidaJugador() {
		JuegoHilo juego = JuegoHilo.getInstance();
		if (juego.obtenerJugador().estoyMuerto()) {
			juego.seMurioJugador();
		}
	}
}