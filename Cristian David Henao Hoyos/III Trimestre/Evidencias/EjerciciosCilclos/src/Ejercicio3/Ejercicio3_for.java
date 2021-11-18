package Ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3_for {
    public static void main(String[] args) {
        /* Programa que calcula la suma de los 10 primeros números naturales.*/
        int suma = 0;
        for(int contador = 0;contador < 10;contador++){
            suma += contador;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Suma", 1);
    }
}
