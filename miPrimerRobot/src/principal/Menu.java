
package principal;

import java.util.Scanner;

/**
 *
 * @author juane
 */
public class Menu {
    private int opcion;
    private Robot robot;
    private Scanner leer;
    
    public Menu(){
        robot = new Robot("MrRobot");
        leer = new Scanner(System.in);
    }
    
    public void desplegar(){
        do{
            robot.status();
            System.out.println("1. - Cargar");
            System.out.println("2. - Golpear");
            System.out.println("3. - Reparar");
            System.out.println("4. - Salir");
            System.out.println("OP: ");
            opcion = leer.nextInt();

            switch(opcion){
                case 1: 
                    robot.cargar();
                    break;
                case 2:
                    robot.golpear();
                    break;
                case 3:
                    robot.reparar();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar");
                    break;
            }
        }while(opcion != 4);
        
    }
}
