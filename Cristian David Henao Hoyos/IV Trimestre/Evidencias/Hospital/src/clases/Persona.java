package clases;

import javax.swing.JOptionPane;

public abstract class Persona {

    private String numeroDeCC;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ciudadDeProcedencia;

    public void imprimirDatosPersona(String datos){
        datos += "Nombre: " + getNombre() + "\n";
        datos += "Apellido: " + getApellido() + "\n";
        datos += "Fecha de nacimiento: " + getFechaDeNacimiento() + "\n";
        datos += "Dirección: " + getDireccion() + "\n";
        datos += "Ciuadad de procedencia" + getCiudadDeProcedencia() +"\n";

        JOptionPane.showMessageDialog(null, datos);
    }

    public void registrarDatos(){
        setNumeroDeCC(JOptionPane.showInputDialog("Ingrese el número de documento: "));
        setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
        setApellido(JOptionPane.showInputDialog("Ingrese el apellido: "));
        setFechaDeNacimiento(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (dd/mm/aaaa): "));
        setDireccion(JOptionPane.showInputDialog("Ingrese la dirección: "));
        setCiudadDeProcedencia(javax.swing.JOptionPane.showInputDialog("Ingrese la ciudad de procedencia: "));
    }

    public String getNumeroDeCC() {
        return numeroDeCC;
    }

    public void setNumeroDeCC(String numeroDeCC) {
        this.numeroDeCC = numeroDeCC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadDeProcedencia() {
        return ciudadDeProcedencia;
    }

    public void setCiudadDeProcedencia(String ciudadDeProcedencia) {
        this.ciudadDeProcedencia = ciudadDeProcedencia;
    }

}
