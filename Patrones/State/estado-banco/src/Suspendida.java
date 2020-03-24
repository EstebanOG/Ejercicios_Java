class Suspendida implements EstadoVentanilla{

    @Override
    public void atende(persona newPersona) {
        if(newPersona.getEdad()>65){
            System.out.println("Atendiendo a: "+ newPersona.getNombre());
        }
        else{
            System.out.println("Espere 5 minutos por favor");
        }
    }
    
}
