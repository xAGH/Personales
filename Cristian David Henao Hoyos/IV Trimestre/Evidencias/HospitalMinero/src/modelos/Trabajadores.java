package modelos;

import java.util.ArrayList;

// Clase que proporcionará el VO
public class Trabajadores {
	
	private ArrayList<Trabajador> listaTrabajadores;
	
	public Trabajadores() {
		this.listaTrabajadores = new ArrayList<Trabajador>();
	}
	
	public ArrayList<Trabajador> getTrabajadores() {
		return this.listaTrabajadores;
	}
	
	public void addTrabajador(Trabajador trabajador) {
		this.listaTrabajadores.add(trabajador);
	}
}
