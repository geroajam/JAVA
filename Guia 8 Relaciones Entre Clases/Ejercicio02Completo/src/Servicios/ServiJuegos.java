/*
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
*/

package Servicios;

import Atributos.Juego;
import Atributos.Jugador;
import Atributos.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiJuegos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServiJugador nuevoServiJ = new ServiJugador();
    ServiRevolver nuevoServiR = new ServiRevolver();
    Juego juegoN = new Juego();
    List<Jugador> listaJugadores = new ArrayList();
    
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
//jugadores y el revolver para guardarlos en los atributos del juego.

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        juegoN.setJugadores(jugadores);
        juegoN.setRevolver(r);
         
    }
//Usado (¿?)

//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
//sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
//tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
    
    public void ronda(){
        boolean otraVuelta = false;
        do{
           
            for (Jugador listaJ : juegoN.getJugadores()) {
                System.out.println("Turno del Jugador N°"+listaJ.getId()+" - "+listaJ.getNombre());
                    otraVuelta = nuevoServiJ.disparo(juegoN.getRevolver());
                    if(otraVuelta == true){
                        listaJ.setMojado(Boolean.TRUE);
                        System.out.println("HASTA LA VISTA JUGADOR N°"+listaJ.getId());
                        
                        break;
                    }
                    else {
                        System.out.println("-----");
                    }
            }
        }while(otraVuelta == false);
//Aquí genero el iterator para eliminar al jugador cuando resulte mojado
        /*for (Iterator<Jugador> it = listaJugadores.iterator(); it.hasNext();) {
            Jugador next = it.next();
            System.out.println("Turno del Jugador N°"+next.getId()+" - "+next.getNombre());
            if(nuevoServiJ.disparo(rev)){
                next.setMojado(Boolean.TRUE);
                System.out.println("HASTA LA VISTA JUGADOR N°"+next.getId());
                //Aquí se elimina de la lista al jugador Mojado, pero no es necesario
                //ya que el ejercicio no lo pide:
                it.remove();
                
                break;
            }else {
                System.out.println("-----");
            }
        }*/
               
    }
//Usado    
}
