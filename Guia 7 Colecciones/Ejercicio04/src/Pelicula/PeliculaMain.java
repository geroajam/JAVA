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
package Pelicula;

import ServiciosPelicula.ServicioPelicula;

/**
 *
 * @author Geronimo Tapia
 */
public class PeliculaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioPelicula sp = new ServicioPelicula();
        sp.CrearPelicula();
        sp.mostrarPelicula();
        sp.peliculasMayor1h();
        
        sp.OrdenarPorDuracionMayorAMenor();
        sp.mostrarPelicula();
        
        sp.OrdenarPorDuracionMenorAMayor();
        sp.mostrarPelicula();
        
        sp.OrdenarPorTituloAlfabeticamente();
        sp.mostrarPelicula();
        
        sp.OrdenarPorDirectorAlfabeticamente();
        sp.mostrarPelicula();
    }
}
