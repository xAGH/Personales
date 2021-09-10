import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        /* Programa que imprime la tabla de un número ingresado por el teclado.*/
    Integer numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número para calcular su tabla.", "Número", 1));
    String resultados = "";
    for(int tabla = 0;tabla <= 10;tabla++){
        int operacion = numero * tabla;
        resultados += numero + " * " + tabla + " = " + operacion + "\n";
    }
    JOptionPane.showMessageDialog(null, "Las tabla de multiplicar del 5 es:\n"+resultados, "Resultados.", 1);
    }
}
