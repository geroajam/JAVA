/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class BuclesYSentencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer=new Scanner(System.in);
        
        do{
            System.out.println("Ingrese un número entero postivo");
            num =leer.nextInt();
            if (num>1000){
                System.out.println("Este programa podría tardar, ¿estás seguro? (s/n)");
                String confirma=leer.next();
                if (confirma.equals("s")){
                    break;                      //break: detiene el bucle y continua con el pr{oximo bloque
                }
            }
        } while(num<=0 || num>1000);
        /*
        for (<inicialización>; <expresión_terminación; <paso/incremento/decremento>) {
            <sentencia>
        }
        */
        int j,suma;
        for(int i=1; i<=num ; i++){
            
        
            if(i%2 !=0 )
                continue;                       //continue: detiene la iteración actual y salta a a la siguiente
            
            suma = 0;
            j=1;
            while(j<=i){
                suma += j;
                j++;
            }
            System.out.println("La suma de los "+ i +" números naturales es: "+suma);
        }
    }
}
    
    
    
        
    

