/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author javie
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("VAMOS A EMPEZAR CON LOS ARREGLOS UNIDIMENSIONALES");
        int numero = 7;
        int[] notas = new int[numero];
        notas[0] = 5;
        notas[1] = 27;
        notas[2] = 43;
        notas[3] = 12;
        notas[4] = 8;
        notas[5] = 7;
        notas[6] = 0;
        
        for (int i = 0; i < 7; i++) {
            System.out.println(notas[i]);
        }
        
        
        System.out.println("VAMOS A EMPEZAR CON LOS ARREGLOS BIDIMENSIONALES");
        int filas;
        int columnas;
        System.out.println("INGRESE LAS FILAS: ");
        Scanner datosFilas = new Scanner(System.in);
        filas = datosFilas.nextInt();
        System.out.println("INGRESE LAS COLUMNAS: ");
        Scanner datosColumnas = new Scanner(System.in);
        columnas = datosColumnas.nextInt();
        
        System.out.println("Tamaño filas: " + filas);
        System.out.println("Tamaño columnas: " + columnas);
        
        int[][] matriz = new int[filas][columnas];
        matriz[0][0] = 10;
        matriz[0][1] = 11;
        
        for (int i = 0; i < filas; i++) {
            //System.out.println("FILA: " + i);
            for (int j = 0; j < columnas; j++) {
                //System.out.println("COLUMNAS: " + j);
                //System.out.println("Valor en [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
        
        /*
        try {
            System.out.println(matriz[100][100]);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }*/
        
        //RANDOM TRUE/FALSE
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextBoolean());
        
        
        
        
    }
    
    
}

