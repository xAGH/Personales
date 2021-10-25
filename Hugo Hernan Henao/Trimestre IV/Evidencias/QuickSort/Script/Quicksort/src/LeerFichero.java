import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class LeerFichero {

    File file;
    FileReader fr;
    BufferedReader br;

    public LeerFichero(){
        try {
            String ruta = "./numeros_generados.txt";

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

    int[] obtenerDatos(int cantidad){
        int[] numeros = new int[cantidad];
        try {
            String linea;
            int bandera = 0;
            while((linea = this.br.readLine()) != null){
                numeros[bandera] = Integer.parseInt(linea);
                bandera ++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numeros;
    }

    void terminarLeer(){
        try {
            this.br.close();
            this.fr.close();
            this.file.delete();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    };
}
