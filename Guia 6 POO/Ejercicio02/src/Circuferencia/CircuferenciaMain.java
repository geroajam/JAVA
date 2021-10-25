/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Circuferencia;

import Circuferencia.entidades.Circuferencia;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class CircuferenciaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Circuferencia C1=new Circuferencia();
        System.out.println("Ingrese el radio");
        double Radio=leer.nextDouble();
        System.out.println("El area es igual a : "+C1.area(Radio));
        System.out.println("El perimetro es igual a :"+C1.perimetro(Radio));
        
        
        
        
        
    }
    
}
