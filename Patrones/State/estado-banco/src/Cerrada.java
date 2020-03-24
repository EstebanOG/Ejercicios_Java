class Cerrada implements EstadoVentanilla{

    @Override
    public void atende(persona newPersona) {
        System.out.println("Ventanilla Cerrada!");
    }
    
}
