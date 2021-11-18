/*
* Algoritmo que calcule lo que gana un empleado con base a las horas trabajadas 
* teniendo en cuenta que cada hora se paga a 2000, adicionalmente se le realiza unos 
* descuentos con respecto a un impuesto de seguridad del 10% sobre su salario.
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final int PAGA = 2000;
        final float IMPUESTO = 0.10f, salario, descuento, salario_final;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        float horas = input.nextFloat(); 

        salario = PAGA * horas;
        descuento = salario * IMPUESTO;
        salario_final = salario - descuento;
        
        System.out.println("El salario del trabajador es: " + salario_final);
    }
}
