package pizzeria;

//CONCRETE BUILDER
public class HawaiPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildMasa() {
        pizza.setMasa("Suave");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Dulce");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("Chorizo + alcachofas");
    }
    
}
