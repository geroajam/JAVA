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
package Pelicula.utilidades;

import Pelicula.entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Geronimo Tapia
 */
public class Comparadores {
    
    public static Comparator<Pelicula>OrdenarPorDuracionMayorAMenor=new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return -Double.compare(t.getDuracion(),t1.getDuracion());
                    
                    
        }
    };
    
    public static Comparator<Pelicula>OrdenarPorDuracionMenorAMayor=new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return Double.compare(t.getDuracion(),t1.getDuracion());
                    
                    
        }
    };
    
    public static Comparator<Pelicula>OrdenarPorTituloAlfabeticamente=new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getTitulo().compareTo(t1.getTitulo());       
        }
    };
    
        public static Comparator<Pelicula>OrdenarPorDirectorAlfabeticamente=new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDirector().compareTo(t1.getDirector());       
        }
    };
    
    
}
 