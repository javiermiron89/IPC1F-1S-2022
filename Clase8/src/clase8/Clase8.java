/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8;

/**
 *
 * @author javie
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculos vehiculos[] = new Vehiculos[4];
        
        vehiculos[0] = new Vehiculos("P-123ABC", "Marca", "Modelo");
        vehiculos[1] = new VehiculoNormal("P-485KSO", "Toyota", "2022", 4);
        vehiculos[2] = new VehiculoDeportivo("P-741SUW", "Ferrari", "2023", 320);
        vehiculos[3] = new VehiculoPickup("P-756DES", "Nissan", "2020", 1000);
        
        for (Vehiculos carro : vehiculos) {
            System.out.println(carro.Suma());
            System.out.println("");
        }
        
    }
    
}
