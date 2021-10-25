/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
LETRA   PRECIO                       PESO            PRECIO
A       $1000                     Entre 1 y 19 kg     $100
B       $800                      Entre 20 y 49 kg    $500
C       $600                      Entre 50 y 79 kg    $800
D       $500                      Mayor que 80 kg     $1000
E       $300
F       $100
  
 */
package ejercicio02.entidades;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Electrodomestico {
    
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private char comprobarConsumoEnergetico(char consumoEnergetico) {
        switch (consumoEnergetico) {
            case 'A':
                this.consumoEnergetico = 'A';
                break;
            case 'B':
                this.consumoEnergetico = 'B';
                break;
            case 'C':
                this.consumoEnergetico = 'C';
                break;
            case 'D':
                this.consumoEnergetico = 'D';
                break;
            case 'E':
                this.consumoEnergetico = 'E';
                break;
            case 'F':
                this.consumoEnergetico = 'F';
                break;
            default:
                this.consumoEnergetico = 'F';
        }
        return this.consumoEnergetico;
    }
    
    private String comprobarColor(String color){
        switch (color){
            case "BLANCO":
                this.color="BLANCO";
                break;
            case "NEGRO":
                this.color="NEGRO";
                break;
            case "AZUL":
                this.color="AZUL";
                break;
            case "ROJO":
                this.color="ROJO";
                break;
            case "GRIS":
                this.color="GRIS";
                break;
            default:
                this.color="BLANCO";
                break;  
        }
        return this.color;
    }
    
    public double precioFinal(char consumoEnergetico ,double peso){
        switch (consumoEnergetico){
            case 'A':
                this.precio =this.precio + 1000;
                break;
            case 'B':
                this.precio =this.precio + 800;
                break;
            case 'C':
                this.precio =this.precio + 600;
                break;
            case 'D':
                this.precio =this.precio + 500;
                break;
            case 'E':
                this.precio =this.precio + 300;
                break;
            case 'F':
                this.precio =this.precio + 100;
                break;
            default:
                this.precio =this.precio + 100;
        }
        if (peso>=1 && peso<=19) {
                this.precio=this.precio +100;
            }
        if (peso>=20 && peso<=49) {
                this.precio=this.precio +500;
            }
        if (peso>=50 && peso<=79) {
                this.precio=this.precio +800;
            }
        if (peso>80) {
                this.precio=this.precio +1000;
            }
        
        
        return this.precio;
    }
            
            
    public void crearElectrodomestico(){
        System.out.println("Ingrese el color del electrodoméstico");
        String color= leer.next().toUpperCase();
        System.out.println("Ingrese la clasificación del consumo del electrodoméstico");
        char consumoEnergetico=leer.next().toUpperCase().charAt(0);
        System.out.println("Ingrese el peso del electrodoméstico");
        double peso=leer.nextDouble();
        precio=1000;
        this.precio=precioFinal(consumoEnergetico, peso);
        this.color=comprobarColor(color);
        this.consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
        this.peso=peso;
    }
  
    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

   

    
    
}
