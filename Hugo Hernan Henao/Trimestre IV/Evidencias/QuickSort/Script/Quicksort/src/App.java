public class App extends Thread{

    public static void main(String[] args){
        Cronometro cronometro = new Cronometro();
        long inicio = cronometro.obtenerTiempo();
        try {
            Thread.sleep(5220);
        } catch (Exception e) {}
        long fin = cronometro.obtenerTiempo();
        System.out.println(cronometro.duracion(inicio, fin));
    }
}
