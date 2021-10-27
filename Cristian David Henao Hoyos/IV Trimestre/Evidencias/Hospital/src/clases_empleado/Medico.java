package clases_empleado;

import javax.swing.JOptionPane;

public class Medico extends EmpleadoPlanilla{
    
    private String especialidad;
    private int numeroDeConsultorio;

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void registrarDatos() {
        super.registrarDatos();

        this.setEspecialidad(JOptionPane.showInputDialog("Ingrese la especialidad: "));
        while(true) {
            try {
                this.setNumeroDeConsultorio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de consultorio: ")));
                break;
            } catch (Exception e) {}
        }
    }

    @Override
    public void imprimirDatosPersona(String datos) {
        super.imprimirDatosPersona(datos);

        datos = "Especialidad: " + this.getEspecialidad() + "\n";
        datos += "Número de consultorio: " + this.getNumeroDeConsultorio() + "\n";
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public int getNumeroDeConsultorio() {
        return numeroDeConsultorio;
    }

    public void setNumeroDeConsultorio(int numeroDeConsultorio) {
        this.numeroDeConsultorio = numeroDeConsultorio;
    }

}
