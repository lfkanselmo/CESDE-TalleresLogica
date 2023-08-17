/*
Escriba un programa que le permita a un cliente de un banco navegar 
con distintas opcines , dependiendo de la transacción que requiera:
- Consultar saldo
- Realizar transferencia 
- Cambiar clave
- Bloquear producto
- Realizar donación

 */
package taller;

import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Punto5 {

    static boolean ejecucion = true;
    static boolean bloqueo = false;
    static String cuenta = "50020";
    static String clave = "1234";
    static double saldo = 500000;
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        iniciarSesion();
    }

    //Metodo para iniciar sesion
    public static void iniciarSesion() {
        int intentos = 3;

        do {

            System.out.println("Ingrese su numero de cuenta");
            String numCuenta = read.nextLine();
            System.out.println("Ingrese su contraseña");
            String claveCuenta = read.nextLine();

            if (numCuenta.equals(cuenta) && claveCuenta.equals(clave)) {
                menu();
                break;
            } else {
                System.out.println("No pudo ingresar, intente de nuevo");
                intentos--;
                System.out.println("Intentos restantes: " + intentos);
            }
        } while (intentos > 0);

    }

    //Metodo para el menu
    public static void menu() {
        System.out.println();
        System.out.println("******** BIEVENIDO ********");
        System.out.println();

        do {
            System.out.println();
            System.out.println("¿Qué desea realizar?");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar transferencia");
            System.out.println("3. Cambiar clave");
            System.out.println("4. Bloquear producto");
            System.out.println("5. Realizar donación");
            System.out.println("6. Salir");
            int opc = read.nextInt();
            read.skip("\n");

            if (bloqueo == false) {
                switch (opc) {
                    case 1:
                        System.out.println("Su saldo actual es:" + consultarSaldo());
                        ;
                        break;
                    case 2:
                        transferencia();
                        break;
                    case 3:
                        cambiarClave();
                        break;
                    case 4:
                        bloquearProducto();
                        break;
                    case 5:
                        System.out.println("Se realiza donativo por valor de: " + donacion());
                        break;
                    case 6:
                        ejecucion = false;
                        System.out.println("******** TERMINANDO ********");
                        break;
                    default:
                        System.out.println("Opción ingresadoa no válida");
                        break;
                }
            } else {
                System.out.println("Este producto está bloqueado. Acerquese a una sucursal fisica para desbloquearlo");
                ejecucion = false;
                System.out.println("******** TERMINANDO ********");
            }

        } while (ejecucion);

    }

    //Metodo para consultar saldo
    public static double consultarSaldo() {
        return saldo;
    }

    //Metodo para realizar transferencia
    public static void transferencia() {
        System.out.println("¿Ingrese valor a transferir?");
        double valor = read.nextDouble();

        if (valor > saldo) {
            System.out.println("Valor a transferir no disponible en cuenta");
        } else {
            saldo -= valor;
            System.out.println("Se tranfiere: " + valor);
            System.out.println("Nuevo saldo: " + consultarSaldo());
        }
    }

    //Metodo para cambiar la clave
    public static void cambiarClave() {
        System.out.println("Confirme la clave actual");
        String claveActual = read.nextLine();

        if (claveActual.equals(clave)) {
            System.out.println("Ingrese nueva clave");
            clave = read.nextLine();
            System.out.println("Clave cambiada con exito");
        } else {
            System.out.println("Clave erronea. No fue posible cambiar la clave");
        }
    }

    //Metodo para bloquear producto
    public static void bloquearProducto() {
        System.out.println("Solo podrá realizar el desbloqueo en una de nuestras sucursales fisicas");
        System.out.println("¿Está seguro de querer bloquear su producto? ingrese S para confirmar");
        String respuesta = read.nextLine().toUpperCase();

        switch (respuesta) {
            case "S":
                System.out.println("Confirme la clave actual");
                String claveActual = read.nextLine();

                if (claveActual.equals(clave)) {
                    bloqueo = true;
                    System.out.println("Producto bloqueado");
                } else {
                    System.out.println("Clave erronea. No fue posible bloquear el producto");
                }
                break;
            default:
                System.out.println("Bloqueo cancelado");
                break;

        }

    }

    //Metodo para realizar donacion
    //Metodo para realizar transferencia
    public static double donacion() {
        System.out.println("¿Ingrese valor a donar?");
        double valor = read.nextDouble();

        if (valor > saldo) {
            System.out.println("Valor a donar no disponible en cuenta");
            valor = 0;
        } else {
            saldo -= valor;
        }

        return valor;
    }
}
