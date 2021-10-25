/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Circuferencia.entidades;

/**
 *
 * @author Geronimo Tapia
 */
public class Circuferencia {
    
    private double Radio;
   
  
    public Circuferencia(){
        
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    public double area(double Radio){
        return Radio*3.14;
        
    }
    
    public double perimetro(double Radio){
        return 2*3.14*Radio;
    }


}
    


