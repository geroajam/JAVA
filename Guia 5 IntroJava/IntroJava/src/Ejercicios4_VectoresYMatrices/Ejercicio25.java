/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre traspuesta
 */
package Ejercicios4_VectoresYMatrices;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        
        int [][] matriz;
        matriz =new int[4][4];
        for (int i=0; i<4; i++){
            for (int j=0;j<4;j++){
                matriz[i][j]=((int) (Math.random() * 100));
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
       for (int i=0; i<4; i++){
            for (int j=0;j<4;j++){
                System.out.print(" ["+matriz[j][i]+"] ");
            } 
            System.out.println(" ");
       }
    }
    
}
