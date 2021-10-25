/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas
 */
package ejercicio01.entidades;

/**
 *
 * @author Geronimo Tapia
 */
public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int Paginas;

    public Libro(int ISBN, String Titulo, String Autor, int Paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
    }

    public Libro(){
        
    }

   

    
    
    
    public void llenarLibro(int ISBN, String Titulo, String Autor, int Paginas){
        this.ISBN=ISBN;
        this.Titulo=Titulo;
        this.Autor=Autor;
        this.Paginas=Paginas;
    }
    
    public void mostrarLibro(){
        System.out.println("El ISBN del libro es: "+ISBN);
        System.out.println("El título del libro es: "+Titulo);
        System.out.println("El Autor del libro es: "+Autor);
        System.out.println("El número de paginas es: "+Paginas);
    }
}
