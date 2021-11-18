/*
    Haga un programa que reciba un número, y si éste es negativo, conviértalo a positivo. Después imprímalo.
*/
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
		
        System.out.print("Ingrese un número: ");

        double numero = input.nextDouble();
		
        if(numero < 0) {
                numero = numero * -1;
        }
        System.out.println("El número es: " + numero);
    }

}
