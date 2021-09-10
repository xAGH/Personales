import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        boolean seguir = true;
        String mensaje = "¿Qué ejercicio quiere ejecutar?\n1. Ejercicio 1.\n2. Ejercicio 2.\n3. Ejercicio 3.\n4. Salir.";
        do {
            try {
                int ejercicio = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
                switch (ejercicio) {
                    case 1:
                        Ejercicio1 e1 = new Ejercicio1(); e1.ejecutar(); break;
                    case 2:
                        Ejercicio2 e2 = new Ejercicio2(); e2.ejecutar(); break;
                    case 3:
                        Ejercicio3 e3 = new Ejercicio3(); e3.ejecutar(); break;
                    case 4:
                        seguir = false; break;

                    default: JOptionPane.showMessageDialog(null, "Opción Incorrecta.", "Error", JOptionPane.ERROR_MESSAGE); break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo se admiten números.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while(seguir);
    }
}
