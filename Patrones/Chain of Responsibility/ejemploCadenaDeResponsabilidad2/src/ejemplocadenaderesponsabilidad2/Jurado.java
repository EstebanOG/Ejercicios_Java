package ejemplocadenaderesponsabilidad2;

/**
 *
 * @author juane
 */
public abstract class Jurado {
    
    protected String suceso;
    
    public abstract String evaluar(String tipo, String evento);
}
