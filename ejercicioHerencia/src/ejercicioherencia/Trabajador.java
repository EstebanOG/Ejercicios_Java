package ejercicioherencia;

/**
 *
 * @author juane
 */
public class Trabajador extends Persona{
    private int sueldo;

    public Trabajador(int sueldo, String cedula, String nombre) {
        super(cedula, nombre);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
