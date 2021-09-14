import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){
        int cantidad = cantidadNumeros();
        double[] numeros = capturarNumeros(cantidad);
        int numeros_repetidos = cantidadRepetidos(numeros);
        double[] repetidos = new double[numeros_repetidos];
    }

    public static int cantidadNumeros(){
        int cantidad = 0;
        do {
            try{
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos números va a ingresar?"));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Solo se admiten números enteros.", "Error", 0);
            }
        } while (cantidad == 0);
        return cantidad;
    }

    public static double[] capturarNumeros(int cantidad){
        int controlador = 1;
        double[] numeros = new double[cantidad];
        int longitud = numeros.length;
        while(controlador <= longitud){
            try{
                double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota #" + controlador));
                numeros[controlador - 1] = numero;
                controlador++;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Solo se admiten números.", "Error", 0);
            }
        }
        return numeros;
    }

    public static int cantidadRepetidos(double[] numeros){
        int cantidad = 0;
        for (int i = 0; i < numeros.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < numeros.length; j++) {
                if(numeros[i] == numeros[j])repetido=true;
            }
            if(repetido)cantidad++;
        }
        return cantidad;
    }
}
