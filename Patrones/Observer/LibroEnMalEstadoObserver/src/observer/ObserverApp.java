package observer;

public class ObserverApp {

    public static void main(String[] args) {
       AlarmaLibro a = new AlarmaLibro();
       a.attach(new Compras());
       a.attach(new Administracion());
       a.attach(new Stock());
       
       Libro libro = new Libro();
       libro.setEstado("MALO");
       
       Biblioteca b = new Biblioteca();
       b.devuelveElLibro(libro);
    }

}
