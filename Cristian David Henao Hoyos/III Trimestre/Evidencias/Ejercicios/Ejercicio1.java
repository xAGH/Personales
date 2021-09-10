/*
* Haga un algoritmo que realice la suma de 2 numeros e imprima el resultado!
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double num1, num2, suma;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextDouble();

        suma = num1 + num2;

        System.out.println("El resultado es: " + suma);
    }
}
