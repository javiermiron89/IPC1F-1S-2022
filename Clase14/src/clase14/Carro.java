/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase14;

/**
 *
 * @author javie
 */
public class Carro {
    
    public String Placa;
    public String Marca;
    public int Puertas;
    
    public Carro(String placa, String marca, int puertas){
        this.Placa = placa;
        this.Marca = marca;
        this.Puertas = puertas;
    }
    
    public void MostrarDatos(){
        System.out.println("Placa: " + this.Placa);
        System.out.println("Marca: " + this.Marca);
        System.out.println("Puertas: " + this.Puertas);
    }
    
}
