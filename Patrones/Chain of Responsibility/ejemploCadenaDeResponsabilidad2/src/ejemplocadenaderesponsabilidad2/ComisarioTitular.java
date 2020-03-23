package ejemplocadenaderesponsabilidad2;

/**
 *
 * @author juane
 */
public class ComisarioTitular extends Jurado{
    
    private final Jurado superior;
    private String mensaje;

    public ComisarioTitular(Jurado superior) {
        this.superior = superior;
    }

    @Override
    public String evaluar(String tipo, String evento) {
        if(tipo.equals("infraccion")){
            suceso = "se esta revisando la infraccion de la carrera";
            mensaje = evento;
        }else{
           return superior.evaluar(tipo, evento);
        }
        return suceso;
    }
    
    
    
}
