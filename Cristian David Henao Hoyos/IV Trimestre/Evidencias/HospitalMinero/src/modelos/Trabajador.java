package modelos;

public class Trabajador {
	private String empresa;
	private String documento;
	private String nombre;
	private String direccion;
	private String telefono;
	private char tipo; // El tipo podr� ser M o O, donde M es minero y O operario.
	private String tratamiento;
	private int diasHospitalizacion;
	private double costoMedicamentos;
	private double costoMedico;

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
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

	public String getTratamiento() {
		return this.tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public int getDiasHospitalizacion() {
		return this.diasHospitalizacion;
	}

	public void setDiasHospitalizacion(int diasHospitalizacion) {
		this.diasHospitalizacion = diasHospitalizacion;
	}

	public double getCostoMedicamentos() {
		return this.costoMedicamentos;
	}

	public void setCostoMedicamentos(double costoMedicamentos) {
		this.costoMedicamentos = costoMedicamentos;
	}

	public double getCostoMedico() {
		return this.costoMedico;
	}

	public void setCostoMedico(double costoMedico) {
		this.costoMedico = costoMedico;
	}

	@Override
	public String toString() {
		String tipoCompleto = "";
		if (tipo == 'M') {
			tipoCompleto = "Minero";
		} else {
			tipoCompleto = "Operario";
		}
		return "Empresa: " + empresa + "\nDocumento: " + documento + "\nNombre: " + nombre + "\nDirección: "
				+ direccion + "\nTeléfono: " + telefono + "\nTipo: " + tipoCompleto + "\nTratamiento: " + tratamiento
				+ "\nDias de hospitalización: " + diasHospitalizacion + "\n Costo de medicamentos: " + costoMedicamentos
				+ "\nGastos médicos totales: " + costoMedico;
	}
}
