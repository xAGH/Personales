package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paciente extends Persona {

    private int numeroHistoriaClinica;
    private String sexo;
    private String grupoSanguineo;
    private ArrayList<String> listaMedicamentosAlergico;

    @Override
    public void registrarDatos() {
        super.registrarDatos();

        this.listaMedicamentosAlergico = new ArrayList<String>();
        while(true){
            try {
                this.setNumeroHistoriaClinica(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la historia clínica: ")));
                break;
            } catch (Exception e) {}
        }
        this.setSexo(JOptionPane.showInputDialog("Ingrese el sexo: "));
        this.setGrupoSanguineo(JOptionPane.showInputDialog("Ingrese el grupo sanguíneo: "));

        String pregunta = JOptionPane.showInputDialog("¿Eres alérgico a algún medicamento?\n1. Si.\n2. No.");

        if(pregunta.equals("1") || pregunta.equalsIgnoreCase("si")){
            String medicamento = "";
            String continuar = "";
            do {
                medicamento = JOptionPane.showInputDialog("Ingrese el nombre del medicamento al que es alérgico: ");
                this.listaMedicamentosAlergico.add(medicamento);

                continuar = JOptionPane.showInputDialog("Ingrese 1 o si, si desea continuar: ");
            } while (continuar.equals("1") || continuar.equalsIgnoreCase("si"));
        }
    }

    @Override
    public void imprimirDatosPersona(String datos) {
        super.imprimirDatosPersona(datos);

        datos = "Número de historia clínica: " + this.getNumeroHistoriaClinica() + "\n";
        datos += "Sexo: " + this.getSexo() + "\n";
        datos += "Grupo sanguíneo: " + this.getGrupoSanguineo() + "\n";
        
        if (this.listaMedicamentosAlergico.size() > 0) {
            datos += "Lista de medicamentos a los que" + this.getNombre() + "es alérgico: \n";
            for (int i = 0; i < this.listaMedicamentosAlergico.size(); i++) {
                datos += "\t" + this.listaMedicamentosAlergico.get(i) + "\n";
            }
        }
        else{
            datos += this.getNombre() + " no es alérgico a ningún medicamento.\n";
        }
        
        System.out.println(datos);
    }

    public int getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(int numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public ArrayList<String> getListaMedicamentosAlergico() {
        return listaMedicamentosAlergico;
    }

    public void setListaMedicamentosAlergico(ArrayList<String> listaMedicamentosAlergico) {
        this.listaMedicamentosAlergico = listaMedicamentosAlergico;
    }

}
