package AbstractFactory;
//FACTORIA CONCRETA
public class SoftwareFactory implements ServicioFactory{

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioSoftwareEducational();
    }
    
}
