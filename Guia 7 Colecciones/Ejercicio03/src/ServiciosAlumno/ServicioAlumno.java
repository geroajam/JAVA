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
package ServiciosAlumno;

import Alumno.entidades.Alumno;
import java.util.Iterator;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioAlumno {

    
    
    public void notaFinal(Alumno al){
        String nombre=al.getNombre();
        int contador=0;
        Iterator<Integer> it=al.getNotas().iterator();
        while(it.hasNext())
            for (int i = 0; i < al.getNotas().size(); i++) {
                contador+=it.next();
            }
        int contadorfinal=contador/3;
        System.out.println("El promedio final de "+nombre+" es: "+contadorfinal);
    }
    
}
    
   