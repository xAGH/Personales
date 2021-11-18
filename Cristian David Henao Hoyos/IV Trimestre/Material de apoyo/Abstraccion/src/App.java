public class App {
    public static void main(String[] args) {
        Flauta miFlauta = new Flauta();
        Guitarra miGuitarra = new Guitarra();
        System.out.println(miFlauta.tocar());
        System.out.println(miGuitarra.tocar());
        System.out.println(miFlauta.limpiar());
        System.out.println(miGuitarra.tocar());
    }
}
