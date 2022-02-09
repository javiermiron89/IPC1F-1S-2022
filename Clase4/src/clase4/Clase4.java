/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4;

/**
 *
 * @author javie
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ACA PROGRAMAMOS NUESTRO CODIGO
        
        //Vamos a generar un objeto
        Perro perro1 = new Perro();
        Perro perro2 = new Perro("Golden", 3, 5, "Dorado");
        
        perro1.setAnios(1);
        perro1.setRaza("Maltes");
        
        perro2.MostrarDatos();
        perro2.AumentarEdad(10);
        perro2.MostrarDatos();
        
        Perro[] perros = new Perro[8];
        
        int anios = 0;
        for (int i = 0; i < perros.length; i++) {
            System.out.println("****************************");
            perros[i] = new Perro("Cualquiera", 3, anios, "Negro");
            if(perros[i].getAnios() >= 10) {
                System.out.println("Soy igual o mayor a 10 [" + anios + "]");
            }
            perros[i].MostrarDatos();
            anios += 2;
        }
        //System.out.println(perro1);
        //System.out.println(perro2.Comer());
        
        
    }
    
}
