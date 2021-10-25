/*
*/
package Servicios;

import Atributos.Jugador;
import Atributos.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiJugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Jugador> listaPlayers = new ArrayList();
    ServiRevolver servRevo = new ServiRevolver();
    
    //Método para determinar la cantidad de Jugadores y Cargarlos
    //El número de jugadores será decidido por el usuario, pero debe ser entre 
    //1 y 6. Si no está en este rango, por defecto será 6.
    public ArrayList cargaJugadores(){
        /*
        System.out.println("Defina la cantidad de jugadores (entre 1 y 6)");
        Integer jugadores = leer.nextInt();
        if (jugadores <= 0 || jugadores > 6) {
            jugadores = 6;
        }
        
            
            for (int i = 0; i < jugadores; i++) {
            //Creo el nuevo Objeto Jugador
            Jugador playerNro = new Jugador();
            System.out.println("Cargue el nombre del Jugador "+(i+1));
            String nombre = leer.next();
            
            //Cargo los datos del Objeto Jugador
            playerNro.setId(i+1);
            playerNro.setNombre(nombre);
            
            //Cargo el Objeto Jugador al Set, hasta completar el total de jugadores
            listaPlayers.add(playerNro);
            
            }
        */    
            
            
            //CARGO TODOS LOS JUGADORES DE UNA PARA AGILIZAR
            Integer jugadores = 4;           
            //Cargo 4 jugadores
            Jugador playerNro1 = new Jugador();
            playerNro1.setId(1);
            playerNro1.setNombre("Leo");
            playerNro1.setMojado(Boolean.FALSE);
            
            Jugador playerNro2 = new Jugador();
            playerNro2.setId(2);
            playerNro2.setNombre("Gachi");
            playerNro2.setMojado(Boolean.FALSE);
            
            Jugador playerNro3 = new Jugador();
            playerNro3.setId(3);
            playerNro3.setNombre("Pachi");
            playerNro3.setMojado(Boolean.FALSE);
            
            Jugador playerNro4 = new Jugador();
            playerNro4.setId(4);
            playerNro4.setNombre("Nardo");
            playerNro4.setMojado(Boolean.FALSE);
            
            listaPlayers.add(playerNro1);
            listaPlayers.add(playerNro2);
            listaPlayers.add(playerNro3);
            listaPlayers.add(playerNro4);
            
            return listaPlayers;
    }    
 //Usado
    
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    public boolean disparo(Revolver revPum){
        
        if (servRevo.mojar(revPum)){
            return true;
        }else{ 
            servRevo.siguienteChorro(revPum);
            return false;
        }
        
    }
//Usado    
    
}
