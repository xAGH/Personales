import javax.swing.JOptionPane;
import clases.ModeloDatos;
import clases.Paciente;
import clases_empleado.EmpleadoEventual;
import clases_empleado.EmpleadoPlanilla;
import clases_empleado.Medico;

public class Procesos {

    private ModeloDatos miModeloDatos;

    public Procesos(){
        this.miModeloDatos = new ModeloDatos();
        presentarMenuOpciones();
    }

    private void presentarMenuOpciones() {
        String menu = "MENU HOSPITAL\n\n";
        menu += "1. Registrar Pacientes.\n";
        menu += "2. Registar Empleado.\n";
        menu += "3. Registar Cita Médica.\n";
        menu += "4. Imprimir Información.\n";
        menu += "5. Salir\n\n";
        menu += "Ingrese una opción: \n";

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1: this.registarPaciente(); break;
                case 2: this.registarEmpleado(); break;
                case 3: this.registarCitaMedica(); break;
                case 4: this.registarInformacion(); break;
                case 5: JOptionPane.showMessageDialog(null, "El sistema ha terminado."); break;
                default: JOptionPane.showMessageDialog(null, "No existe el código, verifique nuevamente."); break;
            }
        }
        while(opcion != 5);
    }

    private void registarPaciente(){
        Paciente miPaciente = new Paciente();
        miPaciente.registrarDatos();

        this.miModeloDatos.registarPersona(miPaciente);
    }

    private void registarEmpleado(){
        String menuTipoEmpleado = "Registro de empleados\n";
        menuTipoEmpleado += "1. Empleado eventual.\n";
        menuTipoEmpleado += "2. Empleado por planilla.\n";
        menuTipoEmpleado += "Seleccione el tipo de empleado a registrar.\n";

        while (true) {
            String tipoEmpleado = JOptionPane.showInputDialog(menuTipoEmpleado);

            if (tipoEmpleado == null || tipoEmpleado == "") {
                System.exit(0);
            }

            else if (tipoEmpleado.equals("1")) { 
                EmpleadoEventual miEmpleadoEventual = new EmpleadoEventual();
                miEmpleadoEventual.registrarDatos();
                this.miModeloDatos.registarPersona(miEmpleadoEventual);
                break;
            }

            else if (tipoEmpleado.equals("2")){
                String pregunta = JOptionPane.showInputDialog("1. Médico.\n2. Otro tipo.");
                
                if (pregunta.equals("1")){
                    Medico miMedico = new Medico();
                    miMedico.registrarDatos();
                    this.miModeloDatos.registarPersona(miMedico);
                } 
                
                else{
                    EmpleadoPlanilla miEmpleadoPlanilla = new EmpleadoPlanilla();
                    miEmpleadoPlanilla.registrarDatos();
                    this.miModeloDatos.registarPersona(miEmpleadoPlanilla);
                }

                break;
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Ingrese una opción válida.");
            }
        }
    }

    private void registarCitaMedica(){
        
    }

    private void registarInformacion(){
        
    }

    private void imprimirInformacion(){
        int opcion;
        String menuImprimir = "MENU IMPRESIONES\n\n";
        menuImprimir += "1. Listar Pacientes.\n";
        menuImprimir += "2. Listar Empleados Eventuales.\n";
        menuImprimir += "3. Listar Empleados Por Planilla.\n";
        menuImprimir += "4. Listar Médicos.\n";
        menuImprimir += "Ingrese una opción.\n";
        System.out.println("*******************************************************");

        while (true) {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menuImprimir));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Introduzca solo números.");
            }
        }
        switch (opcion) {
            case 1: this.miModeloDatos.imprimirPacientes();  break;
            case 2: this.miModeloDatos.imprimirEmpleadosEventuales();  break;
            case 3: this.miModeloDatos.imprimirEmpleadosPorPlanilla();  break;
            case 4: this.miModeloDatos.imprimirMedicos();  break;
            default: JOptionPane.showMessageDialog(null, "No existe esa opción"); break;
        }
        return; 
    }
}
