
package Servicios;

import Atributos.Revolver;
import java.util.Random;
import java.util.Scanner;

public class ServiRevolver {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Defino los dos números rdm (globales, por si los uso en varios métodos)
    Random aux1 = new Random();
    Random aux2 = new Random();
    
    //• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
    //valores deben ser aleatorios.
    public Revolver llenarRevolver(){

        Integer rdmAct = 2; //aux1.nextInt(6)+1;
        Integer rdmAgua = 1; // aux2.nextInt(6)+1;
        //Integer rdmAct = 12;
        //Integer rdmAgua = 7;
        //Creo el objeto Revolver (sólo es necesario si uso el Objeto dentro de 
        //éste método, sino directamente lo instancio en el "return".
        //Para el caso, lo instancio antes para sacarlo en un sout, y verificar que los 
        //valores que arroja son los mismos que toma en el siguiente método
        Revolver nuevoR = new Revolver();
                
        //Cargo los valores rdm en el revolver
        nuevoR.setPosicionActual(rdmAct);
        nuevoR.setPosicionAgua(rdmAgua);
        
        System.out.println(nuevoR.toString());
        System.out.println(">----------------------<");
        //return new Revolver(rdmAct, rdmAgua);
        return nuevoR;
    }
//Usado   
    
//  • mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(Revolver revo1){
        boolean disparo = false;
        int auxAc = revo1.getPosicionActual();
        int auxAg = revo1.getPosicionAgua();
        
        if(auxAc == auxAg){
            disparo = true;
            
        }
        //Aquí imprimo para verificar que los datos rdm sean los mismos arrojados 
        //en el otro método (pero no es necesario, es sólo verificación):
        System.out.println("Posición actual: "+ revo1.getPosicionActual() 
        + " - Posición Agua: " + revo1.getPosicionAgua() );
        
        return disparo;
        
        //TODO LO ANTERIOR SE PODRÍA HABER REEMPLAZADO CON
        //return revo1.getPosicionActual()==revo1.getPosicionAgua();
        }  
//Usado    

//  • siguienteChorro(): cambia a la siguiente posición del tambor  
    public void siguienteChorro(Revolver revo2){
        Integer nextChorro;
        //El revolver gatilla y va a la siguiente posición, hasta llegar a 6 y 
        //vuelve a comenzar en 1
        if(revo2.getPosicionActual()==6){
            nextChorro = 1;
        }else{
            nextChorro = revo2.getPosicionActual()+1;
        }
        revo2.setPosicionActual(nextChorro);
        
    }
//Usado
    
//  • toString(): muestra información del revolver (posición actual y donde está el agua)
    public void toString(Revolver revo3){
        
        System.out.println("Revolver de Agua--->Posición actual: "+ revo3.getPosicionActual() 
        + " - Posición Agua: " + revo3.getPosicionAgua()+'<');  
    }
    
}
