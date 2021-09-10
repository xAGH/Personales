package Ejercicio2;
import javax.swing.JOptionPane;

public class Ejercicio2_doWile {
    public static void main(String[] args) {
        /*Programa que imprime x, la cual toma un valor de 0 a un número ingresado por teclado*/
        Integer numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número límite.", "Límite", 3));
        int x = 0;
        
        // Con el ciclo do while, el programa se ejecuta 1 vaez independientemente del valor del número ingresado.
        // Por lo tanto, si introducimos 0, el programa aun así ejecuta
        do{
            JOptionPane.showMessageDialog(null, "Número: " + x);
            x++;
        }
        while(x <= numero);
    }
}
