package clases_empleado;

import javax.swing.JOptionPane;
import clases.Persona;

public abstract class Empleado extends Persona {
    
    private String codigoDeEmpleado;
    private int numeroDeHorasExtras;
    private String fechaDeIngreso;
    private String area;
    private String cargo;

    @Override
    public void registrarDatos() {
        super.registrarDatos();

        this.setCodigoDeEmpleado(JOptionPane.showInputDialog("Ingrese el códido del empleado: "));
        while(true){
            try {
                this.setNumeroDeHorasExtras(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de horas extra: ")));
                break;
            } catch (Exception e) {}
        }
        this.setFechaDeIngreso(JOptionPane.showInputDialog("Ingrese la fecha de ingreso (dd/mm/aaaa): "));
        this.setFechaDeIngreso(JOptionPane.showInputDialog("Ingrese la fecha de ingreso (dd/mm/aaaa): "));
        this.setArea(JOptionPane.showInputDialog("Ingrese el área: "));
        this.setCargo(JOptionPane.showInputDialog("Ingrese el cargo: "));
    }

    @Override
    public void imprimirDatosPersona(String datos) {
        datos += "Código de empleado: " + this.getCodigoDeEmpleado() + "\n";
        datos += "Número de horas extras: " + this.getNumeroDeHorasExtras() + "\n";
        datos += "Fecha de ingreso: " + this.getFechaDeIngreso() + "\n";
        datos += "Área: " + this.getArea() + "\n";
        datos += "Cargo: " + this.getCargo() + "\n";

        
        super.imprimirDatosPersona(datos);
    }

    public String getCodigoDeEmpleado() {
        return codigoDeEmpleado;
    }

    public void setCodigoDeEmpleado(String codigoDeEmpleado) {
        this.codigoDeEmpleado = codigoDeEmpleado;
    }

    public int getNumeroDeHorasExtras() {
        return numeroDeHorasExtras;
    }

    public void setNumeroDeHorasExtras(int numeroDeHorasExtras) {
        this.numeroDeHorasExtras = numeroDeHorasExtras;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
