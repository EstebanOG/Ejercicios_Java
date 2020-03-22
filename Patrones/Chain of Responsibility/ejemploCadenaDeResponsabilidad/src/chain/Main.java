package chain;

/**
 *
 * @author juane
 */
public class Main {
    public static void main(String[] args) {
        //Creamos la cadena
        Propietario elPropietario = new Propietario();
        JefePiso elJefe = new JefePiso(elPropietario);
        Vendedor elVendedor = new Vendedor(elJefe);
        
        int cantidad = 150;//Cantidad de productos
        double precio = 10000;//Valor de cada producto
        double total = 0;
        total = elVendedor.CalculaPrecioFinal(cantidad, precio);
        System.out.println("Total "+cantidad * precio+" con descuento "+ total);
    }
}
