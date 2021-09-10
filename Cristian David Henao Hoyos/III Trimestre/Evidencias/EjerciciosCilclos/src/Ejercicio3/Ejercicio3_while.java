package Ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3_while {
    public static void main(String[] args) {
        /* Programa que calcula la suma de los 10 primeros números naturales.*/
        int contador = 0;
        int suma = 0;
        while(contador < 10){
            suma += contador;
            contador++;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Suma", 1);
    }
}
