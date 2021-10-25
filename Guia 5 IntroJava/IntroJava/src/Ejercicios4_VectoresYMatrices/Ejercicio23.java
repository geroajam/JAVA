/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido

 */
package Ejercicios4_VectoresYMatrices;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer=new Scanner(System.in);
        int[] vector;
        int n,numbus,contador;
        contador=0;
        
        System.out.println("Ingrese el tamaño del vector");
        n=leer.nextInt();
        System.out.println("");
        
        vector=new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]=((int) (Math.random() * 100));
            System.out.println(vector[i]);
            
            }
        System.out.println("Ingrese el número a buscar");
        numbus=leer.nextInt();
        for (int i = 0; i < n; i++) {
        if(numbus==vector[i]){
            contador++;
                System.out.println("El número se encontró en la posición: "+(i));
        }
        
        }
        if (contador>1){
            System.out.println("El número se encuentra repetido");
            
        }
        if (contador==1) {
            System.out.println("El número no se encuentra repetido");
            
}
    }
}
    

   