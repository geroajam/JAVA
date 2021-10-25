/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el 
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de arreglo fuera de rango)
 */
package ejercicio02;

import java.util.Arrays;


/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array=new int[5];
        try {
            for (int i = 0; i < 8; i++) {
            (array[i])=i;
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("índice de arreglo fuera de rango "+e.toString());
        }
        
    }
}
 
            
        

   
    

