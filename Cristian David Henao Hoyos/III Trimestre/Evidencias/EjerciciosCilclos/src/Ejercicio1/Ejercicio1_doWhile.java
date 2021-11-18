package Ejercicio1;
import javax.swing.JOptionPane;

public class Ejercicio1_doWhile {
    public static void main(String[] args) {
        /*Programa que imprime x, la cual toma un valor de 0 a 10*/
        int x = 0;
        do{
            JOptionPane.showMessageDialog(null, "El valor de x es: " + x, "Valor de x",1);
            x++;
        }
        while(x <= 10);
    }
}
