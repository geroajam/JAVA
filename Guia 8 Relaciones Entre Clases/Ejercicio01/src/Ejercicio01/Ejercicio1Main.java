/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona
 */
package Ejercicio01;

import ServiciosEjercicio01.ServicioPerro;
import ServiciosEjercicio01.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPersona sp=new ServicioPersona();
        ServicioPerro sperro=new ServicioPerro();
        
        sp.CrearPersona();
        sperro.CrearPerro();
        sp.mostrarPersonas();
        
        for (int i = 0; i < 2; i++) { // Asigno 2 perros A dueños... 
            sperro.mostrarPerrosenAdopcion();
            System.out.println("Elegí el perro a adoptar - nombre");
            String varElegido = leer.next().toUpperCase();
            sp.asignarlePerroaLista(sperro, varElegido);
        }
        sp.mostrarPersonas();
    }
    
}
