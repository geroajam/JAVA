/*
Persona con atributos: nombre, apellido, edad, documento y Perro.
*/
package Atributos;

public class Persona implements Comparable<Persona>{

    private String nombre;
    private String apellido;
    private Integer edad;
    private Long dni;
    private Perro dog;
    
    
    //CONSTRUCTORES
    public Persona() {
    }
    public Persona(String nombre, String apellido, Integer edad, Long dni, Perro dog) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.dog = dog;
    }
    
    
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setDog(Perro dog) {
        this.dog = dog;
    }

    
    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Long getDni() {
        return dni;
    }

    public Perro getDog() {
        return dog;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", apellido :" + apellido + ", edad :" + edad + ", dni :" + dni + ", dog :" + dog + '}';
    }

    @Override
    public int compareTo(Persona t) {
         return this.nombre.compareToIgnoreCase(t.getNombre());
    }
    
    
    
}

