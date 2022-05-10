import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int eleccion = seleccionarOpcion();
        JFrame frame = eleccionEjercicio(eleccion);
        frame.setVisible(true);
    }

    private static int seleccionarOpcion() {
        boolean bandera = true;
        int eleccion = 0;
        String menu = "*** Ejercicios de GUI *** \n\n";
        menu += "1. Ejercicio 1\n";
        menu += "2. Ejercicio 2\n";
        menu += "3. Ejercicio 3\n";
        menu += "4. Ejercicio 4\n";
        menu += "5. Ejercicio 5\n";
        menu += "6. Ejercicio 6\n";
        menu += "8. Ejercicio 8\n";
        menu += "9. Ejercicio 9\n";
        menu += "10. Ejercicio 10\n";
        menu += "11. Ejercicio 11\n";
        menu += "0. Salir\n";

        while(bandera){
            try {
                eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, menu)); 
                if (eleccion <= 12 && eleccion >= 0 && eleccion != 7) {
                    if (eleccion == 0) {
                        JOptionPane.showMessageDialog(null, "Adios");
                        System.exit(0);
                    }
                    bandera = false;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número.");
            }
        }
        return eleccion;
    }

    private static JFrame eleccionEjercicio(int eleccion) {
        if (eleccion == 1) {
            return new Ejercicio1();
        } else if (eleccion == 2) {
            return new Ejercicio2();
        } else if (eleccion == 3) {
            return new Ejercicio3();
        } else if (eleccion == 4) {
            return new Ejercicio4();
        } else if (eleccion == 5) {
            return new Ejercicio5();
        } else if (eleccion == 6) {
            return new Ejercicio6();
        } else if (eleccion == 8){
            return new Ejercicio8();
        } else if (eleccion == 9) {
            return new Ejercicio9();
        } else if (eleccion == 10) {
            return new Ejercicio10();
        } else if (eleccion == 11) {
            return new Ejercicio11();
        } else{
            return null;
        }
    }
}
