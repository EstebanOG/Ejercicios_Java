package ejemplo_clasesabstractas;

/**
 *
 * @author juane
 */
public class Circulo extends FiguraGeometrica{
    private double radio;
    
    public Circulo(String nombre, double radio){
        super(nombre);//Se llama al constructor de la clase superior
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        super.area = Math.PI * (radio * radio);
        return super.area;
    }

    @Override
    public double calcularPerimetro() {
        super.perimetro = 2 * Math.PI * radio;
        return super.perimetro;
    }
        
}
