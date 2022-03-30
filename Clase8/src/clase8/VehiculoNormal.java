/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author javie
 */
public class VehiculoNormal extends Vehiculos {

    private int puertas;
    
    public VehiculoNormal(String placa, String marca, String modelo, int puertas){
        super(placa, marca, modelo);
        this.puertas = puertas;
    }

    /**
     * @return the puertas
     */
    public int getPuertas() {
        return puertas;
    }
    
    @Override
    public String mostrarDatos(){
        String cadena = "Placa: " + placa +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nPuertas: " + puertas;
        return cadena;
    }
    
    @Override
    public int Suma(){
        int numero1 = 10;
        int numero2 = 10;
        return numero1 + numero2;
    }
    
    
}
