package clases;

import clases_empleado.EmpleadoPlanilla;
import clases_empleado.EmpleadoEventual;
import clases_empleado.Medico;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class ModeloDatos {
 
    HashMap<String, Paciente> pacientesMap;
    HashMap<String, EmpleadoPlanilla> empleadoPlanillaMap;
    HashMap<String, EmpleadoEventual> empleadoEventualMap;
    HashMap<String, Medico> medicoMap;
    ArrayList<CitaMedica> citasList;
    String msj;

    public ModeloDatos(){
        pacientesMap = new HashMap<String, Paciente>();
        empleadoPlanillaMap = new HashMap<String, EmpleadoPlanilla>();
        medicoMap = new HashMap<String, Medico>();
        empleadoEventualMap = new HashMap<String, EmpleadoEventual>();
        citasList = new ArrayList<CitaMedica>();
    }

    public void registarPersona(Paciente miPaciente) {
        pacientesMap.put(miPaciente.getNumeroDeCC(), miPaciente);
        JOptionPane.showMessageDialog(null, "Se ha registrado al paciente" + miPaciente.getNombre() + " satisfactoriamente.");
    }

    public void registarPersona(EmpleadoPlanilla miEmpleadoPlanilla) {
        empleadoPlanillaMap.put(miEmpleadoPlanilla.getNumeroDeCC(), miEmpleadoPlanilla);
        JOptionPane.showMessageDialog(null, "Se ha registrado al empleado por planilla" + miEmpleadoPlanilla.getNombre() + " satisfactoriamente.");
    }

    public void registarPersona(EmpleadoEventual miEmpleadoEventual) {
        empleadoEventualMap.put(miEmpleadoEventual.getNumeroDeCC(), miEmpleadoEventual);
        JOptionPane.showMessageDialog(null, "Se ha registrado al empleado eventual" + miEmpleadoEventual.getNombre() + " satisfactoriamente.");
    }

    public void registarPersona(Medico miMedico) {
        medicoMap.put(miMedico.getNumeroDeCC(), miMedico);
        JOptionPane.showMessageDialog(null, "Se ha registrado al médico" + miMedico.getNombre() + " satisfactoriamente.");
    }

    public void registarCitaMedica(CitaMedica miCita) {
        this.citasList.add(miCita);
        JOptionPane.showMessageDialog(null, "Se ha registrado la cita exitosamente.");
        JOptionPane.showMessageDialog(null, miCita.informacionCitaMedica());
    }

    public void imprimirPacientes(){
        this.msj = "PACIENTES REGISTRADOS\n";
        
        for(String clave : this.pacientesMap.keySet()){
            pacientesMap.get(clave).imprimirDatosPersona(msj);
        } 
    }

    public void imprimirEmpleadosEventuales(){
        this.msj = "EMPLEADOS EVENTUALES REGISTRADOS\n";

        for(String clave : this.empleadoEventualMap.keySet()){
            empleadoEventualMap.get(clave).imprimirDatosPersona(msj);
        } 
    }

    public void imprimirEmpleadosPorPlanilla(){
        this.msj = "EMPLEADOS POR PLANILLA REGISTRADOS\n";

        for(String clave : this.empleadoPlanillaMap.keySet()){
            empleadoPlanillaMap.get(clave).imprimirDatosPersona(msj);
        } 
    }

    public void imprimirMedicos(){
        this.msj = "MÉDICOS REGISTRADOS\n";

        for(String clave : this.medicoMap.keySet()){
            medicoMap.get(clave).imprimirDatosPersona(msj);
        } 
    }

    public void imprimirCitasMedicasProgramadas(){
        this.msj = "CITAS MÉDICAS PROGRAMADAS\n";
        CitaMedica miCita = null;

        System.out.println(this.msj);

        if (this.citasList.size() > 0){
            for(int i = 0; i < this.citasList.size(); i++){
                miCita = citasList.get(i);
                System.out.println(miCita.informacionCitaMedica());
            } 
        }

        else{
            System.out.println("No hay citas programadas.");
        }
    }

    public Paciente consultarPacientePorDocumento(String documentoPaciente){
        Paciente miPaciente = null;

        if(this.pacientesMap.containsKey(documentoPaciente)){
            miPaciente = pacientesMap.get(documentoPaciente);
        }

        return miPaciente;
    }

    public Medico consultarMedicoPorNombre(String nombreMedico){ 
        
        for(Medico medico : this.medicoMap.values()){
            if (medico.getNombre().equalsIgnoreCase(nombreMedico)) {
                return medico;
            }
        }
        
        return null;
    }

    
}
