/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package EJercicios2_Condicionales;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

    }

}
