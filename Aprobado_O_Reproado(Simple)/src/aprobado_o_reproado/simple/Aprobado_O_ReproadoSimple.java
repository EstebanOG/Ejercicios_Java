/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprobado_o_reproado.simple;

import java.util.Scanner;

/**
 *
 * @author juane
 */
public class Aprobado_O_ReproadoSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float promedio;
        
        System.out.println("Ingrese el promedio final: ");
        promedio = leer.nextFloat();
        
        if(promedio<3){
            System.out.println("Reprobado");
        }else{
            System.out.println("Aprobado");
        }
        
    }
    
}
