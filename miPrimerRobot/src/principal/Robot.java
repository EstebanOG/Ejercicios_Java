
package principal;

/**
 *
 * @author juane
 */
public class Robot { 
    //Atributos
    private String nombre;
    private int energia;
    
    //Constructores
    public Robot(){
        this.nombre = "Robocop";
        this.energia = 100;
    }
    
    public Robot(String nombre){
        this.nombre = nombre;
        this.energia = 100;
    }
    
    //metodos
   public void cargar(){
       energia = energia+10;
   }
   public void golpear(){
       energia = energia-10;
   }
   public void reparar(){
       energia = 100;
   }
   public void status(){
       String estado;
       
       if(estaVivo()){
           estado = "Vivo";
       }else{
           estado = "Muerto";
       }
       
       System.out.println(nombre + " - "+ estado + " - "+ energia + "%");
   }
   public boolean estaVivo(){
       return energia > 0;
   }
}
