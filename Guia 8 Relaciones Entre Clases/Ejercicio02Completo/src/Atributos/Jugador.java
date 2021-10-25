/*
- Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). 
*/
package Atributos;

public class Jugador {

    private Integer id;
    private String nombre;
    private Boolean mojado;
    

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, Boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID: " + id + ", Nombre: " + nombre + ", ¿Mojado? " + mojado + '}';
    }
    
//    @Override
//    public int compareTo(Jugador t) {
//        return this.id.compareTo(t.getId());
//    }
    
    
    
    
}
