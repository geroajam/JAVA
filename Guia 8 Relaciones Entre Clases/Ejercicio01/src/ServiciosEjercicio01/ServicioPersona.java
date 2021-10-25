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
import Ejercicio01.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioPersona {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Persona> listaPersonas = new ArrayList();

    public void CrearPersona() {
        for (int i = 0; i < 2; i++) {    
       
        Persona p1=new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        String nombre=leer.next().toUpperCase();
        System.out.println("Ingrese el apellido de la persona");
        String apellido=leer.next().toUpperCase();
        System.out.println("Ingrese la edad de la persona");
        int edad=leer.nextInt();
        System.out.println("Ingrese el documento de la persona");
        int dni=leer.nextInt();
        
        p1.setNombre(nombre);
        p1.setApellido(apellido);
        p1.setEdad(edad);
        p1.setDni(dni);
        listaPersonas.add(p1);
        
        } 
    }
  
    
    public void mostrarPersonas(){
        System.out.println("╬╬╬╬PERSONAS CARGADAS╬╬╬╬"); 
        for (Persona aux : listaPersonas) {
            System.out.println(aux);
        }
        
    }
    
     public void asignarlePerroaLista(ServicioPerro sperro, String varElegido) {
        System.out.println("Ingrese el apellido de la persona que va a asignar un perro");
        String apellidoI = leer.next().toUpperCase(); // Carga a quien quiere modificar

        //Recorro mi lista de personas para ver si existe
         for (Persona personaUnitario : listaPersonas) {
            //Condicion para encontrar a la persona por Apellido
            if (personaUnitario.getApellido().equals(apellidoI)) {
                //Si la encuentro..... recorro los perros en adopcion 
                for (Perro unitarioPerro : sperro.getListaPerros()) {
                    if (unitarioPerro.getNombre().equals(varElegido)) { // Esta condicion la hago para ver solo LOS PERROS SIN dueño
                        //Si el perro existe,  lo cargo en el atributo de la persona   
                        personaUnitario.getListaPerros().add(unitarioPerro);
                        unitarioPerro.setTienePropietario(true); //set EL ATRIBUTO del dpto para que no este mas disponible
                    }
                }
            }
        }
    }
    
   
    
}
