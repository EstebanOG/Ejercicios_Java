package pizzeria;

//CONCRETE BUILDER
public class PicantePizzaBuilder extends PizzaBuilder {

    @Override
    public void buildMasa() {
        pizza.setMasa("Cocida");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Picante");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("Pimineta + salchichón");
    }
   
}
