/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación
 */
package Pelicula.entidades;

import java.util.ArrayList;

/**
 *
 * @author Geronimo Tapia
 */
public class Pelicula {
    
    private  ArrayList listaPeliculas;
    private String titulo;
    private String director;
    private double duracion;

    public Pelicula() {
        listaPeliculas=new ArrayList();
    }

    public Pelicula(ArrayList listaPeliculas, String titulo, String director, double duracion) {
        this.listaPeliculas = listaPeliculas;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public ArrayList getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + " Titulo=" + titulo + ", Director=" + director + ", Duracion=" + duracion +"hs"+ '}';
    }

    
}

