/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.

 */
package ejercicio02.entidades;

import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class Televisor extends Electrodomestico {
    
    private Integer resolucion;
    private boolean sintonizadorTDT;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucón del televisor (pulgadas)");
        this.resolucion=leer.nextInt();
        System.out.println("Indique si el televisor posee sintonizador TDT");
        String resp=leer.next();
        if (resp.equalsIgnoreCase("Si")){
            this.sintonizadorTDT=true;
        }else{
            this.sintonizadorTDT=false;
        }
        
    }
    
    public void precioFinal(){
        double precio=super.getPrecio();
        
        if (sintonizadorTDT &&(this.resolucion<40)){
           super.setPrecio(precio+500);
        }
        if (this.resolucion>40 && sintonizadorTDT){
        super.setPrecio((precio+500)*1.3); 
        } else if (this.resolucion>40){
        super.setPrecio(precio*1.3); 
        }
//        if (this.resolucion>40&& (this.sintonizadorTDT=false)){
//            super.setPrecio(precio+((precio*30)/100)); 
//        }
            
        System.out.println("El precio del televisor será de: $"+getPrecio());
    }

    public Televisor() {
        super();
    }

    public Televisor(Integer resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Integer resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    
    
    
    
    
}
