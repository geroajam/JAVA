/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false
 */
package ServiciosEjercicio02;

import ejercicio02.entidades.Jugador;
import ejercicio02.entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioJugador {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Jugador> jugadores = new ArrayList();
    ServicioRevolver sr = new ServicioRevolver();

    public ArrayList CrearJugador() {
        System.out.println("Ingrese la cantidad de jugadores (1-6)");
        int cant = leer.nextInt();
        if (cant == 1 || cant>=1) {
            Jugador p1 = new Jugador(1, "Jugador", false);
            jugadores.add(p1);
            //return jugadores;
        }
        if (cant == 2|| cant>=2) {
            Jugador p2 = new Jugador(2, "Jugador", false);
            jugadores.add(p2);
            //return jugadores;
        }
        if (cant == 3|| cant>=3) {
            Jugador p3 = new Jugador(3, "Jugador", false);
            jugadores.add(p3);
            //return jugadores;
        }
        if (cant == 4|| cant>=4) {
            Jugador p4 = new Jugador(4, "Jugador", false);
            jugadores.add(p4);
            //return jugadores;
        }
        if (cant == 5|| cant>=5) {
            Jugador p5 = new Jugador(5, "Jugador", false);
            jugadores.add(p5);
            //return jugadores;
        }
        if (cant == 6) {
            Jugador p6 = new Jugador(6, "Jugador", false);
            jugadores.add(p6);
          //  return jugadores;
        }
        if (cant<1 || cant>6){
        //return null;
        }
        return jugadores;
    }

    public boolean disparo(Revolver r) {
        if (sr.mojar(r)) {
            return true;
        } else {
            sr.siguienteChorro(r);
            return false;
        }
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

}
