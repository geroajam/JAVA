/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package ServiciosPais;

import Pais.entidades.Pais;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String respuesta = "";

    TreeSet<Pais> listaPaises = new TreeSet();

    public void CrearPais() {

        do {
            Pais p1 = new Pais();

            System.out.println("Ingrese el país que desee");
            String nombre = leer.next().toUpperCase();
            p1.setNombre(nombre);

            listaPaises.add(p1);

            System.out.println("¿Quiere ingresar otro país?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("Si"));
    }

    public void mostrarPais(ServicioPais sp) {
        for (Pais aux : listaPaises) {
            System.out.println(aux);
        }
    }

    public void eliminarPais() {
        ;
        int contador = 0;
        
        System.out.println("Ingrese el nombre del producto a eliminar");
        String bus = leer.next();

        for (Pais aux : listaPaises) {
            if (this..equals(bus)) {
                contador++;
            }
        }

        if (contador < 1) {
            System.out.println("No se encontró el producto");

        } else {
            System.out.println("Se eliminó el producto correctamente");
        }
    }

}
