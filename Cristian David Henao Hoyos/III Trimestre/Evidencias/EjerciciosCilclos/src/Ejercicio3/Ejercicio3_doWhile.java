package Ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3_doWhile {
    public static void main(String[] args) {
        /* Programa que calcula la suma de los 10 primeros números naturales.*/
        int suma = 0;
        int contador = 0;
        do{
            suma += contador;
            contador++;
        }
        while(contador < 10);
        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Suma", 1);
    }

}
