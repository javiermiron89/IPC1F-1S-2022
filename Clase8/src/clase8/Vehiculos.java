/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

/**
 *
 * @author javie
 */
public class Vehiculos {

    protected String placa;
    protected String marca;
    protected String modelo;

    public Vehiculos(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }
    
    public String mostrarDatos(){
        String cadena = "Placa: " + placa +
                "\nMarca: " + marca +
                "\nModelo: " + modelo;
        return cadena;
    }
    
    public int Suma(){
        int numero1 = 5;
        int numero2 = 5;
        return numero1 + numero2;
    }
    
}
