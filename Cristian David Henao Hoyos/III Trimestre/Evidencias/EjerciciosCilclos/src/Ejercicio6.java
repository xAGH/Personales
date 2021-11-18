import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        /* Programa que imprime los números ingresados por teclado hasta que se ingrese el 0.*/
        boolean bandera = true;
        do{
            Integer numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: "));
            if(numero == 0){
                JOptionPane.showMessageDialog(null, "El número ingresado es 0, finalizando la ejecución.", "Número ingresado", 1);
                bandera = false;
            }
            else{
                JOptionPane.showMessageDialog(null, "El número ingresado es: " + numero, "Número ingresado", 1);
            }
        }
        while(bandera);
    }
}
