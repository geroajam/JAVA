/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package EJercicios;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingresa los grados centigrados");
        Scanner leer= new Scanner(System.in);
        Double num = leer.nextDouble();
        System.out.println("Su equivalente en grados Fahrenheit es igual a: "+(32+(9*num/5)) + " ºF");
        
        
        
    }
    
}
