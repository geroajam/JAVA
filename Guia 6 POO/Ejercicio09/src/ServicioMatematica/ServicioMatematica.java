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
package ServicioMatematica;

import Matematica.entidades.Matematica;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioMatematica {

    public Matematica CrearNumero() {
        double num = Math.random()*10;
        System.out.println("Número 1: " + num);
        double num2 = Math.random()*10;
        System.out.println("Número 2: " + num2);

        return new Matematica(num, num2);
    }

    public double devolverMayor(Matematica m) {
        double num = m.getNum();
        double num2 = m.getNum2();

        if (num > num2) {
            return num;
        }else
            return num2;
        }
    
    public double calcularPotencia(Matematica m){
        double num = m.getNum();
        double num2 = m.getNum2();
        num=Math.round(num);
        num2=Math.round(num2);
        
        if (num > num2) {
            return Math.pow(num, num2);
        }else
            return Math.pow(num2, num);
        }
    
    public double calculaRaiz(Matematica m){
        double num = m.getNum();
        double num2 = m.getNum2();
        
        if (num < num2) {
            num=Math.abs(num);
            return Math.sqrt(num);
        }else if (num > num2)
            num2=Math.abs(num2);
            return Math.sqrt(num2);
        }
    
    }
    

    


