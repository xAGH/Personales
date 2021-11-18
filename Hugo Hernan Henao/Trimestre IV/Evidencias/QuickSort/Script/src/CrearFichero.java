import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

class CrearFichero {

    File file;
    FileWriter fw;
    BufferedWriter bw;

    public CrearFichero(String nombre){
        try {
            String ruta = "./" + nombre;

            this.file = new File(ruta);

            if (!file.exists()) {
                this.file.createNewFile();
            }
            
            this.fw = new FileWriter(this.file);
            this.bw = new BufferedWriter(this.fw);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    void agregarDatosAlArchivo(int numero){
        try {
            this.bw.write(numero + "\n");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    void terminarIngreso(){
        try {
            this.bw.close();
            this.fw.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
