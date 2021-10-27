package clases_empleado;

import javax.swing.JOptionPane;

public class EmpleadoEventual extends Empleado{
    
    private double honorariosPorHoras;
    private String fechaTerminoContrato;

    @Override
    public void registrarDatos() {
        super.registrarDatos();

        while(true){
            try {
                this.setHonorariosPorHoras(Double.parseDouble
                (JOptionPane.showInputDialog("Ingrese el sexo: ")));
                break;
            } catch (Exception e) {}
        }
        this.setFechaTerminoContrato(JOptionPane.showInputDialog("Ingrese fecha de terminación del contrato (dd/mm/aaaa): "));
    }

    @Override
    public void imprimirDatosPersona(String datos) {
        super.imprimirDatosPersona(datos);

        datos = "Horarios por hora: " + this.getHonorariosPorHoras() + "\n";
        datos += "Fecha de terminación de contrato" + this.getFechaTerminoContrato() + "\n";
    }

    public double getHonorariosPorHoras() {
        return honorariosPorHoras;
    }

    public void setHonorariosPorHoras(double honorariosPorHoras) {
        this.honorariosPorHoras = honorariosPorHoras;
    }

    public String getFechaTerminoContrato() {
        return fechaTerminoContrato;
    }

    public void setFechaTerminoContrato(String fechaTerminoContrato) {
        this.fechaTerminoContrato = fechaTerminoContrato;
    }

}

