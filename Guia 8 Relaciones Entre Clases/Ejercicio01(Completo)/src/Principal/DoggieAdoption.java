/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package Principal;

import Atributos.Perro;
import Atributos.Persona;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DoggieAdoption {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //Creo dos listados tipo Tree para cargar y ordenar los datos ingresados
        Set<Perro> listaDog = new TreeSet();
        Set<Persona> listaPer = new TreeSet();
        
        Character opc;
        int i = 1;
        int opcion;
        
        do {            
            System.out.println("----------Inicio de AdoptAdog----------\\\n"+
                            "Elija la opción que desee:\n"
                            + "1-Cargar Perro.-\n"
                            + "2-Cargar Persona.-\n"
                            + "3-Mostrar Listado Perro.-\n"
                            + "4-Mostrar Listado Personas.-\n"
                            + "5-Mostrar Listado Adopción.-\n"
                            + "6-Fin Programa.-\n"
                            + "/---------------*******---------------\\");
            opcion = leer.nextInt();
            
            switch(opcion){
                //+ "1-Cargar Perro.-\n"
                case 1:
                    do {
                        Perro newDog = new Perro();
                        
                        System.out.println("------Carga de datos de los Perros------");
                        System.out.print("-Nombre del perro "+i+": ");
                        String nombre = leer.next();
                        System.out.print("-Raza "+i+": ");
                        String raza = leer.next();
                        System.out.print("-Edad "+i+": ");
                        Integer edad = leer.nextInt();
                        System.out.print("-Tamaño [S/M/L] "+i+": ");
                        String tamanio = leer.next().substring(0).toUpperCase();
                        i++;

                        //Cargo el nuevo objeto Perro a la lista Set
                        listaDog.add(new Perro(nombre, raza, edad, tamanio));
                        
                        System.out.println("¿Desea cargar otro perro? [S/N]");
                        opc = leer.next().charAt(0);

                    }while(opc == 's');
                    break;
                    
                    
                //"2-Cargar Persona.
                case 2:    
                    do {
                        Persona newPers = new Persona();
                        
                        System.out.println("----------Carga de AdoptAdoggers----------");
                        System.out.print("-Nombre: ");
                        String nombre = leer.next();
                        System.out.print("-Apellido: ");
                        String apellido = leer.next();
                        System.out.print("-Edad: ");
                        Integer edad = leer.nextInt();
                        System.out.print("-DNI: ");
                        Long dni = leer.nextLong();
                        
                        //Asigno al objeto Persona, los datos de la persona, relevados hasta ahora
                        //(en el próximo paso, cargo el Perro elegido)
                        newPers.setNombre(nombre);
                        newPers.setApellido(apellido);
                        newPers.setEdad(edad);
                        newPers.setDni(dni);
                        
                        //Ahora muestro los objetos Perro disponibles para que lo seleccione
                        System.out.println("Nombre del Perro que desea asignarle a la Persona:");
                        
                        //Recorro el Set de objetos para mostrarlos y que elija de allí
                        for (Perro dog : listaDog) {
                            System.out.println(dog.toString());
                        }
                        
                        //Ingreso del perro elejido
                        System.out.print("Su elección: ");
                        String elejiDog = leer.next();
                        
                        //Recorro el Set, comparo y agrego el objeto Perro a la persona
                        boolean nop = false;
                        do{
                            for (Perro dog1 : listaDog) {
                                if (elejiDog.equalsIgnoreCase(dog1.getNombre())) {
                                        newPers.setDog(dog1);
                                        
                                        break;
                                } 
                                i++;
                            }
                            if(i == listaDog.size()) {
                                    System.out.println("No estaba en la lista, elija nuevamente");
                                    nop = true;
                                }
                        } while(nop == true);
                        
                        Perro dog = newPers.getDog();
                        listaPer.add(new Persona(nombre, apellido, edad, dni, dog));
                        
                        System.out.println("¿Desea cargar otra persona? [S/N]");
                        opc = leer.next().charAt(0);
                    }while(opc == 's');
                    break;
                    
                //3-Mostrar Listado Perro.
                case 3:
                    for (Perro dog2 : listaDog) {
                        System.out.println(dog2.toString());
                    }
                    break;
                    
                 //4-Mostrar Listado Persona.
                case 4:
                    for (Persona persona3 : listaPer) {
                        System.out.println(persona3.toString());
                    }
                    break;
                    
                //5-Mostrar Listado Adopción
                case 5:
                    for (Persona persona4 : listaPer) {
                        System.out.println("AdoptAdogger: "+persona4.getNombre()+"adoptó a "+persona4.getDog().getNombre());
                    }
                    break;
                //6 - Ce'finí
                case 6:
                    break;
            }
            
        }while(opcion != 6 );
    
    }     
}
