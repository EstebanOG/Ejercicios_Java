
public class persona {

    private String nombre;
    private String apellido;
    private int edad;

    public persona(String nombre, String apellido, int edad) {
        setApellido(apellido);
        setNombre(nombre);
        setEdad(edad);
    }

    private String getApellido() {
        return apellido;
    }

    public String getNombre(){
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre=nombre;
    }

    private void setApellido(String apellido) {
        this.apellido=apellido;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public int getEdad(){
        return edad;
    }
}
