package modelos;

public class Trabajador {
	private static int contador;
	private int documento;
	private String nombre;
	private String direccion;
	private String telefono;
	private char tipo; // El tipo podrá ser M o O, donde M es minero y O operario.
	
	public Trabajador(int documento, 
					  String nombre, 
					  String direccion, 
					  String telefono, 
					  char tipo) {
		this.documento = documento;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
	}

	public int getContador() {
		return contador;
	}
	
	public int getDocumento() {
		return this.documento;
	}
	
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public char getTipo() {
		return this.tipo;
	}
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
}
