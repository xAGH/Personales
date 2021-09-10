import javax.swing.JOptionPane;

class Calculadora {

    Double num1;
    Double num2;
    boolean bandera = true;
    boolean numeros = false;

	/*
	 * Haga un menu de operaciones matematicas con las
	 * siguientes opciones
	 * 
	 * 1. Solicitar Numeros
	 * 2. Sumar
	 * 3. Restar
	 * 4. Multiplicar
	 * 5. Dividir
	 * 6. Salir
	*/

    public static void main(String[] args) {
        Calculadora prueba = new Calculadora();
        prueba.iniciar();
    }    

    void iniciar(){
        while (this.bandera) {
            String resultado = "Debe ingresar los números primero.";
            String menu = mostrarMenu();
            int opcion_elegida = elegirOpcion(menu);
            switch (opcion_elegida) {
                case 1: pedirNumeros(); break;
                case 2: if(verificarNumeros())resultado = sumar(this.num1, this.num2); break;
                case 3: if(verificarNumeros())resultado = restar(this.num1, this.num2); break;
                case 4: if(verificarNumeros())resultado = multiplicar(this.num1, this.num2); break;
                case 5: if(verificarNumeros())resultado = dividir(this.num1, this.num2); break;
                case 6: if(verificarNumeros())resultado = modular(this.num1, this.num2); break;
                case 7: salir(); break;
                default: break;
            }
            if (opcion_elegida != 1 && opcion_elegida != 7) JOptionPane.showMessageDialog(null, resultado);
        }
    }
	
    String mostrarMenu(){
        String menu = "Ingresa una opción:\n";
        menu += "1. Ingresar números\n";
        menu += "2. Sumar.\n";
        menu += "3. Restar.\n";
        menu += "4. Multiplicar.\n";
        menu += "5. División.\n";
        menu += "6. Módulo\n";
        menu += "7. Salir\n";
        
        return menu;
    }

    int elegirOpcion(String menu){
        while(true){
            try {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
                if(opcion < 8 && opcion > 0) {return opcion;}
            } catch (Exception e) {}
        }   
    }

    void pedirNumeros() {
        while(true){
            try {
                this.num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número."));
                this.num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número."));
                break;
            } catch (Exception e) {JOptionPane.showMessageDialog(null, "Alguno de los números ingresados no e sun número");}
        }
    }

    String sumar(double num1, double num2){
        String resultado = "El resultado de la suma es " + (num1 + num2); 
        return resultado;
    }

    String restar(double num1, double num2){
        int orden = elegirOrden(num1, num2, "-");
        if (orden == 1){
            String resultado = "El resultado de la resta es " + (num1 - num2); 
            return resultado;
        }
        return "El resultado de la resta es " + (num2 - num1);
    }

    String multiplicar(double num1, double num2){
        String resultado = "El resultado de la multiplicacion es " + (num1 * num2); 
        return resultado;
    }

    String dividir(double num1, double num2){
        int orden = elegirOrden(num1, num2, "/");
        if (orden == 1 && num2 != 0){
            String resultado = "El resultado de la división es " + (num1 / num2); 
            return resultado;
        }

        if (orden == 2 && num1 != 0){
            String resultado = "El resultado de la división es " + (num2 / num1); 
            return resultado;
        }

        return "No se puede dividir por 0";
    }

    String modular(double num1, double num2){
        int orden = elegirOrden(num1, num2, "%");
        if (orden == 1 && num2 != 0){
            String resultado = "El resultado del módulo es " + (num1 % num2); 
            return resultado;
        }

        if (orden == 2 && num1 != 0){
            String resultado = "El resultado del módulo es " + (num2 % num1); 
            return resultado;
        }

        return "No se puede dividir por 0";
    }

    int elegirOrden(double num1, double num2, String operacion) {
        while (true) {
            String mensaje = "Elije el orden:\n1 →      " + num1 + " " + operacion + " " + num2 + "\n2 →       " + num2 + " " + operacion + " " + num1;
            try {
                int eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
                if (eleccion == 1 || eleccion == 2) {
                    return eleccion;
                }else JOptionPane.showMessageDialog(null, "Ingrese una opción válida (1 o 2).");
            } catch (Exception e) {JOptionPane.showMessageDialog(null, "Ingrese una opción válida (1 o 2).");}
        }
    }

    boolean verificarNumeros(){
        if (this.num1 != (null) || this.num2 != (null)){
            return true;
        }
        return false;
    }

    void salir(){
        JOptionPane.showMessageDialog(null, "Hasta luego");
        this.bandera = false;
    }
}