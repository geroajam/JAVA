/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es: 
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 
 */
package Ejercicios3_BuclesYSentencias;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double euros;
        String moneda;
        System.out.println("Ingrese la cantidad de euros a convertir");
        euros = leer.nextDouble();
        System.out.println("Seleccione la moneda (libras, dolares o yenes)");
        moneda = leer.next();
        conversor(euros, moneda);

    }

    public static void conversor(double euros, String moneda) {

        double resultado = 0;
        boolean correcto = true;
        switch (moneda) {
            case "libras":
                resultado = euros * 0.86;
                break;
            case "dolares":
                resultado = euros * 1.28611;
                break;
            case "yenes":
                resultado = euros * 129.852;
                break;
            default:
                System.out.println("Ingrese una moneda válida");
                correcto = false;
        }
        if (correcto == true) {
            System.out.println(resultado + " " + moneda + " es " + euros + " €");
        }
    }

}
