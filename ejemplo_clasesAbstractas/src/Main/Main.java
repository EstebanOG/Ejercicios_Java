package Main;
import ejemplo_clasesabstractas.*;
/**
 *
 * @author juane
 */
public class Main {

    public static void main(String[] args) {
       Circulo c = new Circulo("Circulo", 14.89);
       System.out.println("El área de el "+c.getNombre()+" es: "+c.calcularArea());
       
       Cuadrado c2 = new Cuadrado(10, "Cuadrado");
        System.out.println("El área de el "+c2.getNombre()+" es: "+c2.calcularArea());
    }
    
}
