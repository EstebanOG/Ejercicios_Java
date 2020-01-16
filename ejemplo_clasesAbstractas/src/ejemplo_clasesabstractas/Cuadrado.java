package ejemplo_clasesabstractas;

/**
 *
 * @author juane
 */
public class Cuadrado extends FiguraGeometrica{
    
    private double lado;

    public Cuadrado(double lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        super.area = lado * lado;
        return super.area;
    }

    @Override
    public double calcularPerimetro() {
        super.perimetro = 4 * lado;
        return super.perimetro;
    }
    
}
