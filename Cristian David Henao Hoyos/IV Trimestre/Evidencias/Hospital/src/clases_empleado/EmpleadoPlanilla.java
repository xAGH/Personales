package clases_empleado;

import javax.swing.JOptionPane;

public class EmpleadoPlanilla extends Empleado{
    
    private double salarioMensual;
    private double porcentajeAdicionalPorHoraExtra;

    @Override
    public void registrarDatos() {
        super.registrarDatos();

        while(true) {
            try {
                this.setSalarioMensual(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual: ")));
                break;
            } catch (Exception e) {}
        }
        while(true) {
            try {
                this.setPorcentajeAdicionalPorHoraExtra(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje adicional por hora extra: ")));
                break;
            } catch (Exception e) {}
        }
    }

    @Override
    public void imprimirDatosPersona(String datos) {
        datos += "Salario mensual: " + this.getSalarioMensual() + "\n";
        datos += "Porcentaje adicional por hora extra: " + this.getPorcentajeAdicionalPorHoraExtra() + "\n";

        super.imprimirDatosPersona(datos);
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double getPorcentajeAdicionalPorHoraExtra() {
        return porcentajeAdicionalPorHoraExtra;
    }

    public void setPorcentajeAdicionalPorHoraExtra(double porcentajeAdicionalPorHoraExtra) {
        this.porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra;
    }

}
