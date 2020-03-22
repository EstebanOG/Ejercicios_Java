package chain;
/*Handler Concreto*/
/**
 *
 * @author juane
 */
public class Propietario implements IHandler {

    @Override
    public double CalculaPrecioFinal(int pCantidad, double pPrecio) {
        System.out.println("Con el propietario");
        double total = 0;
        
        /*Damos 15% de descuento*/
        total = pCantidad * pPrecio * 0.85;
        return total;
    }
    
}
