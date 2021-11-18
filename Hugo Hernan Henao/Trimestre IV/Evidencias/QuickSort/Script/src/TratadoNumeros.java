import java.io.BufferedReader;
import java.io.InputStreamReader;

class TratadoNumeros {
    
    CrearFichero escribir = new CrearFichero("numeros/numeros_generados.txt");

    int solicitarNumero() {
        Integer numero = 0;

        while (true){
            System.out.print("\033[H\033[2J");
            System.out.print("Ingrese un número entero: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                numero = Integer.parseInt(reader.readLine());
                if(numero < 1){
                    System.out.print("\033[H\033[2J");
                    System.out.println("Ingrese solo números enteros");
                }
                else{break;}
            } catch (Exception e) {
                System.out.print("\033[H\033[2J");
                System.out.println("Ingrese solo números enteros");
            }
        }
        return numero;
    }

    void generarNumerosAleatorios(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            int numero = (int) Math.floor(Math.random()*((-1000)-1000)+1001);
            escribir.agregarDatosAlArchivo(numero);
        }
        
        escribir.terminarIngreso();
        System.out.print("\033[H\033[2J");
        System.out.println("En la carpeta '../numeros' se encuentra el archivo con los números generados.\n");
    }
}