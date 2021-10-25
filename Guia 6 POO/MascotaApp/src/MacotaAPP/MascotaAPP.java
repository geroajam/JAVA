/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MacotaAPP;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

/**
 *
 * @author Geronimo Tapia
 */
public class MascotaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        Mascota m1= new Mascota("Fernando Chiquito", leer.next(), "Perro");
        
        m1.setNombre("Pepe Chiquito");
        
        m1.pasear(100);
        
        System.out.println(m1.toString());
        
    }
    
}
