import javax.swing.JOptionPane;

public class Ejercicio3 {
    public void ejecutar(){
        double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de x: ")), y = 0;
        if(x < -5){
            y = (-x);
        }

        else if(x >= -5 && x <= 2){
            y = Math.pow(x, 2) + 3;
        }

        else if(x > 2 && x < 5){
            y = x;
        }

        else if(x >= 5){
            y = 10;
        }

        JOptionPane.showMessageDialog(null, "El valor de las variables son:\nx = " + x + "\ny = " + y);
    }
}
