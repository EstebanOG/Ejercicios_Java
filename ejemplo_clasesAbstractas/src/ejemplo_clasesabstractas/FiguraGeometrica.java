package ejemplo_clasesabstractas;

/**
 *
 * @author juane
 */
public abstract class FiguraGeometrica {
    private String nombre;
    public double area;
    public double perimetro;
    
    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
