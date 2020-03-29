package observer;

import java.util.Observable;

public class Libro extends Observable {

   private String titulo;
    private String estado;

    public Libro() {

    }    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

     public String getEstado() {
        return estado;
    }

    public void setEstado(String t) {
        this.estado = t;
    }
}
