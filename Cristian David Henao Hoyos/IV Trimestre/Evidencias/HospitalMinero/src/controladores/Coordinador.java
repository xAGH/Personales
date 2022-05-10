package controladores;

import modelos.Trabajador;
import modelos.Trabajadores;

public class Coordinador {

    private Trabajadores trabajadores;
    private Trabajador trabajador;

    public Coordinador() {
        this.trabajadores = new Trabajadores();
    }

    public void createTrabajador(
    String nombreEmpresa,
    String documento, 
    String nombre, 
    String direccion, 
    String telefono, 
    char tipo,
    String tratamiento,
    int diasHospitalizacion,
    double costoMedicamentos) {
        trabajador = new Trabajador();
        trabajador.setEmpresa(nombreEmpresa);
        trabajador.setDocumento(documento);
        trabajador.setNombre(nombre);
        trabajador.setDireccion(direccion);
        trabajador.setTelefono(telefono);
        trabajador.setTipo(tipo);
        trabajador.setTratamiento(tratamiento);
        trabajador.setDiasHospitalizacion(diasHospitalizacion);
        trabajador.setCostoMedicamentos(costoMedicamentos);

        this.trabajadores.addTrabajador(trabajador);
    }

    public double calcularCostos() {
        double gastoTotal = 0;
        double d = getDescuento(); // Descuento

        if(trabajador.getTratamiento().equalsIgnoreCase("Neumoconiosis")) {
            gastoTotal += 500000;
        } else if(trabajador.getTratamiento().equalsIgnoreCase("Vértigo")) {
            gastoTotal += 300000;
        } else if(trabajador.getTratamiento().equalsIgnoreCase("Problemas respiratorios")) {
            gastoTotal += 250000;
        }

        gastoTotal += trabajador.getCostoMedicamentos();

        gastoTotal += trabajador.getDiasHospitalizacion() * 80000;

        gastoTotal = gastoTotal - d * gastoTotal;

        trabajador.setCostoMedico(gastoTotal);

        return gastoTotal;
    }

    public double getDescuento() {
        if (trabajador.getTipo() == 'M' ) {
            return 0.20;
        } return 0;
    }

    public String buscar(String text) {
        for (Trabajador t : trabajadores.getTrabajadores()) {
            if(t.getDocumento().equals(text)){
                return t.toString();
            }
        }
        return "No encontrado";
    }

}
