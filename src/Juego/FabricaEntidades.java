package Juego;

import java.awt.Point;
import Entidades.Enemigos.Caza;
import Entidades.Enemigos.Crucero;
import Entidades.Enemigos.E1;
import Entidades.Enemigos.Enemigo;
import Entidades.Enemigos.Rastreador;
import Entidades.Enemigos.Tonto;
import Entidades.Enemigos.TwoBehavior;
import Entidades.Obstaculos.CampoFuerza;
import Entidades.Obstaculos.Escombro;
import Entidades.Obstaculos.Obstaculo;
import Entidades.Obstaculos.Pared;
import Entidades.PowerUps.CongelarTiempo;
import Entidades.PowerUps.Fuerza;
import Entidades.PowerUps.MejoraArma;
import Entidades.PowerUps.PowerUp;
import Entidades.PowerUps.Proteccion;
import Entidades.PowerUps.Proyectil;
import Entidades.PowerUps.Puntaje;
import Entidades.PowerUps.Vida;

/**
 * Clase Fabrica de entidades.
 * @author Aldana Casé (104870), Facundo Pierrestegui (99694), Stefania Heinrich (106205).
 *
 */
public class FabricaEntidades {
	
	//Constructor
	public FabricaEntidades() {
	}
	
	//Metodos
	
	/**
	 * Crea un enemigo de acuerdo al tipo que se recibe y con la posicion recibida por parametro.
	 * @param tipo
	 * @param p posicion a asignar.
	 * @return enemigo.
	 */
	public Enemigo crearEnemigo(char tipo, Point p) {
		Enemigo e = null;
		switch (tipo) {
		case 'a' :
			//e = new E1(p);
			e = new Tonto(p);
			break;
		case 'b' :
			e = new Rastreador(p);
			break;
		case 'c' :
			e = new TwoBehavior(p);
			break;
		case 'd' :
			e = new Caza(p);
			break;
		case 'e' :
			e = new Crucero(p);
			break;
	}
		return e;
	}
	
	/**
	 * Crea un obstaculo de acuerdo al tipo que se recibe y con la posicion recibida por parametro.
	 * @param tipo
	 * @param p posicion a asignar.
	 * @return obstaculo.
	 */
	public Obstaculo crearObstaculo(char tipo, Point p) {
		Obstaculo o = null;
		
		switch (tipo) {
		case 'a' :
			o = new Escombro(p);
			break;
		case 'b' :
			o = new Pared(p);
			break;
		case 'c' :
			o = new CampoFuerza(p);
			break;
		}
		
		return o;
	}
	
	/**
	 * Crea un PowerUp de acuerdo al tipo que se recibe y con la posicion recibida por parametro.
	 * @param tipo
	 * @param p posicion a asignar.
	 * @return power up.
	 */
	public PowerUp crearPowerUp(int tipo, Point p) {
		PowerUp pU = null;
		
		switch (tipo) { 
		case 0 :
			pU = new Puntaje(p);
			break;
		case 1 :
			pU = new Vida(p);
			break;
		case 2 :
			pU = new Proyectil(p);
			break;
		case 3 :
			pU = new Proteccion(p);
			break;
		case 4 :
			pU = new MejoraArma(p);
			break;
		case 5 :
			pU = new Fuerza(p);
			break;
		case 6 :
			pU = new CongelarTiempo(p);
			break;
		}
		
		return pU;		
	}
}
