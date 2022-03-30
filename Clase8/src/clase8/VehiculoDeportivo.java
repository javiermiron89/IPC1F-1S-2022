/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author javie
 */
public class VehiculoDeportivo extends Vehiculos {
    
    private int velocidad;

    public VehiculoDeportivo(String placa, String marca, String modelo, int velocidad) {
        super(placa, marca, modelo);
        this.velocidad = velocidad;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }
    
    @Override
    public String mostrarDatos(){
        String cadena = "Placa: " + placa +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nVelociad: " + velocidad;
        return cadena;
    }
    
    @Override
    public int Suma(){
        int numero1 = 15;
        int numero2 = 15;
        return numero1 + numero2;
    }
    
    
}
