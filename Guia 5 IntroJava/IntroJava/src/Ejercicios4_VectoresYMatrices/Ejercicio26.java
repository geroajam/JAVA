/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus 
filas por columnas (o viceversa).
 */
package Ejercicios4_VectoresYMatrices;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matriz;
        matriz = new int[3][3];
        boolean antisimetrica = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();

            }
        }
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + -(matriz[j][i]) + "] ");
                if (matriz[i][j] != -(matriz[j][i])) {
                    antisimetrica = true;
                }
            }
            System.out.println("");

        }

        if (antisimetrica == true) {
            System.out.println("La matriz NO es anti simétrica");
        }
        else{
            System.out.println("La matriz es anti simétrica");
        }

    }

}
/* 0
2
-4
-2
0
-2
4
2
0
 */
