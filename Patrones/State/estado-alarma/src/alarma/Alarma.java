package alarma;

/**
 *
 * @author juane
 */
public class Alarma {
    private Estado miEstado;

    public void setMiEstado(Estado e) {
        this.miEstado = e;
    }
    
    public void ejecutarAccion(){
        miEstado.ejecutarAccion();
    }
}
