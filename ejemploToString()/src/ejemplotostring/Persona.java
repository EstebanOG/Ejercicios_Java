package ejemplotostring;
/**
 *
 * @author juane
 */
public class Persona {
    private String rut;
    private String nombre;
    private int edad;
    /**
     * Este es el constructor de la clase Persona
     * @param rut El rut como String
     * @param nombre Nombre como String
     * @param edad Edad como int
     */
    public Persona(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * Este metodo se utilizará para rescatar el rut de la persona
     * @return El rut como String
     */
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre+" "+edad;
    }
}
