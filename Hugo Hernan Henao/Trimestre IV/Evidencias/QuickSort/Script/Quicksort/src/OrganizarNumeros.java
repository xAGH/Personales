public class OrganizarNumeros {

    LeerFichero leer = new LeerFichero();

    public static void main(String[] args) {
        OrganizarNumeros o = new OrganizarNumeros();
        TratadoNumeros i = new TratadoNumeros();
        int cantidad = i.solicitarNumero();
        i.generarNumerosAleatorios(cantidad);
        o.obtenerLista(cantidad);
    }
    
    void obtenerLista(int cantidad){
        int[] numeros = leer.obtenerDatos(cantidad);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
