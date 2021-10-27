public class App extends Thread{

    public static void main(String[] args){
        Cronometro cronometro = new Cronometro();
        OrganizarNumeros organizar = new OrganizarNumeros();
        TratadoNumeros tratado = new TratadoNumeros();

        int cantidad = tratado.solicitarNumero();
        tratado.generarNumerosAleatorios(cantidad);

        long inicio = cronometro.obtenerTiempo();

        int [] numeros = organizar.obtenerLista(cantidad);
        int[] numeros_ordenados =  organizar.quicksort(numeros, 0, numeros.length - 1);
        organizar.guardarNumerosOrdenados(numeros_ordenados);

        long fin = cronometro.obtenerTiempo();

        System.out.println("Tiempo demorado(hh:mm:ss.ssss): " + cronometro.duracion(inicio, fin) + "\n");

        organizar.eliminarArchivo();
    }
}
