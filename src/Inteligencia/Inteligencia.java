package Inteligencia;

import java.awt.Point;
import Entidades.Enemigos.Enemigo;
import Inteligencia.Estados.EnFormacion;
import Inteligencia.Estados.Estado;


public abstract class Inteligencia {
	protected static final int velFormacion = 40;
	protected Enemigo enemigo;
	protected Point posicionFormacion;
	protected int velocidad;
	protected boolean ataco;
	protected boolean meSali;
	protected int contSecMF;
	protected Estado estado;
	
	//Constructor
	public Inteligencia(Enemigo e) {
		enemigo = e;
		posicionFormacion = enemigo.getPosition();
		velocidad = enemigo.getVelocidad();
		contSecMF = 0;
		ataco = false;
		meSali = false;
		estado = new EnFormacion (this, e);
	} 
	
	//Metodos abstractos
	
	public abstract void ejecutar();
	
	//Metodos
	
	public void setEstado(Estado e) {
		estado = e;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setPosFormacion(Point p) {
		if(p!=null)
		   posicionFormacion = p;	
	}
	
	public Point getPosFormacion() {
		return posicionFormacion;
	}	
}
