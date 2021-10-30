public class Cronometro {
    
    long obtenerTiempo(){
        long tiempo = System.currentTimeMillis();
        return tiempo;
    }

    String duracion(long inicio, long fin){
        long milisegundos = fin - inicio;
        int segundos = 0;
        int minutos = 0;
        int horas = 0;

        if (milisegundos > 999) {
            segundos = (int) Math.floor(milisegundos / 1000);
            milisegundos = (int) Math.floor(milisegundos % 1000);
        }

        if(segundos > 59) {
            minutos = (int) Math.floor(segundos / 60);
            segundos = (int) Math.floor(segundos % 60);
        }

        if(minutos > 59) {
            horas = (int) Math.floor(minutos / 60);
            minutos = (int) Math.floor(minutos % 60);
        }

        return formatearResultado(milisegundos, segundos, minutos, horas);
    }

    static String formatearResultado(long mm, int s, int m, int h) {
        String milisegundos = String.format("%0" + 4 + "d", mm);
        String segundos = String.format("%0" + 2 + "d", s);
        String minutos = String.format("%0" + 2 + "d", m);
        String horas = String.format("%0" + 2 + "d", h);
        
        return horas + ":" + minutos + ":" + segundos + "." + milisegundos;
    }

}
