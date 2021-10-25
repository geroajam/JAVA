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
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
 */
package ejercicio02;

import ServiciosEjercicio02.ServicioJuego;
import ServiciosEjercicio02.ServicioJugador;
import ServiciosEjercicio02.ServicioRevolver;
import ejercicio02.entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author Geronimo Tapia
 */
public class Ejercicio02Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioRevolver sr=new ServicioRevolver();
        ServicioJugador sj=new ServicioJugador();
        ServicioJuego sjuego=new ServicioJuego();
        
        ArrayList jugadores = sj.CrearJugador();
        
        
        Revolver r=sr.llenarRevolver();
        
        sjuego.llenarJuego(jugadores, r);
        
        sjuego.ronda();
    }
}
