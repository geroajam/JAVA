/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:

 */
package CadenaMain;

import CadenaMain.entidades.Cadena;
import ServiciosCadena.ServicioCadena;

/**
 *
 * @author Geronimo Tapia
 */
public class CadenaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioCadena sc=new ServicioCadena();
        Cadena c=sc.crearCadena();
        
        sc.Menu(c, sc);
       
    }
    
}
