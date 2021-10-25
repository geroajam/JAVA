/*
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
package ServiciosCadena;

import CadenaMain.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioCadena {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {

        System.out.println("Ingrese una frase");
        String frase = leer.next();
        frase = frase.toUpperCase();
        int longitud = frase.length();

        return new Cadena(frase, longitud);
    }
    
     public void Menu(Cadena c, ServicioCadena sc) {
        int op;
        System.out.println("*******************************MENU*********************************");
                
                System.out.println("1. Mostrar las vocales de la frase");
                System.out.println("2. Invertir la frase");
                System.out.println("3. ¿Cuántas veces está repetido un carácter?");
                System.out.println("4. Comparar la longitud de la primera frase ingresada con otra");
                System.out.println("5. Unir la primera frase ingresada con otra");
                System.out.println("6. Reemplazar todas las letras “a” que se están en la frase");
                System.out.println("7. Comprobar si el carácter está en la frase");
                System.out.println("8. Salir");
        
            do {
                
                op = leer.nextInt();

                switch (op) {

                    case 1:
                        sc.mostrarVocales(c);
                        break;
                    case 2:
                        sc.invertirFrase(c);
                        break;
                    case 3:
                        sc.vecesRepetido(c);
                        break;
                    case 4:
                        sc.compararLongitud(c);
                        break;
                    case 5:
                        sc.unirFrases(c);
                        break;
                    case 6:
                        sc.reemplazar(c);
                        break;
                    case 7:
                        sc.contiene(c);
                        break;
                    case 8:
                        System.out.println("Usted ha salido del programa");
                        break;

                }
            } while (op != 8);
     }

    public void mostrarVocales(Cadena c) {
        String frase = c.getFrase();
        int longitud = c.getLongitud();
        int contadorvocales = 0;

        for (int i = 0; i < longitud; i++) {
            if ((frase.charAt(i) == 'A')
                    || (frase.charAt(i) == 'E')
                    || (frase.charAt(i) == 'I')
                    || (frase.charAt(i) == 'O')
                    || (frase.charAt(i) == 'U')) {
                contadorvocales++;
            }
        }

        System.out.println("La frase ingresada contiene " + contadorvocales + " vocales");
    }

    public void invertirFrase(Cadena c) {
        String frase = c.getFrase();
        int longitud = c.getLongitud();
        String fraseinvertida = "";

        for (int i = longitud - 1; i >= 0; i--) {
            fraseinvertida += frase.charAt(i);
        }
        System.out.println("La frase invertida es: " + fraseinvertida);
    }

    public void vecesRepetido(Cadena c) {
        int contador = 0;
        String frase = c.getFrase();
        int longitud = c.getLongitud();
        System.out.println("Ingrese una letra para ver cuantas veces está repetida en la frase");
        char letra = Character.toUpperCase(leer.next().charAt(0));

        for (int i = 0; i < longitud; i++) {
            if ((frase.charAt(i) == letra)) {
                contador++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(Cadena c) {
        String frase = c.getFrase();
        int longitud = c.getLongitud();

        System.out.println("Ingrese una nueva frase para comparar su longitud con la primera frase");
        String frase2 = leer.next();
        frase2 = frase2.toUpperCase();
        int longitud2 = frase2.length();

        if (longitud > longitud2) {
            System.out.println("La primera frase es mas larga");
        }
        if (longitud < longitud2) {
            System.out.println("La segunda frase es mas larga");
        }
    }

    public void unirFrases(Cadena c) {
        String frase = c.getFrase();

        System.out.println("Ingrese una nueva frase para unir las frases");
        String frase2 = leer.next();
        frase2 = frase2.toUpperCase();

        System.out.println("La frase queda: " + frase + " " + frase2);
    }

    public void reemplazar(Cadena c) {
        String frase = c.getFrase();

        System.out.println("Ingrese una letra para reemplzar la/s 'A'");
        char letra = Character.toUpperCase(leer.next().charAt(0));
        System.out.println("La frase después de reemplazar las 'A' por las '" + letra + "' queda así: " + frase.replace('A', letra));

    }

    public void contiene(Cadena c) {
        String frase = c.getFrase();
        int longitud = c.getLongitud();
        int contador=0;
        System.out.println("Ingrese una letra para buscarla en la frase");
        char letra = Character.toUpperCase(leer.next().charAt(0));
        
        for (int i = 0; i < longitud; i++) {
            if ((frase.charAt(i) == letra)) {
                contador++;
            }
            
        }
        if (contador>=1){
            System.out.println("VERDADERO");
        }else {
            System.out.println("FALSO");
        }
        

    }

}
