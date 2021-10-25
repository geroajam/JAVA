/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package EJercicios2_Condicionales;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        String subcadena;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase o palabra");
        frase = leer.next();
        subcadena = frase.substring(frase.length()-1);
        if (subcadena.equals("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
