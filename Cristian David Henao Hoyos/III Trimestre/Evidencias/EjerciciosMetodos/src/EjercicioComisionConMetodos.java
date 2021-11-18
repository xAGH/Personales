import javax.swing.JOptionPane;

/**
 * @version 1.1
 * @author Alejandro Giraldo Herrera
 * 
 * Clase que calcula el procentaje de comisión a un vendedor dependiendo
 * su valor total de ventas y su tipo.
 * Porcentaje de comisión por tipo de vendedor:
 * A = 0.8
 * B = 0.6
 * C = 0.4
 * D = 0.2
*/

public class EjercicioComisionConMetodos {

    /**
     * Método público y sin retorno 'iniciar()', relaciona y ejecuta los otros métodos de la clase.
     * @since 1.0
     */

    public void iniciar(){
        // Definición de variables.
        boolean continuar;
        // Ciclo controlado por la variable continuar anteriormente declarada.
        do{
            // Definición de variables con valor retornado de métodos.
            String nombre = ingresarNombre();
            String tipo = seleccionarTipo(nombre);
            Double ventas = obtenerVentas(nombre);
            Double porcentaje = obtecionPorcentaje(tipo);

            // Impresión de mensaje con los resultados obtenidos.
            JOptionPane.showMessageDialog(null, calculoComision(nombre, porcentaje, ventas));

            /* 
             Variable booleana que se recibe después de preguntar al usuario si desea continuar.
             Ésta variable controla la ejecución del ciclo.
            */
            continuar = decisionContinuar();
        } while(continuar); 
    }

    /**
     * Método que espera recibir una cadena alfábetica correspondiente
     * al nombre de un empleado.
     * @return nombre:String
     * @since 1.1
     */
    String ingresarNombre(){
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado: ");
        return nombre;
    }

    /**
     * Método que captura una cadena que será el tipo de vendedor.
     * @param nombre:String -> Nombre de un empleado.
     * @return tipo:String -> (A, B, C, D)
     * @since 1.0
     */
    String seleccionarTipo(String nombre){
        // Definición de variables.
        String tipo, msg;
        
        //Inicio de ciclo infinito que no acaba hasta que se ingrese un valor válido.
        while(true){
            // Solicitud del dato.
            msg =  "¿Qué tipo de vendedor es" + nombre + "?\nA = 8%.\nB = 6%.\nC = 4%.\nD = 2%";
            tipo = JOptionPane.showInputDialog(null, msg).toUpperCase();
            
            // Verificación del dato.
            if(tipo.equals("A") || tipo.equals("B") || tipo.equals("C") || tipo.equals("D"))
            {/*Retorno y terminación del ciclo si el dato es válido*/return tipo;}

            // Mensaje informativo diciendo que el dato ingresado es inválido.
            else{JOptionPane.showMessageDialog(null, "Ingresó un tipo que no existe.");}
        }
    }
        
    
    /**
     * Método que captura las ventas totales que ha tenido el vendedor.
     * @param nombre:String -> Nombre de un empleado.
     * @exception Excepcion , solo se pueden ingresar números
     * @return ventas:Double
     * @since 1.0
     */
    Double obtenerVentas(String nombre){
        // Declaración de variables
        Double ventas;

        // Inicio de ciclo infinito que no acaba hasta que se ingrese un valor válido.
        while(true){
            
            // Control de excepciones, principalmente la NumberFormatException.
            try {
                // Solicitud del dato.
                ventas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese las ventas totales de " + nombre +"."));

                // Retorno del valor si no sale una escepción.
                return ventas;

              // Captura de la excepcion.
            } catch (Exception e) {
                // Mensaje informativo de que ha ocurrido un error.
                JOptionPane.showMessageDialog(null, "Error, el valor ingresado no es un número.");
            }
        }
    }

    /**
     * Método que, según el tipo de vendedor, retorna el porcentaje correspondiente, solicita como
     * parámetro el tipo de vendedor.
     * NOTA: El sistema en la linea 118* cuenta con un default aun estando el valor de entrada validado
     * por si llega a ocurrir un error.
     * 
     * *La linea en cuestion puede cambiar.*
     * 
     * @param tipo:String -> (A, B, C, D)
     * @return porcentaje:Double
     * @since 1.0
    */
    Double obtecionPorcentaje(String tipo){

        // Elección de caso según el valor del parámetro tipo.
        switch (tipo) {
            // Retorno de valores según el valor de tipo.
            case "A": return 0.08 ;
            case "B": return 0.06 ;
            case "C": return 0.04 ;
            case "D": return 0.02 ;
            default: return 0.0;
        }
    }
    
    /**
     * Método que calcula y retorna la comisión del vendedor dependiendo de sus ventas totales y su porcentaje
     * de acuerdo al tipo.
     * @param nombre:String -> Nombre de un empleado.
     * @param porcentaje:Double -> (0.08, 0.06, 0.04, 0.02)
     * @param ventas:Double -> Ventas de un empleado.
     * @return resultadoComision:String
     * @since 1.0
     */
    String calculoComision(String nombre,Double porcentaje, Double ventas){
        // Definición y declaración de las variables.
        Double comision = porcentaje * ventas;
        String resultadoComision = "La comisión de ventas de " + nombre + " es " + comision;

        // Retorno del mensaje generado.
        return resultadoComision;
    }
    
    /**
     * Método que retorna un valor booleano que será el encargado de controlar el while presente en
     * el método iniciar.
     * @return continuar:boolean
     * @since 1.0
     */
    boolean decisionContinuar(){
        // Toma de decisión, continuar o no.
        String continuar = JOptionPane.showInputDialog(null, "¿Desea continuar?\n1. Si.\n2. No.");

        // Validación de entrada y retorno
        if(continuar.equals("1")){return true;}
        else{return false;} 
    }
}