/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente
 */
package ejercicio01;

import ejercicio01.entidades.Animal;
import ejercicio01.entidades.Caballo;
import ejercicio01.entidades.Gato;
import ejercicio01.entidades.Perro;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio01Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal Perro= new Perro("Stich", "Carnívoro", 15, "Doberman");
        Perro.Alimentarse();
        
        Perro perro1= new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();
        
        Animal Gato= new Gato("Pelusa", "Galletas", 15, "Siames");
        Gato.Alimentarse();
        
        Animal Caballo=new Caballo("Spark", "Pasto", 25, "Fino");
        Caballo.Alimentarse();
        
    }
    
}
