/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase13;

/**
 *
 * @author javie
 */
public class Carro implements Vehiculo {
    
    public Carro(){
        
    }
    
    public void HacerRuido(){
        System.out.println("PRRRRRRRR");
    }

    public void Mover() {
        System.out.println("ME ESTOY MOVIENDO EN UN CARRO");
    }

    public int Personas() {
        int numero = 4;
        return numero;
    }
}
