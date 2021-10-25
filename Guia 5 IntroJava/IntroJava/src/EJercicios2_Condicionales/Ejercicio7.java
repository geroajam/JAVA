/*
Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla
 */
package EJercicios2_Condicionales;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos números enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > num2) {
            System.out.println("El número mayor es " + num1);
        }
        if (num1 < num2) {
            System.out.println("El número mayor es " + num2);
        }
        if (num1 == num2) {
            System.out.println("Los números son iguales");
        }
    }

}
