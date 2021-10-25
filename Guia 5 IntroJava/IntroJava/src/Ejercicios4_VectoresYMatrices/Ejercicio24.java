/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejercicios4_VectoresYMatrices;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, contador,contador2,contador3,contador4,contador5;
        int[] vector;
        contador = 0;
        contador2 = 0;
        contador3 = 0;
        contador4 = 0;
        contador5=0;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        System.out.println("");

        vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = ((int) (Math.random() * 9999));
            System.out.println(vector[i]);

        }
        for (int i = 0; i < n; i++) {
            if (vector[i] >= 1 && vector[i] <= 9) {
                contador++;
            }
            if (vector[i] >= 10 && vector[i] <= 99) {
                contador2++;
            }
             if (vector[i] >= 100 && vector[i] <= 999) {
                contador3++;
            }
              if (vector[i] >= 1000 && vector[i] <= 9999) {
                contador4++;
            }
               if (vector[i] >= 10000 && vector[i] <= 99999) {
                contador5++;
            }
        }
        System.out.println("Hay " + contador + " numeros de 1 digito");
        System.out.println("Hay " + contador2 + " numeros de 2 digitos");
        System.out.println("Hay " + contador3 + " numeros de 3 digitos");
        System.out.println("Hay " + contador4 + " numeros de 4 digitos");
        System.out.println("Hay " + contador5 + " numeros de 5 digitos");
    }

}
