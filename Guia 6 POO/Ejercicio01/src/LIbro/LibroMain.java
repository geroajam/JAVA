/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 */
package LIbro;

import ejercicio01.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class LibroMain {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Libro l1=new Libro();
        
        
        System.out.println("Ingrese el ISBN del libro");
        int ISBN=leer.nextInt();
        System.out.println("Ingrese el Titulo del libro");
        String Titulo=leer.next();
        System.out.println("Ingrese el autor del libro");
        String Autor=leer.next();
        System.out.println("Ingrese el número de paginas del libro");
        int Paginas=leer.nextInt();
        l1.llenarLibro(ISBN,Titulo, Autor, Paginas);
        l1.mostrarLibro();
      
    }

    
}

//    private String Titulo;
//    private String Autor;
//    private int Paginas;
