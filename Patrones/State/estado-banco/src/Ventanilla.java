
class Ventanilla {

    private EstadoVentanilla estado;
    private String cajero;

    public Ventanilla() {
        estado = new Abierta();
    }

    void atende(persona newPersona) {
        estado.atende(newPersona);
    }

    void suspendete() {
        estado = new Suspendida();
    }

    void cerrate() {
        estado = new Cerrada();
    }
    
    public void abrite(){
        estado=new Abierta();
    }
    
    public String getCajero(){
        return cajero;
    }
}
