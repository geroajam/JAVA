/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial.
 */
package Ejercicios3_BuclesYSentencias;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j, suma, valorlim, numeros;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo");
        valorlim = leer.nextInt();
        System.out.println("Ingrese números");
        suma = 0;

        do {
            numeros = leer.nextInt();
            suma = suma + numeros;

        } while (suma <= valorlim);
        System.out.println("La suma de los números introducidos ha superado el limite inicial");

    }

}
