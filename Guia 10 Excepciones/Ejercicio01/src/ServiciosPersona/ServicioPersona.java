/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

 */
package ServiciosPersona;

import Persona.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioPersona {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final int IMC_BAJO = -1;
    private final int IMC_IDEAL = 0;
    private final int IMC_ALTO = 1;

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo('H' hombre, 'M' mujer, 'O' otro)");
        char sexo = Character.toUpperCase(leer.next().charAt(0));
        System.out.println("Ingrese el peso (Kg");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura (M)");
        double altura = leer.nextDouble();

        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Ingrese un sexo válido");
            sexo = Character.toUpperCase(leer.next().charAt(0));
        }

        return new Persona(nombre, edad, sexo, altura, peso);
    }

    ///(peso/altura^2 en mt2))
    public int calcularIMC(Persona p) {
        double peso = p.getPeso();
        double altura = p.getAltura();
        double imc = peso / (Math.pow(altura, 2));

        if (imc < 20) {
            return IMC_BAJO;
        } else if (imc > 25) {
            return IMC_ALTO;
        } else {
            return IMC_IDEAL;
        }

    }

    public boolean esMayorDeEdad(Persona p) {
        return p.getEdad() >= 18;
    }

    public Persona[] crearPersonas(int cant) {
        Persona[] personas= new Persona[cant];
        
        for (int i = 0; i < personas.length; i++) {
            personas[i]= crearPersona();
        }
        return personas;

    }
    
    public void porcentajePeso(Persona[] personas){
        int contadorAlto=0;
        int contadorBajo=0;
        int contadorIdeal=0;
        int cantidadPersonas=personas.length;
        
        for (Persona persona : personas) {
            switch(calcularIMC(persona)){
                case -1:
                    System.out.println(persona.getNombre()+" está por debajo de su peso ideal");
                    contadorBajo++;
                    break;
                case 0:
                    System.out.println(persona.getNombre()+" está en su peso ideal");
                    contadorIdeal++;
                    break;
                case 1:
                    System.out.println(persona.getNombre()+" está por encima de su peso ideal");
                    contadorAlto++;
                    break;
            }
        }
        
        System.out.println("El "+((contadorBajo*100)/cantidadPersonas) +"% de las personas está por debajo de su peso ideal");
        System.out.println("El "+((contadorIdeal*100)/cantidadPersonas) +"% de las personas está en su peso ideal");
        System.out.println("El "+((contadorAlto*100)/cantidadPersonas)+"% de las personas está por encima de su peso ideal");
    }
    
    public void porcentajeEdad(Persona[]personas){
        int cantidadPersonas=personas.length;
        int contadorMayor=0;
        
        for (Persona persona : personas) {
            if(esMayorDeEdad(persona)){
                contadorMayor++;
                System.out.println(persona.getNombre()+" es mayor de edad");
                
            }
            
        }
        
         System.out.println("El "+((contadorMayor*100)/cantidadPersonas)+"% es mayor de edad");
         System.out.println("El "+(((cantidadPersonas-contadorMayor)*100)/cantidadPersonas)+"% de menor de edad");
    }

}
