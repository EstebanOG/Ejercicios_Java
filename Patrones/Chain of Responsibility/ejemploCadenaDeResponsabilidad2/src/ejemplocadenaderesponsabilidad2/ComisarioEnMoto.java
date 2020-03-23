package ejemplocadenaderesponsabilidad2;

/**
 *
 * @author juane
 */
public class ComisarioEnMoto extends Jurado{

    private final Jurado superior;
    private String mensaje;

    public ComisarioEnMoto(Jurado superior) {
        this.superior = superior;
    }
    
    @Override
    public String evaluar(String tipo, String evento) {
        if(tipo.equals("herido")){
            suceso = "en camino";
            mensaje = evento;
        }else{
            return superior.evaluar(tipo, evento);
        }
        return suceso;
    }
    
}
