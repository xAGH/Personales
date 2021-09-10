import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        double[] notas = new double[3];
        int controlador = 1;
        double suma = 0, promedio; 
        int longitud = notas.length;
        while(controlador <= longitud){
            try{
                double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota #" + controlador));
                notas[controlador - 1] = numero;
                controlador++;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Solo se admiten números.", "Error", 0);
            }
        }
        for (int i = 0; i < longitud; i++) {
            suma += notas[i];
        }
        promedio = suma / longitud;

        JOptionPane.showMessageDialog(null, "El promedio de las notas es: " + promedio, "Resultado", 1);
    }
}
