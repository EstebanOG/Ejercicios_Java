
class Abierta implements EstadoVentanilla {

    @Override
    public void atende(persona newPersona) {
        System.out.println("Atendiendo a: " + newPersona.getNombre());
    }

}
