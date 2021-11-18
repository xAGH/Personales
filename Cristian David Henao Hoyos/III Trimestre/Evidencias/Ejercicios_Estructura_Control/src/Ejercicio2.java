/*
    Haga un programa que reciba dos números por teclado e indique cuál es el mayor.
*/
import java.util.Scanner;
public class Ejercicio2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = in.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = in.nextDouble();

        if (num1 > num2){
            System.out.println("EL primer número es mayor.");
        }
        else if(num2 > num1){
            System.out.println("El segundo número es mayor.");
        }
        else{
            System.out.println("Los números son iguales.");
        }

    }
    
}
