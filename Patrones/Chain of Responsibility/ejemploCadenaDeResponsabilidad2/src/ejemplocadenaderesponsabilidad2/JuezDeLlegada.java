package ejemplocadenaderesponsabilidad2;

/**
 *
 * @author juane
 */
public class JuezDeLlegada extends Jurado{
    
    private final Jurado superior;
    private String mensaje;

    public JuezDeLlegada(Jurado superior) {
        this.superior = superior;
    }
    
    @Override
    public String evaluar(String tipo, String evento) {
        if(tipo.equals("meta")){
            suceso = "ganador" + "evento";
        }else{
            return superior.evaluar(tipo, evento);
        }
        return suceso;
    }
}
