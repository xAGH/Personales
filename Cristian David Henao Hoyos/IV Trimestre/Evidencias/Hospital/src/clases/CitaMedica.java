package clases;

import clases_empleado.Medico;

public class CitaMedica {
    private Paciente paciente;
    private Medico medico;
    private String servicio;
    private String fechaConsulta;
    private String horaConsulta;
    private String lugar;
    
    public CitaMedica(Paciente paciente, Medico medico, String servicio, String fechaConsulta, String horaConsulta, String lugar) {
        setPaciente(paciente);
        setMedico(medico);
        setServicio(servicio);
        setFechaConsulta(fechaConsulta);
        setHoraConsulta(horaConsulta);
        setLugar(lugar);
    }

    public String informacionCitaMedica(){
        String datosCita = "<< INFORMACIÓN CITA MÉDICA >>";
        datosCita += "Paciente: " + this.getPaciente() + "\n";
        datosCita += "Médico: " + this.getMedico() + "\n";
        datosCita += "Servicio: " + this.getServicio() + "\n";
        datosCita += "Fecha consulta: " + this.getFechaConsulta() + "\n";
        datosCita += "Hora consulta: " + this.getHoraConsulta() + "\n";
        datosCita += "Lugar: " + this.getLugar() + "\n";

        return datosCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
