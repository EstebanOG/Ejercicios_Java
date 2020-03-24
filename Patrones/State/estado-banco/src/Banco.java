public class Banco {
    private String nombre;
    private String direccion;
    private Ventanilla ventanilla;
    
    public Banco(){
        ventanilla=new Ventanilla();
    }
    
    public void atende(persona newPersona){
        System.out.println(newPersona.getNombre()+"ingresa a la fila.");
        ventanilla.atende(newPersona);
    }
    
    public void suspendeVentanilla(){
        ventanilla.suspendete();
    }
    
    public void cerraVentanilla(){
        ventanilla.abrite();
    }
    
    public String getNombre(){
        return nombre;
    }
}
