/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ejercicio04;

import ejercicio04.entidades.CalcularFormas;
import ejercicio04.entidades.Circulo;
import ejercicio04.entidades.Rectangulo;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio04Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CalcularFormas Circulo=new Circulo(5, 2);
        System.out.println("El área del círculo es igual a: "+Circulo.calcularArea());
        System.out.println("El perímetro del círculo es igual a: "+Circulo.calcularPerimetro());
        
        CalcularFormas Rectangulo=new Rectangulo(4.6, 5);
        System.out.println("El área del rectangulo es igual a: "+Rectangulo.calcularArea());
        System.out.println("El perímetro del círculo es igual a: "+Rectangulo.calcularPerimetro());
    }
    
}
