/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 */
package ServiciosCafetera;

import Cafetera.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioCafe {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafe() {

        System.out.println("Ingrese la cantidad máxima de café en ml que puede contener la cafetera");
        int capacidadMaxima = leer.nextInt();
        System.out.println("Ingrese la cantidad actual de café en ml que hay en la cafetera");
        int capacidadActual = leer.nextInt();

        return new Cafetera(capacidadMaxima, capacidadActual);
    }

    public void Menu(Cafetera c1, ServicioCafe sc) {
        int op;
        if (c1.getCapacidadMaxima() >= c1.getCapacidadActual()) {
            do {
                System.out.println("Que acción desea realizar");
                System.out.println("1. Llenar la cafetera");
                System.out.println("2. Servir una taza");
                System.out.println("3. Vaciar la cafetera");
                System.out.println("4. Agregar Cafe");
                System.out.println("5. Salir");
                op = leer.nextInt();

                switch (op) {

                    case 1:
                        sc.llenarCafetera(c1);
                        break;
                    case 2:
                        sc.servirTaza(c1);
                        break;
                    case 3:
                        sc.vaciarCafetera(c1);
                        break;
                    case 4:
                        System.out.println(sc.agregarCafe(c1));
                        break;
                    case 5:
                        System.out.println("Usted ha salido del programa");
                        break;

                }
            } while (op != 5);
        } else{
            System.out.println("La capacidad actual no puede ser mayor a la actual");
        }
    }

    public void llenarCafetera(Cafetera c1) {

        c1.setCapacidadActual(c1.getCapacidadMaxima());
        System.out.println("La cafetera ahora tiene: "+c1.getCapacidadActual()+"ml");
       

    }

    public void servirTaza(Cafetera c1) {
        int taza;
        System.out.println("Ingrese el tamaño de la taza (ml)");
        taza = leer.nextInt();
        if (taza <= c1.getCapacidadActual()) {
             taza = ( c1.getCapacidadActual()-taza);
             c1.setCapacidadActual(c1.getCapacidadActual()-taza);
            System.out.println("Se llenó la taza ");
            System.out.println("La cafetera ahora tiene: "+c1.getCapacidadActual());

        }
        if (taza > c1.getCapacidadActual()) {
            taza = (taza-c1.getCapacidadActual());
            c1.setCapacidadActual(0);
            System.out.println("No se llenó la taza ");
            System.out.println("La cantidad que queda en la taza es de: " + taza + "ml");
            System.out.println("La cafetera ahora tiene: "+c1.getCapacidadActual()+"ml");
        }

    }

    public void vaciarCafetera(Cafetera c1) {

        c1.setCapacidadActual(0);
        System.out.println("La cafetera ahora está vacía");

    }

    public int agregarCafe(Cafetera c1) {
        int cafe;
        System.out.println("Ingrese la cantidad de cafe que desea agregar");
        cafe = leer.nextInt();
        System.out.println("La cafetera ahora tiene: ");
        c1.setCapacidadActual(c1.getCapacidadActual() + cafe);

        return c1.getCapacidadActual();
    }

}
