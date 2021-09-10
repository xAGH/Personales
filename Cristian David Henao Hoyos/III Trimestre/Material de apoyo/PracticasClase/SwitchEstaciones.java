import java.util.Scanner;

public class SwitchEstaciones {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 4: ");
        int estacion = in.nextInt();

        switch (estacion) {
            case 1:
                System.err.print("La estación es verano.");
                break;

            case 2:
                System.err.print("La estación es otoño.");
                break;

            case 3:
                System.err.print("La estación es invierno.");
                break;

            case 4:
                System.err.print("La estación es primavera.");
                break;
        
            default:
                System.out.println("No ingresó un valor del 1 al 4.");
                break;
        }
    }
}
