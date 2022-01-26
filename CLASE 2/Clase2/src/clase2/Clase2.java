
package clase2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = 10;
        double decimal1 = 0.0;
        String palabra1 = "Hola";
        boolean decision = false;
        
        System.out.println(numero1);
        
        if (numero1 != 10) {
            System.out.println("El numero NO es 10");
        } else {
            System.out.println("El numero es 10");
        }
        
        
        char var = 'W';
        
        switch (var) {
            case 'W':
                System.out.println("Arriba");
                break;
            case 'S':
                System.out.println("Abajo");
                break;
            default:
                System.out.println("Estoy en valor por defecto");
        }
        
        int n1 = 0;
        while (n1 < 5) {
            n1 = n1 + 1;
            System.out.println("variable: " + n1);
        }
        
        int n2 = 0;
        System.out.println("VAMOS CON EL DO WHILE");
        do {
            System.out.println("Variable do: " + n2);
            n2++; //N2 = 1
        } while (n2 <= 1);
        
        System.out.println("-------------");
        //FOR
        for (int i = 0; i < 10; i++) {
            System.out.println("indice: " + i);
        }
        
        
        System.out.println("####################");
        //EJEMPLO DE ALGORITMO DE NUMERO PAR O IMPAR
        int valor = 0;
        System.out.println("Ingrese un numero: ");
        Scanner lector1 = new Scanner(System.in);
        valor = lector1.nextInt();
        
        if (valor % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
        
        
    }
    
}
