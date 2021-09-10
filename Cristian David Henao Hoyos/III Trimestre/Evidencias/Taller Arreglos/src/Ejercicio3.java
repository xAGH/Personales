import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        int cantidad = 0;
        do {
            try{
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas notas va a ingresar?"));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Solo se admiten números enteros.", "Error", 0);
            }
        } while (cantidad == 0);
        double[] notas = new double[cantidad];
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