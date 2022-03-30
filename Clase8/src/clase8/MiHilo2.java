/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javie
 */
public class MiHilo2 implements Runnable {
    
    @Override
    public void run(){
        for (int i = 10; i > 1; i--) {
            System.out.println("Hilo 2: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("FIN HILO 2");
    }
}
