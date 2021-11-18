import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*Programa que calcula el promedio de 3 numeros, n veces.*/
        String menu = "1. Ingresar números.\n2. Salir.\nIngrese una opción: ";
        boolean bandera = true;
        do{
            char eleccion = JOptionPane.showInputDialog(null, menu).charAt(0);
            if(eleccion == '1'){
                Double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
                Double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
                Double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el tercer numero: "));
                double promedio = (num1 + num2 + num3) / 3;
                JOptionPane.showMessageDialog(null, "El promedio es: " + promedio, "Promedio", 1);
            }
            else if(eleccion == '2'){
                JOptionPane.showMessageDialog(null, "Finalizando ejecución.", "Finalizando", 1);
                bandera = false;
            }
            else{
                JOptionPane.showMessageDialog(null, "Ingresó una opción no válida.", "Error", 1);
            }
        }
        while(bandera);
    }   
}
