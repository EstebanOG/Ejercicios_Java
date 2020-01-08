package ejercicioherencia;
/**
 *
 * @author juane
 */
public class Profesor extends Trabajador{
    private String titulo;

    public Profesor(String titulo, int sueldo, String cedula, String nombre) {
        super(sueldo, cedula, nombre);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.getNombre()+" "+titulo+ " " + super.getSueldo()+ " "+ super.getCedula();
    }
    
    
}
