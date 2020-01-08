
package Main;

/**
 *
 * @author juane
 */
public class Automovil {
    //Atributos
    private String modelo;
    private String marca;
    private int anio;
    private int precio;
    
    //Constructores
    public Automovil(){
       this.modelo = "Sin modelo";
       this.marca = "Sin marca";
       this.anio = 0;
       this.precio = 0;
    }
    
    public Automovil(String mod, String mar, int an, int pre){
        this.modelo = mod;
        this.marca = mar;
        this.anio = an;
        this.precio = pre;
    }
    
    //Metodos
    //Accesadores(get)
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public int getAnio(){
        return this.anio;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    //Mutadores (set)
    public void setPrecio(int precioNuevo){
        this.precio = precioNuevo;
    }
}
