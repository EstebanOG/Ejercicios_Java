/*
/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueaderotigre;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class ParqueaderoTigre {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
     
        Vista window = new Vista();
        window.setTitle("Parqueadero");
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        int ficha=0;
        Registradora miRegistradora=new Registradora();
        Dueño miDueño=new Dueño();
        Parqueadero miParqueadero=new Parqueadero();
        int seguir=0;
        miRegistradora.saludo();
        do{
        miRegistradora.Mostraropciones();
        miRegistradora.ejecutarServicio();
        
        System.out.println(miRegistradora.getOpcion1());
        
        switch(miRegistradora.getOpcion1()){
            case 1:
                miParqueadero.misCarros[ficha]=new Carro();
                miRegistradora.registrarCarro();
             miParqueadero.misCarros[ficha].setPlaca(miRegistradora.SolicitarPlaca());
                miParqueadero.misCarros[ficha].setCedula(miRegistradora.Solicitarcedula());
                miParqueadero.misCarros[ficha].setMarca(miRegistradora.SolicitarMarca());
           miParqueadero.misCarros[ficha].setColor(miRegistradora.SolicitarColor());
          miParqueadero.misCarros[ficha].setEstadodecolor(miRegistradora.SolicitarEstado());
     
                 ficha ++;
            case 2:
                break;
        }
        
       
       
      // Scanner miEscanner =new Scanner(System.in);
       //seguir=miEscanner.nextInt();
        
        
        }while((miRegistradora.getOpcion1())!=2);
        
   
        
        }
}