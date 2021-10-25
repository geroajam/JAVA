/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no. 
Despues de ese bluce tendremos el siguiente método en la clase Alumno: 
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.
 */
package Alumno;

import Alumno.entidades.Alumno;
import ServiciosAlumno.ServicioAlumno;
import java.util.ArrayList;
import java.util.Scanner;




/**
 *
 * @author Geronimo Tapia
 */
public class AlumnoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Alumno> listaAlumnos = new ArrayList(); 
    ArrayList<Integer> notas=new ArrayList();
    
    ServicioAlumno sa=new ServicioAlumno();
    
        String respuesta = "";
        do {
            Alumno al = new Alumno();

            System.out.println("Ingrese el nombre del alumno/a");
            String nombre = leer.next();
            al.setNombre(nombre);

            System.out.println("Ingrese las notas del alumno");
            for (int i = 0; i < 3; i++) {
                int nota=leer.nextInt();
                al.getNotas().add(nota);
            }
            listaAlumnos.add(al);
            
            
            System.out.println("¿Quiere ingresar otro alumno?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("Si"));

        System.out.println("Los alumnos ingresados son:");

        for (Object listaAlumno : listaAlumnos) {
            System.out.println(listaAlumno);
        }
        System.out.println("Ingrese el nombre del alumno para promediar la nota");
        String buscador=leer.next();
        for (Alumno aux : listaAlumnos) {
            if (aux.getNombre().equals(buscador)) {
                sa.notaFinal(aux);
                
            } else System.out.println("No se encontró el alumno");
        }
       
    }
         
         
    }
    

