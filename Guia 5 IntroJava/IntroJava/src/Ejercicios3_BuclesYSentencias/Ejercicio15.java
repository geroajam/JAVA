/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
 */
package Ejercicios3_BuclesYSentencias;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio15 {

    private static boolean salir;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;

        System.out.println("Ingrese dos números enteros positivos");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("****Menu****");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        do {
            System.out.println("Elija opción:");
            opcion = leer.nextInt();
            if (opcion >= 1 || opcion <= 5) {
                switch (opcion) {
                    case 1:
                        System.out.println("La suma es igual a: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("La resta es igual a: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("La multiplicación es igual a: " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("La división es igual a: " + (num1 / num2));
                        break;
                    case 5:
                        System.out.println("Este programa podría tardar, ¿estás seguro? (s/n)");
                        String confirma = leer.next();
                        if (confirma.equals("s")) {
                            salir = true;
                            break;
                        }
                        if (confirma.equals("n")) {
                            salir = false;
                            break;

                        }

                }

            }

        } while (salir != true);

    }
}
