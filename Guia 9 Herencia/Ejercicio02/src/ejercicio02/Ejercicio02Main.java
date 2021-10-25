/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos
 */
package ejercicio02;

import ejercicio02.entidades.Lavadora;
import ejercicio02.entidades.Televisor;
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
        //Lavadoras
        ArrayList<Lavadora> listaLavadoras = new ArrayList();

        Lavadora L1 = new Lavadora();
        L1.crearLavadora();
        
        Lavadora L2 = new Lavadora();
        L2.crearLavadora();
        
        L1.precioFinal();
        L2.precioFinal();
        
        listaLavadoras.add(L1);
        listaLavadoras.add(L2);
        
        double totalL=0;
        double totalTv=0;
        
        for (Lavadora aux : listaLavadoras) {
            if(aux instanceof Lavadora){
                totalL += aux.getPrecio();
            }
        }
        //Televisores
        ArrayList<Televisor> listaTelevisores = new ArrayList();
        Televisor T1 = new Televisor();
        T1.crearTelevisor();
        
        Televisor T2 = new Televisor();
        T2.crearTelevisor();
        
        T1.precioFinal();
        T2.precioFinal();
        
        listaTelevisores.add(T1);
        listaTelevisores.add(T2);
        
        for (Televisor auxtv : listaTelevisores) {
            if(auxtv instanceof Televisor){
                totalTv += auxtv.getPrecio();
            }
        }

        System.out.println("El precio total de las lavadoras es: $"+totalL);
        System.out.println("El precio total de los televisores es: $"+totalTv);
    }
    
}
