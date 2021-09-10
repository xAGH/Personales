import javax.swing.JOptionPane;

public class Ejercicio5{
    public static void main(String[] args) {
        /*Programa que imprime los números impares entre 1 y 20*/
            for(int numero = 1;numero < 21;numero++){
                if(numero % 2 == 1){
                    JOptionPane.showMessageDialog(null, "El número " + numero + " es impar", "Número impar", 1);
                }
            }
    }
}