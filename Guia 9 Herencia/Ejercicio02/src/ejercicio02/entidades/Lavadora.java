/*
A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
 */
package ejercicio02.entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Lavadora extends Electrodomestico {
    private double carga;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de ropa en kg");
        this.carga=leer.nextDouble();
    }
    
    public void precioFinal(){
        double precio=super.getPrecio();
        if (this.carga>30){
        super.setPrecio(precio+500);
        }
        System.out.println("El precio de la lavadora sera de: $"+getPrecio());
    }
    
    public Lavadora() {
        super();
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    
    

    
    
    
    
    
}
