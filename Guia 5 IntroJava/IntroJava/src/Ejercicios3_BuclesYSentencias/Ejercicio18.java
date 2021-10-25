/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
 */
package Ejercicios3_BuclesYSentencias;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 0; i <= 999; i++) {
            int num;
            String numCadena;
            num = i + 1000;
            numCadena = String.valueOf(num);
            for (int j = 1; j <= 3; j++) {
                if (numCadena.substring(j, j + 1).equals("3")) {
                    System.out.print("E");
                } else {
                    System.out.print(numCadena.substring(j, j + 1));
                }
            }
            System.out.println("");
        }

    }

}
