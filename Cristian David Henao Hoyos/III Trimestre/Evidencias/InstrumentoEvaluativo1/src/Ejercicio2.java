import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio2 {

    public void ejecutar(){
        boolean seguir = true;
        do {
            int numero = ingresoNumero();
            ArrayList<Integer> divisores = hallarDivisores(numero);
            String mensaje = imprimirDivisores(divisores, numero);
            JOptionPane.showMessageDialog(null, mensaje);
            try {
                String continuar = "¿Desea continuar?\n1. Si.\n2. No";
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(continuar));
                if (opcion != 1){
                    seguir = false;
                }
            } catch (Exception e) {
                seguir = false;
            }
        } while(seguir);
    }

    private static int ingresoNumero(){
        boolean controlador = true;
        int  numero = 0;
        do{
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
                if(numero < 0){
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números enteros positivos.");
                }
                else{
                    controlador = false;    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números enteros positivos.");
            }
        } while(controlador);
        return numero;
    }

    private static ArrayList<Integer> hallarDivisores(int numero){
        ArrayList<Integer> divisores = new ArrayList<Integer>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }

    private static String imprimirDivisores(ArrayList<Integer> divisores, int numero){
        String resultado = "Los divisores del " + numero + " son: " + "\n[";
        int len = divisores.size();
        for (int i = 0; i < len; i++) {
            if(i < len -1){
                resultado += divisores.get(i) + ", ";
            }

            else{
                resultado += divisores.get(i) + "]";
            }
        }

        return resultado;
    }
}
