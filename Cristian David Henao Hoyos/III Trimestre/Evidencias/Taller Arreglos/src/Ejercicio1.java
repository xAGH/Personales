import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] numeros = new double[5];
        int controlador = 1;
        double suma = 0; 
        while(controlador <= numeros.length){
            try{
                double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número #" + controlador));
                numeros[controlador-1] = numero;
                controlador++;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Solo se admiten números.", "Error", 0);
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        JOptionPane.showMessageDialog(null, "La suma de los números es: " + suma, "Resultado", 1);
    }
}
