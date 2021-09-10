/*
* Calcular el 15% de un valor ingresado por un usuario
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        final float PORCENTAJE = 0.15f;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el valor: ");
        float valor = input.nextFloat();

        float parte = valor * PORCENTAJE;

        System.out.println("El 15% de " + valor + " es: " + parte);
    }
}
