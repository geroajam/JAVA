/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores
 */
package Persona;

import Persona.entidades.Persona;
import ServiciosPersona.ServicioPersona;


/**
 *
 * @author Geronimo Tapia
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPersona sp=new ServicioPersona();
        
       
         Persona[] listaPersonas= sp.crearPersonas(4);
         sp.porcentajePeso(listaPersonas);
         sp.porcentajeEdad(listaPersonas);
    }
    
}
