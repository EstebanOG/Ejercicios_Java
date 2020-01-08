/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_ciclo_while_contador;

/**
 *
 * @author juane
 */
public class Ejemplo_Ciclo_While_Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;
        int maximo;
        maximo = 10;
        
          while(cont < maximo){
            System.out.println("Contador: "+cont);
            cont = cont + 1;
        }
    }
    
}
