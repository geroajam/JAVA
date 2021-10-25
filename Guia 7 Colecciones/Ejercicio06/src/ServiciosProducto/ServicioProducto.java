/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas
 */
package ServiciosProducto;

import Producto.entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioProducto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String respuesta = "";

    HashMap<Producto, Double> listaProductos = new HashMap();
    
    public void Menu(ServicioProducto sp){
       int op;
        System.out.println("*******************************MENU*********************************");
                
                System.out.println("1. Mostrar los productos");
                System.out.println("2. Eliminar un producto");
                System.out.println("3. Salir");
        
            do {
                System.out.println("Ingrese una opción");
                op = leer.nextInt();

                switch (op) {

                    case 1:
                        sp.mostrarProducto(sp);
                        break;
                    case 2:
                        sp.eliminarProducto();
                        break;
                    case 3:
                        System.out.println("Usted ha salido del programa");
                        break;

                }
            } while (op != 3);
     }
    
    
    public void CrearProducto() {

        do {
            Producto p1 = new Producto();

            System.out.println("Ingrese el nombre del producto");;
            String nombre = leer.next().toUpperCase();
            p1.setNombre(nombre);

            System.out.println("Ingrese el precio del producto");
            double precio = leer.nextDouble();
            p1.setPrecio(precio);
            listaProductos.put(p1, precio);

            System.out.println("¿Quiere ingresar otro producto?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("Si"));
    }

    public void mostrarProducto(ServicioProducto sp) {
        for (Map.Entry<Producto, Double> entry : listaProductos.entrySet()) {
            Producto key = entry.getKey();
            Double value = entry.getValue();

            System.out.println("key " + key.getNombre() + " value " + value);
        }
    }

    public void eliminarProducto() {
        int contador=0 ;

        System.out.println("Ingrese el nombre del producto a eliminar");
        String bus = leer.next();

        for (Map.Entry<Producto, Double> aux : listaProductos.entrySet()) {
            Producto key = aux.getKey();
            Double value = aux.getValue();

            if (key.getNombre().equalsIgnoreCase(bus)) {
                listaProductos.remove(key);
                contador++;
            }
        }

        if (contador < 1) {
            System.out.println("No se encontró el producto");

        }else {
            System.out.println("Se eliminó el producto correctamente");
        }
    }
}
