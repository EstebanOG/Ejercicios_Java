
package observer;

public class Compras implements ILibroMalEstado{
    @Override
    public void update() {
        System.out.println("Administracion: ");
        System.out.println("Envio una queja formal...");
    }
}
