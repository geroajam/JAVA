/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package Ejercicios3_BuclesYSentencias;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros, suma, j, contador;
        suma = 0;
        j = 1;
        contador = 0;
        System.out.println("Ingrese 20 números");
        do {
            numeros = leer.nextInt();
            contador++;
            if (numeros > 0) {
                suma = suma + numeros;
            }

        } while (numeros != 0 && contador != 20);
        if (numeros == 0) {
            System.out.println("Se capturó el numero cero");
        }
        if (contador == 20) {
            System.out.println("La suma de los numeros es igual a: " + suma);
        }
    }
}
