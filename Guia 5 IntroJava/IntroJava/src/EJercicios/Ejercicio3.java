/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla.
 */
package EJercicios;

import java.util.Scanner;

/**
 *
 * @author mi pc
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre=leer.next();
        System.out.println("Hola Mundo! Soy "+nombre+" y estoy programando en Java!");
        
    }
    
}
