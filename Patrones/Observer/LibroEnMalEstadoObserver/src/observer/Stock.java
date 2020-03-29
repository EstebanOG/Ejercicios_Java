
package observer;

public class Stock implements ILibroMalEstado{
    @Override
    public void update() {
        System.out.println("Administracion: ");
        System.out.println("Envio una queja formal...");
    }
}
