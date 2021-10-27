import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeerFichero {

    File file;
    FileReader fr;
    BufferedReader br;

    public LeerFichero(String nombre_ruta){
        try {
            String ruta = nombre_ruta;

            this.file = new File(ruta);

            if (!file.exists()) {
                this.file.createNewFile();
            }
 
            this.fr = new FileReader(this.file);
            this.br = new BufferedReader(this.fr);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    int[] obtenerDatos(int[] numeros){
        try {
            String linea;
            int bandera = 0;
            
            while((linea = this.br.readLine()) != null){
                numeros[bandera] = Integer.parseInt(linea);
                bandera ++;
            }

            this.br.close();
            this.fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return numeros;
    }

    void borrarArchivo(){
        System.out.print("¿Desea borrar el archivo de texto con los números generados aleatoriamente.?\n1. Si.\n2.No.\nOpción: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int decision = Integer.parseInt(reader.readLine());
            if (decision == 1){
                System.out.println("Archivo de números generados eliminados.");
                this.file.delete();
                return;
            }
            System.out.println("Archivo de números generados almacenado.");
        }
        catch (Exception e){
            System.out.println("Archivo de números generados almacenado.");
        }
    }
}
