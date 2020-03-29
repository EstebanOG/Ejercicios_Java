package observer;

public class Biblioteca {

    public void devuelveElLibro(Libro libro) {
        if (libro.getEstado().equals("MALO")) {
            AlarmaLibro a = new AlarmaLibro();
            a.notifyObserver();
        }
    }
}
