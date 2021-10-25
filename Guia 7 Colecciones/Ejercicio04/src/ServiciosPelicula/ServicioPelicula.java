/*
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
Nota: recordar el uso del Comparator para ordenar colecciones con objetos
 */
package ServiciosPelicula;

import Pelicula.entidades.Pelicula;
import Pelicula.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String respuesta = "";

    ArrayList<Pelicula> listaPeliculas = new ArrayList();

    public void CrearPelicula() {
        do {
            Pelicula p1 = new Pelicula();
            System.out.println("Ingrese el titulo de la película");
            String titulo = leer.next().toUpperCase();
            p1.setTitulo(titulo);

            System.out.println("Ingrese el director de la película");
            String director = leer.next().toUpperCase();
            p1.setDirector(director);

            System.out.println("Ingrese la duración de la película en horas");
            double duracion = leer.nextDouble();
            p1.setDuracion(duracion);
            listaPeliculas.add(p1);
            
            System.out.println("¿Quiere ingresar otra película?");
            respuesta = leer.next();
            
            
        } while (respuesta.equalsIgnoreCase("Si"));
        
    }

   
    public void mostrarPelicula() {
        
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
    
    public void peliculasMayor1h(){
        System.out.println("");
        System.out.println("Las peliculas mayores a una hora son:");
        
        for (Pelicula aux : listaPeliculas) {
            if (aux.getDuracion()>1) {
                System.out.println(aux);
            }
            
        }
    }
    
    public void OrdenarPorDuracionMayorAMenor(){
        System.out.println("");
        System.out.println("Las peliculas ordenadas de mayor a menor por su duración:");
        Collections.sort(listaPeliculas, Comparadores.OrdenarPorDuracionMayorAMenor);
    }
    
    public void OrdenarPorDuracionMenorAMayor(){
        System.out.println("");
        System.out.println("Las peliculas ordenadas de menor a mayor por su duración:");
        Collections.sort(listaPeliculas, Comparadores.OrdenarPorDuracionMenorAMayor);
    }
    
    public void OrdenarPorTituloAlfabeticamente(){
        System.out.println("");
        System.out.println("Peliculas ordenas por título alfabéticamente:");
        Collections.sort(listaPeliculas, Comparadores.OrdenarPorTituloAlfabeticamente);
    }
    
    public void OrdenarPorDirectorAlfabeticamente(){
        System.out.println("");
        System.out.println("Peliculas ordenadas por director alfabéticamente:");
        Collections.sort(listaPeliculas, Comparadores.OrdenarPorDirectorAlfabeticamente);
    }
}
