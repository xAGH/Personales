import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        /* Programa que imprime la tabla del 5*/
        int tabla = 0;
        String resultados = "";
        while(tabla <= 10){
            int operacion = 5 * tabla;
            resultados += "5 * " + tabla + " = " + operacion + "\n";
            tabla++;
        }
        JOptionPane.showMessageDialog(null, "Las tabla de multiplicar del 5 es:\n"+resultados, "Resultados.", 1);
    }
}
