package Ejercicio1;
import javax.swing.JOptionPane;

public class Ejercicio1_for {
    public static void main(String[] args) {
        /*Programa que imprime x, la cual toma un valor de 0 a 10*/
        for(int x = 0;x <= 10;x++){
            JOptionPane.showMessageDialog(null, "El valor de x es: " + x, "Valor de x",1);
        }
    }
}
