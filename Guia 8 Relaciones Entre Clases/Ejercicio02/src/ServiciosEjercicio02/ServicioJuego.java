/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
 */
package ServiciosEjercicio02;

import ejercicio02.entidades.Juego;
import ejercicio02.entidades.Jugador;
import ejercicio02.entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioJuego {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServicioJugador sj=new ServicioJugador();
    ServicioRevolver sr = new ServicioRevolver();
    Juego juegoNuevo = new Juego();
    ArrayList<Jugador> jugadores=new ArrayList();    
    
    public void llenarJuego(ArrayList<Jugador> jugadores,Revolver r){
        juegoNuevo.setJugadores(jugadores);
        juegoNuevo.setR(r);
    }
    
    public void ronda(){
        
        do {
            for (Jugador aux : juegoNuevo.getJugadores()) {
                System.out.println("Turno del Jugador N°" + aux.getId() + " - " + aux.getNombre());
                if (sj.disparo(juegoNuevo.getR()) == true) {
                    System.out.println("HASTA LA VISTA JUGADOR N°" + aux.getId());
                    break;
                } else {
                    System.out.println("-----");
                }
            }
        } while (sj.disparo(juegoNuevo.getR()) == false); 
    }
    
//    public void ronda() {
//        boolean otraVuelta = false;
//
//        do {
//            for (Jugador aux : juegoNuevo.getJugadores()) {
//                System.out.println("Turno del Jugador N°" + aux.getId() + " - " + aux.getNombre());
//                otraVuelta = sj.disparo(juegoNuevo.getR());
//                if (otraVuelta == true) {
//                    aux.setMojado(Boolean.TRUE);
//                    System.out.println("HASTA LA VISTA JUGADOR N°" + aux.getId());
//
//                    break;
//                } else {
//                    System.out.println("-----");
//                }
//            }
//        } while (otraVuelta == false);
//    }

    
}
