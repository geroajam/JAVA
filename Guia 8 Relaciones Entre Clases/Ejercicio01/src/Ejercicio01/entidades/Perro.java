/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona
 */
package Ejercicio01.entidades;

/**
 *
 * @author Geronimo Tapia
 */
public class Perro {
    
    private String nombre;
    private String raza;
    private int edad;
    private double tamaño;
    private boolean tienePropietario; // Este atributo, lo creo para validar de forma rapida si ya tiene dueño

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, double tamaño, boolean tienePropietario) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.tienePropietario = tienePropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isTienePropietario() {
        return tienePropietario;
    }

    public void setTienePropietario(boolean tienePropietario) {
        this.tienePropietario = tienePropietario;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamaño=" + tamaño + '}';
    }
    
    

    
    
    
}
