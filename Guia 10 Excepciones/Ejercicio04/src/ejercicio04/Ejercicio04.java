/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La 
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene 
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la 
computadora debe decirle al usuario si el número que tiene que adivinar es mayor 
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe 
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado 
adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se 
debe contar el carácter fallido como un intento
 */
package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int random = (int) Math.floor(Math.random() * 500);
        System.out.println("Adivina un número del 1 al 500");
        int num = 0;
        int contador = 0;

        do {
            try {
                num = leer.nextInt();

                if (num < random) {
                    System.out.println("El número que ingreso es menor al que hay que adivinar");
                    contador++;
                }
                if (num > random) {
                    System.out.println("El número que ingreso es mayor al que hay que adivinar");
                    contador++;
                }
                if (num == random) {
                    System.out.println("FELICITACIONES USTED ADIVINÓ EL NÚMERO!");
                    contador++;
                }
            } catch (InputMismatchException e) {
                System.out.println("No ingresó un número. Reintente: " + e.toString());
                contador++;
                leer.next();

            }
        } while (num != random);

        System.out.println("Intentos: " + contador);
    }

}
