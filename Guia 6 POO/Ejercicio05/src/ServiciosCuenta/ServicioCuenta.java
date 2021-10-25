/*
. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ServiciosCuenta;

import Cuenta.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Geronimo Tapia
 */
public class ServicioCuenta {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {

        System.out.println("Ingrese el número de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI ");
        long DNI = leer.nextLong();
        System.out.println("Ingrese el saldo actual");
        int saldoActual = leer.nextInt();
        
        return new Cuenta(numeroCuenta, DNI, saldoActual);
    }

    public void Menu(Cuenta c1, ServicioCuenta sc) {
        int op;
        do {
            System.out.println("¿Que desea realizar?");
            System.out.println("1. Ingreso");
            System.out.println("2. Retiro");
            System.out.println("3. Extraccion Rápida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            op = leer.nextInt();
            
            switch (op) {
                case 1:
                    sc.Ingresar(c1);
                    break;
                case 2:
                    sc.Retirar(c1);
                    break;
                case 3:
                    sc.extraccionRapida(c1);
                    break;
                case 4:
                    sc.consultarSaldo(c1);
                    break;
                case 5:
                    sc.consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("Usted ha salido del programa");
                    break;

            }
        } while (op != 6);
    }

    public double Ingresar(Cuenta c1) {
        float ingreso;
        System.out.println("Ingrese monto a depositar");
        ingreso = leer.nextFloat();

        c1.setSaldoActual(c1.getSaldoActual() + ingreso);
        return c1.getSaldoActual();

    }

    public double Retirar(Cuenta c1) {
        float retiro;
        System.out.println("Ingrese monto a Retirar");
        retiro = leer.nextFloat();

        c1.setSaldoActual(c1.getSaldoActual() - retiro);
        return c1.getSaldoActual();

    }

    public double extraccionRapida(Cuenta c1) {
        float extraccion;
        System.out.println("Ingrese una cantidad menor o igual al 20%");
        extraccion = leer.nextFloat();
        if (extraccion > (c1.getSaldoActual() * 20) / (100)) {
            System.out.println("Ustede sólo puede retirar el 20%");

        } else {
            c1.setSaldoActual(c1.getSaldoActual() - extraccion);
        }
        return c1.getSaldoActual();

    }

    public void consultarSaldo(Cuenta c1) {
        System.out.println("Su saldo disponible es: " + c1.getSaldoActual());
    }

    public void consultarDatos(Cuenta c1) {
        System.out.println("Númuero de cuenta: " + c1.getNumeroCuenta());
        System.out.println("DNI: " + c1.getDNI());

    }

}
