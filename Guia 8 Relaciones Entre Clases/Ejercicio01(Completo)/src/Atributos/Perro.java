/*
Perro, que tendrá como atributos: nombre, raza, edad y tamanio;
*/
package Atributos;


public class Perro implements Comparable<Perro>{

    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;
    
    //CONSTRUCTORES
    public Perro() {
    }
    public Perro(String nombre, String raza, Integer edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    
    
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    
    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre: " + nombre + ", raza: " + raza + ", edad: " + edad + ", tamaño: " + tamanio + '}';
    }

   
//    //public static Comparator<Perro> compararEdad = new Comparator<Perro>() {
//    public int compare(Perro p1, Perro p2) {
//        return p2.getNombre().compareTo(p1.getNombre());
//    }

    @Override
    public int compareTo(Perro t) {
        //Orden Alfabético o natural
        return this.nombre.compareTo(t.getNombre());
    }

       
    
}
            
