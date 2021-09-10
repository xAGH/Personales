package Ejercicio1;
import javax.swing.JOptionPane;

/*
    Programa que calcula el pago de comisión a n empleados de acuerdo al tipo de vendedor:
    A: 8%
    B: 6%
    C: 4%
    D: 2%
*/
public class CalcularComision {

    void iniciar(){
        boolean continuar;
        do{
            String tipo = seleccionarTipo();
            Double ventas = obtenerVentas();
            Double porcentaje = obtecionPorcentaje(tipo);
            JOptionPane.showMessageDialog(null, calculoComision(porcentaje, ventas));
            continuar = decisionContinuar();
        } while(continuar); 
    }

    String seleccionarTipo(){
        String tipo;
        while(true){
            try {
                tipo = JOptionPane.showInputDialog(null, "Ingrese el tipo de vendedor.\nA = 8%.\nB = 6%.\nC = 4%.\nD = 2%").toUpperCase();
                if(tipo.equals("A") || tipo.equals("B") || tipo.equals("C") || tipo.equals("D")){return tipo;}
                
                else{JOptionPane.showMessageDialog(null, "Ingresó un tipo que no existe.");}
            } catch (Exception e) {}
        }
    }
    
    Double obtenerVentas(){
        Double ventas;
        while(true){
            try {
                ventas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese las ventas totales del vendedor."));
                return ventas;
            } catch (Exception e) {}
        }
    }
    
    Double obtecionPorcentaje(String tipo){
        switch (tipo) {
            case "A": return 0.08 ;
            case "B": return 0.06 ;
            case "C": return 0.04 ;
            case "D": return 0.02 ;
            default: return 0.0;
        }
    }
    
    String calculoComision(Double porcentaje, Double ventas){
        Double comision = porcentaje * ventas;
        String resultadoComision = "La comisión de ventas es " + comision;
        return resultadoComision;
    }
    
    boolean decisionContinuar(){
        String continuar = JOptionPane.showInputDialog(null, "¿Desea continuar?\n1. Si.\n2. No.");
        if(continuar.equals("1")){return true;}
        else{return false;} 
    }
}