/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package EJercicios;

import java.util.Scanner;

/**
 *
 * @author mi pc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tipo de datos = Definir
        System.out.println("Ingresa dos números enteros para calcular la suma");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("La suma es igual a: "+(num1+num2));
               
        
    }
    
}
