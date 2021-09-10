package Ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2_for {
    public static void main(String[] args) {
        /*Programa que imprime x, la cual toma un valor de 0 a un número ingresado por teclado*/

        Integer numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número límite.", "Límite", 3));
        
        // Con el ciclo for, se verifica el número ingresado y según este ejecuta la sentencia del programa o no
        for(int x = 0;x <= numero;x++){
            JOptionPane.showMessageDialog(null, "Número: " + x);
        }
    }
}