
import java.util.Scanner;

public class CuentaBancaria {

    public static void main(String[] args) {
        //variables
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Ahorros";
        double saldo = 2682.99;
        int opcion = 0;

//Datos cuenta, usuario, saldo
        System.out.println("*********************");
        System.out.println("\nNombre del cliente: " + nombreCliente);
        System.out.println("Cuenta de: " + tipoCuenta);
        System.out.println("Saldo disponible: " + saldo);
        System.out.println("\n*********************");

//Menu navegacion
        String menu = """
                ***Escriba la opcion que sea***
                Consultar daldo -- 1
                Retirar         -- 2
                Depositar       -- 3
                Salir           -- 9
                """;
//Inicio variables
        Scanner teclado = new Scanner(System.in);
        while (opcion !=9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            //Variables menu
            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual es de: $" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    int valorARetirar = teclado.nextInt();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("Nuevo saldo es: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor que desea depositar");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Su nuevo saldo es de: $" + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por confiar en nosotros Buen día");
                    break;
                default:
                    System.out.println("Opcion no valida, ingresa una opcion valida");

            }


        }

    }

}
