/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 
 */
package Ejercicios3_BuclesYSentencias;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numeros,contador,longitud;
        contador=0;
        do{
            numeros=leer.nextInt();
            contador++;
            if (numeros<=20 && numeros>=1) {
                System.out.print(numeros+" ");
                 for (int i = 0; i < numeros; i++) {
                     System.out.print("*");
                     
                 }
                 
                } else{
                System.out.print(" Error ");
            }
            System.out.println(" ");
            
    }while(contador!=4);
        }
}
    

   
    
     
    

