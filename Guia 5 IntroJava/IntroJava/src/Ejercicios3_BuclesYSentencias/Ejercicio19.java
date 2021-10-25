/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *
 */
package Ejercicios3_BuclesYSentencias;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numCadena,numJ;
        for (int i=1; i<=4; i++){
            for(int j=1;j<4;j++){
                if (i==1 || i== 4 ){
               System.out.println("*");
        }
             if( i>1 && i==4 ){

                    if(j==1 || j== 4){

                  System.out.print("* ");

                  }else{

                        System.out.print(" ");
            }
        }
        
    }
            System.out.print("");
}
    }
}
    

