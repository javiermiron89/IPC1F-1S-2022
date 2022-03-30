/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase7;

/**
 *
 * @author javie
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Factorial(3));
        Hanoi(3, "A", "B", "C");
    }

    static int Factorial(int numero) {
        int resultado;

        if (numero == 0) {
            resultado = 1;
        } else {
            resultado = numero * Factorial(numero - 1);
            System.out.println("Resultado [" + numero + "] : " + resultado);
        }

        return resultado;
    }

    static void Hanoi(int disco, String torre1, String torre2, String torre3) {
        if (disco == 1) {
            System.out.println("Mover disco " + disco + ", Desde " + torre1 + " hacia " + torre2);
            return;
        }

        Hanoi(disco - 1, torre1, torre3, torre2);
        System.out.println("Mover disco " + disco + ", Desde " + torre1 + " hacia " + torre2);
        Hanoi(disco - 1, torre3, torre2, torre1);
    }

}
