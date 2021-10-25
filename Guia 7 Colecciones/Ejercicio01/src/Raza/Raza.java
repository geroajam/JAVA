/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.

 */
package Raza;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Geronimo Tapia
 */
public class Raza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> listaRaza = new ArrayList(); // Creamos una lista de Strings
        
        String palabra;
        String respuesta = "";
        
           do {
            System.out.println("Ingrese una raza de perro");
            palabra = leer.next();

            listaRaza.add(palabra);

            System.out.println("Quiere ingresar otra raza?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("Si"));
           System.out.println("Las razas ingresadas son:");
           
           for (String cadena : listaRaza) {

            System.out.println(cadena);
        }
           
    }
    
    
}
