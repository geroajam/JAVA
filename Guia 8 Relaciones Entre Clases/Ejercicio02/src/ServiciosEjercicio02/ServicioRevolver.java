/*
 Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package ServiciosEjercicio02;

import ejercicio02.entidades.Revolver;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioRevolver {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Random aux1 = new Random();
    Random aux2 = new Random();
    public Revolver llenarRevolver(){
        Revolver r=new Revolver();
        
        int posicionActual= (int) Math.floor(Math.random()*6+1);  
        int posicionAgua= (int) Math.floor(Math.random()*6+1);  
        r.setPosicionActual(posicionActual);
        r.setPosicionAgua(posicionAgua);
        System.out.println(r.toString());
        System.out.println(">----------------------<");
        return r;
   }
    
    public boolean mojar(Revolver r){
        boolean resp=false;
        if (r.getPosicionActual()==r.getPosicionAgua()){
            resp=true;
        }
        return resp;
    }
    
    public void siguienteChorro(Revolver r){
        r.setPosicionActual(r.getPosicionActual()+1);
    } 
    
    public void tostring(Revolver r){
        System.out.println("Revolver de Agua--->Posición actual: "+ r.getPosicionActual() 
        + " - Posición Agua: " +r.getPosicionAgua() +'<');  
    }
}
