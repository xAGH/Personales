/**
 * Programa que recibe n cantidad de artículos junto con su nombre.
 * De acuerdo a su precio, se le aplica un descuento.
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public void ejecutar(){
        boolean controlador = true;
        int veces = 0;
        int[] cantidad_descuentos = new int[]{0,0,0,0};
        ArrayList<Double> precios = new ArrayList<Double>();
        ArrayList<String> nombres = new ArrayList<String>();
        do{
            String nombre = nombreArticulo();
            double precio = precioArticulo(nombre);
            double[] descuento = descuento(precio);
            double precio_final = precioPagar(descuento[0], precio);
            nombres.add(nombre);
            precios.add(precio_final);
            if (descuento[1] == 1) {
                cantidad_descuentos[0] += 1;
            }
            else if(descuento[1] == 2){
                cantidad_descuentos[1] += 1;
            }
            else if(descuento[1] == 3){
                cantidad_descuentos[2] += 1;
            }
            else{
                cantidad_descuentos[3] += 1;
            }
            veces++;
            try {
                String mensaje = "¿Desea continuar?\n1. Si.\n2. No";
                int seguir = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                if (seguir != 1){
                    JOptionPane.showMessageDialog(null, "Imprimiendo resultados.");
                    controlador = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Imprimiendo resultados.");
                controlador = false;
            }
        }while (controlador);
        String[] resultados = obtenerResultados(nombres, precios, veces, cantidad_descuentos);    
        for (int resultado = 0; resultado < resultados.length; resultado++) {
            JOptionPane.showMessageDialog(null, resultados[resultado]);
        }
    }

    private static String nombreArticulo(){
        boolean controlador = true;
        String nombre;
        do {
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del articulo");
            if(nombre.length() == 0){
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                controlador = false;   
            }
        } while (controlador);
        return nombre;
    }

    private static double precioArticulo(String nombre){
        boolean controlador = true;
        double precio = 0;
        do {
            try {
                precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de: " + nombre));
                if(precio <= 0){
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    controlador = false;   
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (controlador);
        return precio;
    }

    private static double[] descuento(double precio){
        double descuento[] = new double[2];
        if (precio <= 10000 && precio >= 1){
            descuento[0] = precio * 0;
            descuento[1] = 1;
        }

        else if(precio <= 20000 && precio >= 10001){
            descuento[0] = precio * 0.05;
            descuento[1] = 2;
        }

        else if(precio <= 30000 && precio >= 20001){
            descuento[0] = precio * 0.08;
            descuento[1] = 3;
        }

        else{
            descuento[0] = precio * 0.10;
            descuento[1] = 4;
        }
        return descuento;
    }

    private static double precioPagar(double descuento, double precio){
        return precio - descuento;
    }

    private static String[] obtenerResultados(ArrayList<String> nombres, ArrayList<Double> precios, int veces, int[] cantidad_descuentos){
        String[] resultados = new String[4];
        
        String num_veces = "Se procesaron " + veces + " artículos.";
        resultados[0] = num_veces;

        String veces_descuentos = "Cantidad de descuentos:\n";
        veces_descuentos += "Tipo #1(0%) = " + cantidad_descuentos[0] + "\n";
        veces_descuentos += "Tipo #2(5%) = " + cantidad_descuentos[1] + "\n";
        veces_descuentos += "Tipo #3(8%) = " + cantidad_descuentos[2] + "\n";
        veces_descuentos += "Tipo #4(10%) = " + cantidad_descuentos[3] + "\n";
        resultados[1] = veces_descuentos;

        int suma = 0;
        for (int j = 0; j < precios.size(); j++) {
            suma += precios.get(j);
        }
        String ventas_total = "Las ventas totales tuvieron un valor total de: " + suma;
        resultados[2] = ventas_total;

        String productos = "Los productos son:\n";
        for (int i = 0; i < veces; i++) {
            String item = "Producto: " + nombres.get(i);
            item += " => Precio: " + precios.get(i) + "\n";
            productos += item;
        }
        resultados[3] = productos;

        return resultados;
    }
}