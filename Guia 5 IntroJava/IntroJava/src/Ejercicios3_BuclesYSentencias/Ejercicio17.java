/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals()
 */
package Ejercicios3_BuclesYSentencias;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadena,subcadenainicial,subcadenafinal;
        int longitud,contadordecorrectos,contadordeincorrectos;
        contadordecorrectos=0;
        contadordeincorrectos=0;
        do{
            cadena = leer.next();
            subcadenainicial=cadena.substring(0,1);
            subcadenafinal=cadena.substring(cadena.length()-1);
            longitud=cadena.length();
            if (longitud<=5 && subcadenainicial.equals("x")&& subcadenafinal.equals("o") ){
                contadordecorrectos ++;
            }
            else
                contadordeincorrectos ++;
        }while(cadena.equals("&&&&&")==false);
        System.out.println("Lecturas correctas recibidas: "+contadordecorrectos);
        System.out.println("Lecturas incorrectas recibidas: "+(contadordeincorrectos -1));
    }
    
}
