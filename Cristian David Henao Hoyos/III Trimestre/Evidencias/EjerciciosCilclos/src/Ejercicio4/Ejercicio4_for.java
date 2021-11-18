package Ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4_for {
    public static void main(String[] args) {
        /* Programa que calcula la suma de los 10 primeros números naturales, empezando por un número ingresado
        por teclado.*/
        int suma = 0;
        Integer contador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número inicial: "));
        int limite = contador + 10;
        for(;contador < limite;contador++){
            suma += contador;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Suma", 1);
    }
}
