/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author javie
 */
public class Clase14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Como crear un ArrayList
        ArrayList<String> arr = new ArrayList<String>();
        //Agregar datos a un ArrayList
        arr.add("Hyundai");
        arr.add("BMW");
        arr.add("Nissan");
        arr.add("Mercedes Benz");
        arr.add("Audi");
        arr.add("IPC1");
        System.out.println(arr);
        //Obtener un valor en una posicion especifica
        String carro = arr.get(1);
        System.out.println(carro);
        //Actualizar un valor en una posicion especifica
        arr.set(1, "IPC1");
        System.out.println(arr.get(1));
        //Remover/Borrar datos en una posicion
        arr.remove(2);
        System.out.println(arr);
        //Eliminar todos los datos de un ArraList
        //arr.clear();
        //System.out.println(arr);
        //Saber el tamaño de un ArrayList
        System.out.println("tamanio: " + arr.size());
        //Saber la ultima posicion de un valor en el ArrayList
        System.out.println("indice: " + arr.lastIndexOf("IPC1"));

        //Recorrer un ArrayList con FOR
        System.out.println("\nRECORRIENDO CON FOR");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        //Recorrer un ArrayList con FOR EACH
        System.out.println("\nRECORRIENDO CON FOR EACH");
        for (String dato : arr) {
            System.out.println(dato);
        }
        
        //Ordenamiento de mayor a menor (int) o alfabetico (String)
        System.out.println("\nOrdenando DATOS");
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        
        //Elimar la primer coincidencias
        arr.remove("IPC1");
        System.out.println(arr);
        
        //Saber si un ArrayList esta vacio
        System.out.println("Esta vacio? " + arr.isEmpty());
        
        //Clonar un ArrayList
        ArrayList nuevoArr = (ArrayList) arr.clone();
        System.out.println("\nImprimiendo la copia:");
        System.out.println(nuevoArr);
        
        //Pasar un ArrayList a un Array(Vector[])
        System.out.println("\nConvertir a Array simple:");
        Object[] vec = arr.toArray();
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
        
        
        //ARRAYLIST DE NUESTRO PROPIO TIPO (OBJETOS)
        System.out.println("\n\n\n\n");
        ArrayList<Carro> listaCarros = new ArrayList<Carro>();
        
        Carro carro1 = new Carro("ABC123", "BMW", 2);
        Carro carro2 = new Carro("ESC458", "Hyundai", 4);
        Carro carro3 = new Carro("JFU365", "Porsche", 4);
        listaCarros.add(carro1);
        listaCarros.add(carro2);
        listaCarros.add(carro3);
        System.out.println("Lista de carros: " + listaCarros);
        
        for (Carro carrito : listaCarros) {
            System.out.println("Datos:");
            carrito.MostrarDatos();
        }
        
    }

}
