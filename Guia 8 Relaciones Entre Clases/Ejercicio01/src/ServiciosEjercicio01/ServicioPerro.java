/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona
 */
package ServiciosEjercicio01;

import Ejercicio01.entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioPerro {

    private Scanner leer = new Scanner(System.in);
    private ArrayList<Perro> listaPerros = new ArrayList();

    
    public void CrearPerro(){
        for (int i = 0; i < 2; i++) {
            
        Perro p1=new Perro();
        
        System.out.println("Ingrese el nombre del perro");
        String nombre=leer.next().toUpperCase();
        System.out.println("Ingrese la raza del perro");
        String raza=leer.next().toUpperCase();
        System.out.println("Ingrese la edad del perro");
        int edad=leer.nextInt();
        System.out.println("Ingrese el tamaño del perro");
        double tamaño=leer.nextDouble();
        
        p1.setNombre(nombre);
        p1.setRaza(raza);
        p1.setEdad(edad);
        p1.setTamaño(tamaño);
        
        listaPerros.add(p1);
        }
    }
    
    public void mostrarPerros(){
        for (Perro aux : listaPerros) {
            System.out.println(aux);
        }
    }
    public void mostrarPerrosenAdopcion(){
        System.out.println("**************PERROS EN ADOPCIÓN*****************");
        for (Perro aux : listaPerros) {
            if (!aux.isTienePropietario()) {
                System.out.println(aux);
            }
        }
    }
    
    public Scanner getLeer() {
        return leer;
    }

    public ArrayList<Perro> getListaPerros() {
        return listaPerros;
    }
    
    
}
