package Ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4_while {
    public static void main(String[] args) {
        /* Programa que calcula la suma de los 10 primeros números naturales, empezando por un número ingresado
        por teclado.*/
        Integer contador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número inicial: "));
        int suma = 0;
        int limite = contador + 10;
        while(contador < limite + contador){
            suma += contador;
            contador++;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Suma", 1);
    }
}