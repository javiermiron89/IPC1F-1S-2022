/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author javie
 */
public class VehiculoPickup extends Vehiculos {
    private int capacidad;

    public VehiculoPickup(String placa, String marca, String modelo, int capacidad) {
        super(placa, marca, modelo);
        this.capacidad = capacidad;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }
    
    @Override
    public String mostrarDatos(){
        String cadena = "Placa: " + placa +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nCapacidad: " + capacidad;
        return cadena;
    }
    
    @Override
    public int Suma(){
        int numero1 = 20;
        int numero2 = 20;
        return numero1 + numero2;
    }
    
}
