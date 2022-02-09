/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

/**
 *
 * @author javie
 */
public class Perro {
    
    //ATRIBUTOS
    private String raza;
    private int tamano; //1 = pequeño, 2 = mediano, 3 = grande
    private int anios; //Variable que contiene la cantidad de años de una mascota
    private String color; //Nos indica el color del perro
    
    public Perro(){
    }
    
    public Perro(String raza, int tamano, int anios, String color){
        this.raza = raza;
        this.tamano = tamano;
        this.anios = anios;
        this.color = color;
    }
    
    public void MostrarDatos(){
        System.out.println("Raza: " + raza);
        System.out.println("Tamaño: " + tamano);
        System.out.println("Años: " + anios);
        System.out.println("Color: " + color);
    }
    
    public void AumentarEdad(int cantidadAnios){
        this.anios += cantidadAnios;
        //this.anios = this.anios + cantidadAnios;
        
    }
    
    public String Comer(){
        String comiendo = "El perro esta comiendo";
        System.out.println("El perro esta comiendo (comentario)");
        return comiendo;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the anios
     */
    public int getAnios() {
        return anios;
    }

    /**
     * @param anios the anios to set
     */
    public void setAnios(int anios) {
        this.anios = anios;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}
