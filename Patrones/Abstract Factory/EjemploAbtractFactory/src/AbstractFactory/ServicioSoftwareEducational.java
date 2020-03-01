package AbstractFactory;
//PRODUCTO CONCRETO
public class ServicioSoftwareEducational implements ServicioInformatico {

    @Override
    public void asignarTrabajo() {
        System.out.println("Nuestros programadores han sido informados del programa que deben realizar.");
    }

    @Override
    public void indicarFechaEntrega() {
        System.out.println("Se ha fijado con fecha de entrega el día 25/03/2020.");
    }

    @Override
    public void informarSobrePago() {
        System.out.println("El monto a pagar será proporcional a la cantidad de estudiantes que hará uso del servicio.");
    }
    
}
