/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt().
 */
package EJercicios;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num= leer.nextInt();
        double resultado=Math.sqrt(num);
        System.out.println("El doble de "+num+" es: "+(num*2));
        System.out.println("El triple de "+num+" es: "+(num*3));
        System.out.println("La raíz cuadrada de "+num+" es: "+resultado);


    }
    
}
