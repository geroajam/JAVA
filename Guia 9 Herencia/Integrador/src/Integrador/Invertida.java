/*Esta función debe recibir una palabra y devolverla en minúsculas e invertida.
Por ejemplo:

"Hola" -> "aloh"
"PeRrO" -> "orrep"
Resultados esperados:

Si se ingresa la palabra ?otag deberá devolver la palabra gato?.
Si se ingresa la palabra aaaa deberá devolver la palabra aaaa.
Si se ingresa la palabra raton deberá devolver la palabra notar.
Si se ingresa la palabra aAaAaA deberá devolver la palabra aaaaaa.
Si se ingresa la palabra Hola deberá devolver la palabra aloh.
 */
package Integrador;

/**
 *
 * @author Geronimo Tapia
 */
public class Invertida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(inversa("Hola"));
    }

    public static String inversa(String palabra) {
        // Acá escribí la lógica necesaria
        String resultado=palabra.toLowerCase();
        String auxInvertida="";
        
        for (int i = 0; i < resultado.length(); i++) {
            auxInvertida = resultado.charAt(i) + auxInvertida;
        }
        return auxInvertida;
    }
}
