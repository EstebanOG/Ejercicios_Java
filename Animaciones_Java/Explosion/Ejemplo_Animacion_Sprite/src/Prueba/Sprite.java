/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author juane
 */
public class Sprite extends JFrame implements Runnable{

    int AnchoVentana = 500;
    int AltoVentana = 400;
    
    Image img;
    Thread hilo;
    int incremento = 0;
    BufferedImage bi;
    
    public Sprite(){
        setSize(AnchoVentana,AltoVentana);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Animacion");
        setResizable(false);
        hilo = new Thread(this);
        bi = new BufferedImage(AnchoVentana, AltoVentana,BufferedImage.TYPE_INT_RGB);
        Toolkit herramienta = Toolkit.getDefaultToolkit();
        img = herramienta.getImage(getClass().getResource("/Imagenes/explosion.png"));
        hilo.start();
    }
    
    public void paint(Graphics g){
        Graphics2D g2d;
      
        g.drawImage(bi, 0, 0, this);
        g2d = bi.createGraphics();
        g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
        //96X
        //162Y
        int movimientoX = (incremento&6)*96;
        int movimientoY = (incremento/6)*96;
        
        g2d.drawImage(img, 200, 200, 200+96, 200+96,movimientoX, movimientoY, movimientoX+96, movimientoY+96, this);
        repaint();
    }
    
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sprite.class.getName()).log(Level.SEVERE, null, ex);
            }
            incremento++;
            
            if(incremento > 20)
                incremento=0;
        }
    }
    
    public static void main(String[] args) {
        new Sprite().setVisible(true);
    }
}
