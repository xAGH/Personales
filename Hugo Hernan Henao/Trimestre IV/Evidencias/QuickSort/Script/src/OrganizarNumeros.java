public class OrganizarNumeros {

    LeerFichero leer = new LeerFichero("numeros/numeros_generados.txt");
    CrearFichero escribir = new CrearFichero("numeros/numeros_ordenados.txt");
    
    int[] obtenerLista(int cantidad){
        int[] numeros = new int[cantidad];
        leer.obtenerDatos(numeros);
        return numeros;
    }

    int ordenamiento(int[] numeros, int izquierda, int derecha){
        int pivote = numeros[izquierda];

        while (true) {

            while (numeros[izquierda] < pivote) {
                izquierda++;
            }

            while (numeros[derecha] > pivote) {
                derecha--;
            }

            if (izquierda >= derecha) {
                return derecha;
            } 
            
            int temporal = numeros[izquierda];
            numeros[izquierda] = numeros[derecha];
            numeros[derecha] = temporal;
            izquierda++;
            derecha--;
        }
    }

    int[] quicksort(int numeros[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = ordenamiento(numeros, izquierda, derecha);
            quicksort(numeros, izquierda, indiceParticion);
            quicksort(numeros, indiceParticion + 1, derecha);
        }
        return numeros;
    }

    void guardarNumerosOrdenados(int[] numeros){
        System.out.println("Números organizados: ");
        for (int numero = 0; numero < numeros.length; numero++) {
            System.out.println(numeros[numero]);
            int num = numeros[numero];
            escribir.agregarDatosAlArchivo(num);
        }
        escribir.terminarIngreso();
        System.out.println("\nEn la carpeta '../numeros' se encuentra el archivo con los números organizados.\n");
    }

    void eliminarArchivo(){
        leer.borrarArchivo();
    }
}
