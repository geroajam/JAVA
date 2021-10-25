/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Ejercicios3_BuclesYSentencias;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
        } while (nota < 0 || nota > 10);
        if (nota > 0 || nota < 10) {
            System.out.println("NOTA CORRECTA");
        }

    }

}
