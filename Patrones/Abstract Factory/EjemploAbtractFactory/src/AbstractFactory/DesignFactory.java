package AbstractFactory;
//FACTORIA CONCRETA
public class DesignFactory implements ServicioFactory{

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioDesign();
    }
    
}
