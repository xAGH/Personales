package Ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2_while {
    public static void main(String[] args) {    
        /*Programa que imprime x, la cual toma un valor de 0 a un número ingresado por teclado*/

        Integer numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número límite.", "Límite", 3));
        
        // Con el ciclo while, se verifica el número ingresado y según este se ejecuta la sentencia del programa o no
        int x = 0;
        while(x <= numero){
            JOptionPane.showMessageDialog(null, "Número: " + x);
            x++;
        }
    }
}