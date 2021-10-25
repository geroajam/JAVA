/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Formulas: Superficie = base ∗ altura / Perímetro = (base + altura) ∗ 2
 */
package Rectangulo;

import Rectangulo.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class RectanguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Rectangulo R1=new Rectangulo();
        System.out.println("Ingrese la base del rectángulo");
        int Base=leer.nextInt();
        System.out.println("Ingrese la altura del rectángulo");
        int Altura=leer.nextInt();
        
        System.out.println("La superficie del rectángulo es igual a: "+R1.Superficie(Base, Altura));
        System.out.println("El perímetro del rectángulo es igual a: "+R1.Perimetro(Base, Altura));
        R1.Dibujo(Base, Altura);
        
    }
    
}
