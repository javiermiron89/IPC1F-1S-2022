/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase13;

/**
 *
 * @author javie
 */
public class Clase13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        Object[] listaObjetos = new Object[5];
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        Avion avion1 = new Avion();
        Avion avion2 = new Avion();
        Bicicleta bici1 = new Bicicleta();
        
        listaObjetos[0] = carro1;
        listaObjetos[1] = avion1;
        listaObjetos[2] = carro2;
        listaObjetos[3] = carro3;
        listaObjetos[4] = bici1;
        
        
        for (Object objeto : listaObjetos) {
            if (objeto instanceof Vehiculo) {
                ((Vehiculo) objeto).Mover();
            } else {
                System.out.println("NO TENGO METODO MOVER");
            }
        }
        
        /*
        Carro carro1 = new Carro();
        carro1.HacerRuido();
        carro1.Mover();
        System.out.println("Personas: " + carro1.Personas());
        
        Avion avion1 = new Avion();
        avion1.Mover();
        System.out.println("Personas: " + avion1.Personas());*/
    }
    
}
