package chain;
/*HANDLER CONCRETO*/
/**
 *
 * @author juane
 */
public class Vendedor implements IHandler {
    
    private IHandler siguiente = null; //Se utiliza para conectar con el siguiente objeto dentro de la cadena de responsabilidad

    public Vendedor(IHandler pSiguiente) {
        siguiente = pSiguiente;
    }

    @Override
    public double CalculaPrecioFinal(int pCantidad, double pPrecio) {
        
        System.out.println("Con el vendedor");
        
        /*Si son más de 20 articulos o más de 20000 en ventas
        pasa al jefe de piso
        */
        double total = pCantidad * pPrecio;
        
        if(pCantidad > 20 || total>20000)
            total = siguiente.CalculaPrecioFinal(pCantidad, pPrecio);
        else{
            /* Si son más de 10 damo un 5% de descuento*/
            if(pCantidad > 10)
                total *= 0.95;
        }
        return total;
    }   
    
    
}
