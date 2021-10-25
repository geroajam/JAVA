/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.

 */
package Ejercicios4_VectoresYMatrices;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[] vector;
        vector = new int[100];

        for (int i = 100; i > 0; i--) {
            System.out.println (i);
        }
    }

}
