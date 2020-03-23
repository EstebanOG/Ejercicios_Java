package ejemplocadenaderesponsabilidad2;

/**
 *
 * @author juane
 */
public class MesaJurado extends Jurado {
    
    private Jurado superior;

    @Override
    public String evaluar(String tipo, String evento) {
        Jurado presidente = new Presidente();
        Jurado comisario = new ComisarioTitular(presidente);
        Jurado juezDeLlegada = new JuezDeLlegada(comisario);
        Jurado moto = new ComisarioEnMoto(juezDeLlegada);
        superior = moto;
        return superior.evaluar(tipo, evento);
    }
    
}
