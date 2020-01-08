
package Main;

/**
 *
 * @author juane
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil auto1, auto2, auto3, auto4;
        
        auto1 = new Automovil();
        auto2 = new Automovil("Hi-Jet","Daigatsu",1992,1000000);
        auto3 = new Automovil();
        auto4 = new Automovil();
        
        System.out.println("------------------------------------");
        System.out.println("Automovil 1");
        System.out.println("------------------------------------");
        System.out.println("Marca: "+auto1.getMarca());
        System.out.println("Modelo: "+auto1.getModelo());
        System.out.println("Año: "+auto1.getAnio());
        System.out.println("Precio: "+auto1.getPrecio());
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("Automovil 2");
        System.out.println("------------------------------------");
        System.out.println("Marca: "+auto2.getMarca());
        System.out.println("Modelo: "+auto2.getModelo());
        System.out.println("Año: "+auto2.getAnio());
        System.out.println("Precio: "+auto2.getPrecio());
        System.out.println("------------------------------------");
    }
    
}
