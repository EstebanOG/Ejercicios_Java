package chain;
/*Handler Concreto*/
/**
 *
 * @author juane
 */
public class JefePiso implements IHandler{
    
    private IHandler siguiente = null; //Se utiliza para conectar con el siguiente objeto dentro de la cadena de responsabilidad

    public JefePiso(IHandler pSiguiente) {
        siguiente = pSiguiente;
    }
        
    @Override
    public double CalculaPrecioFinal(int pCantidad, double pPrecio) {
        
        System.out.println("Con el jefe de piso");
        
        /*Si son más de 100 articulos o más de 75000 en ventas
        pasa al jefe de piso
        */
        double total = pCantidad * pPrecio;
        
        if(pCantidad > 100 || total > 75000)
            total = siguiente.CalculaPrecioFinal(pCantidad, pPrecio);
        else{
            /*Damos el 10% de descuento*/
            if(pCantidad > 20)
                total *= 0.9;
        }
        return total;
    }
    
}
