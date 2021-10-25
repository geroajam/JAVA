/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package Date;

import java.util.Date;
import java.util.Scanner;




/**
 *
 * @author Geronimo Tapia
 */
public class DateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int anio;
        int mes;
        int dia;
        
        System.out.println("Ingrese la fecha(año,mes,dia)");
        anio=leer.nextInt();
        mes=leer.nextInt();
        dia=leer.nextInt();
        
        Date fecha=new Date(anio-1900,mes-1,dia);
        Date fechaActual = new Date();
         
         System.out.println(fecha);
         int diferencia=fechaActual.getYear()-fecha.getYear();
         System.out.println("La diferencia que hay entre esta fecha y la fecha actual es de "+diferencia+" años");
         
    }
    
    
}
