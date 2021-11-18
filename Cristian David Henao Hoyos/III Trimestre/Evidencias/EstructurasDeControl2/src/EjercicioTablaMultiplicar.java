public class EjercicioTablaMultiplicar {

	public static void main(String[] args) {
		
		/*
		 * Algoritmo que permita calcular la tabla de multiplicar
		 * de un numero ingresado por el usuario.
		 * 
		 * deberá imprimir los resultados de la tabla desde el 1 hasta el n.
		 * 
		 *	Adicional, modifique este algoritmo para que realice lo siguiente:
		 *	1. Calcule la sumatoria de los resultados obtenidos.
		 *	2. Realice este proceso para que presente los diferentes resultados
		 *	   de las tablas del 1 hasta el 10 
		 */
		
        int suma;
        for(int j = 1; j < 11; j++){
            int multi = 0;
            suma = 0;
            for (int i = 1; i < 11; i++) {
                multi = j * i;
                suma += multi;
                System.out.println(j + " x " + i + " = " + multi);
            }
            System.out.println("\nLa suma de los resultados de la tabla del " +  " es: " + suma + "\n");
        }
		
    }
}