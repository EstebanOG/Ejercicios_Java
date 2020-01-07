/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package parqueaderotigre;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class Registradora {
      
    
    Parqueadero miParqueadero=new Parqueadero();
   private int opcion1;
   private int opcion2;
   
    
    

    void saludo() {
      System.out.println("Bienvenido al Parqueadero Los tigres!!");
      
    }

    public int getOpcion2() {
        return opcion2;
    }

   

    public int getOpcion1() {
        return opcion1;
    }

    void Mostraropciones() {
         System.out.println("¿DESEA REALIZAR EL REGISTRO DE SU VEHICULO?:\n1.SI\n2.NO");
    }

    void ejecutarServicio() {
         System.out.println("Escoja una de las dos opciones");
         Scanner miEscanner =new Scanner(System.in);
         opcion1=miEscanner.nextInt();
         do{
             opcion1=miEscanner.nextInt();
             if(opcion1<0||opcion1>2){
                 System.out.println("Escoja una opción válida tigre");
                 
             }
         }while(opcion1<0||opcion1>2);
    }

    void registrarCarro() {
        
         System.out.println("SE PROCEDE A REALIZAR EL REGISTRO DE SU AUTO");
         miParqueadero.misCarros[0]=new Carro();        
    }

 

   String SolicitarMarca() {
        Scanner miEscanner=new Scanner(System.in);
        String Marca;
        System.out.println("DIGITE LA MARCA DE SU AUTO");
          Marca=miEscanner.nextLine();
          
        while((Marca.matches("^[0-9]{4}$"))==false){
          System.out.println("NUMÉRO DE MODELO INVÁLIDO,INGRESELA DE NUEVO");
          Marca= miEscanner.nextLine();
        }
        System.out.println("NÚMERO DE MODELO VÁLIDO");
          
        return Marca;
    }

    String SolicitarColor() {
        Scanner miEscanner=new Scanner(System.in);
        String Color;
        System.out.println("DIGITE EL COLOR DE SU AUTO");
        Color=miEscanner.nextLine();
        return Color;
    }

    String Solicitarcedula() {
        Scanner miEscanner=new Scanner(System.in);
        String cedula;
        System.out.println("DIGITE SU CÉDULA");
        cedula= miEscanner.nextLine();
        while((cedula.matches("^[0-9]{10}$"))==false){
          System.out.println("NUMÉRO DE CÉDULA INVÁLIDO,INGRESELA DE NUEVO");
          cedula= miEscanner.nextLine();
        }
        System.out.println("NÚMERO DE CÉDULA VÁLIDO");
        return cedula;
    }

    int SolicitarEstado() {
        int Estadodecolor;
        Scanner miEscanner=new Scanner(System.in);
        
        
         System.out.println("ESTADO DE PINTURA DE SU AUTO:\n1.BUENO\n2.MALO\n3.REGULAR");
         Estadodecolor= miEscanner.nextInt();
      switch(Estadodecolor){
          
          case 1 :
              System.out.println("OK");
              break;
          case 2 :
              System.out.println("OK");
              break;  
              
           case 3 :
              System.out.println("OK");
              
              break;
              
           
              
              
        
      }
return Estadodecolor;
        }

    String SolicitarPlaca() {
        Scanner miEscanner=new Scanner(System.in);
        String placa;
        System.out.println("DIGITE LA PLACA DE SU AUTO");
        
       
        placa= miEscanner.nextLine();

        
        while((placa.matches("^[A-Z]{3}[0-9]{3}$"))==false){
            System.out.println("NUMÉRO DE PLACA INVÁLIDO,INGRESELA DE NUEVO");
          placa= miEscanner.nextLine();
    }
        System.out.println("NÚMERO DE PLACA VÁLIDO");
        return placa;
        
    }

    
       

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
