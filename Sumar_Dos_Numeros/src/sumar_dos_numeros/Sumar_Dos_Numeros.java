/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumar_dos_numeros;

import java.util.Scanner;

/**
 *
 * @author juane
 */
public class Sumar_Dos_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, suma;
        
        System.out.println("Ingrese el primer numero: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = leer.nextInt();
        
        suma = n1+n2;
        System.out.println("La suma es: "+suma);
    }
    
}
