/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. 
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.
 */
package ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio02 {

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
        System.out.println("Ingrese la raza a buscar");
        String razabus=leer.next();
        
        
         Iterator<String> it = listaRaza.iterator();

        while (it.hasNext()) {
             boolean verificador=true;   
             String aux=it.next();
             
            if (aux.equals(razabus)) { // Borramos si hay alguna palabra que sea igual a raza ingresada
                it.remove();
                verificador=false;
        }
            if (verificador=false) {
                System.out.println("El perro no se encontró en la lista");
                break;
                
            }
            if (verificador=true)
                System.out.println("El perro se encontró en la lista");
                break;
        }
        for (String cadena : listaRaza) {
            System.out.println("La lista actual quedó asi:");
            System.out.println(cadena);
        }
    }
}

    


