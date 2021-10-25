/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package ejercicio10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numeros;
        double menor;
        Double[] arregloA = new Double[50];

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (Math.random() * 30);
        }
        
        System.out.println("*ARREGLO A*");
        
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println(arregloA[i]);
        }
        
        System.out.println(" ");
        System.out.println("*ARREGLO A ordenado de menor a mayor*");
        System.out.println("");

        Arrays.sort(arregloA);
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println(arregloA[i]);
        }

        Double[] arregloB = new Double[20];
        arregloB = Arrays.copyOf(arregloA, 20);
        
        System.out.println("ARREGLO B");
        for (int i = 0; i < 10; i++) {
            
            System.out.println(arregloB[i]);
        }
        for (int i = 10; i < arregloB.length; i++) {
            arregloB[i]=0.5;
            System.out.println(arregloB[i]);
        }

    }

}
