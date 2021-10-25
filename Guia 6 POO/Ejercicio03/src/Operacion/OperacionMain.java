/*
Crear una clase llamada Operacion que tenga como atributos privados el numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main
 */
package Operacion;

import Operacion.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class OperacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Operacion O1=new Operacion();
        System.out.println("Ingrese dos números");
        int numero1=leer.nextInt();
        int numero2=leer.nextInt();
        System.out.println("La suma es igual a :"+O1.sumar(numero1, numero2));
        System.out.println("La resta es igual a :"+O1.restar(numero1, numero2));
        System.out.println("La multiplicacion es igual a: "+O1.multiplicar(numero1, numero2));
        System.out.println("La división es igual a: "+O1.dividir(numero1, numero2));
        
    }
    
}
