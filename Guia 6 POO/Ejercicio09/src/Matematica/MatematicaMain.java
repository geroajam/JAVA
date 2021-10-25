/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creara el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Matematica;

import Matematica.entidades.Matematica;
import ServicioMatematica.ServicioMatematica;

/**
 *
 * @author Geronimo Tapia
 */
public class MatematicaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioMatematica sm=new ServicioMatematica();
        Matematica m=sm.CrearNumero();
        System.out.println("El número mayor es: "+sm.devolverMayor(m));
        System.out.println("La potencia del número mayor es: "+sm.calcularPotencia(m));
        System.out.println("La raiz cuadra del número menor es: "+sm.calculaRaiz(m));
    }
    
}
