/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Formulas: Superficie = base ∗ altura / Perímetro = (base + altura) ∗ 2
 */
package Rectangulo.entidades;

/**
 *
 * @author Geronimo Tapia
 */
public class Rectangulo {

    public int Base;
    public int Altura;

    public Rectangulo() {
    }

    public Rectangulo(int Base, int Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public int Superficie(int Base, int Altura) {
        return Base * Altura;
    }

    public int Perimetro(int Base, int Altura) {
        return (Base + Altura) * 2;
    }

    public void Dibujo(int Base, int Altura) {
        for (int i = 0; i < Altura; i++) {
            for (int j = 0; j < Base; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
