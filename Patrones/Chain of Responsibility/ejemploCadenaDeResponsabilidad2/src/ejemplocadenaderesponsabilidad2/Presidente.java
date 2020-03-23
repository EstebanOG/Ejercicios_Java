package ejemplocadenaderesponsabilidad2;

/**
 *
 * @author juane
 */
public class Presidente extends Jurado {
    private String mensaje;

    @Override
    public String evaluar(String tipo, String evento) {
        suceso = "la infraccion se evaluara despues de la carrera";
        return suceso;
    }
    
}
