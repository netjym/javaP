
// public class MenuPro {
// public static void main(String[] args) {
// for (int i = 0; i < args.length; i++) {
// 
// }
// }
// }
import java.util.Scanner;

public class MenuPro {
    public static void main(final String[] args) {
        final Scanner entrada = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario

        char opcion; // Declaramos una variable para almacenar la opción elegida por el usuario
        do {

            System.out.println("* MENU\n* 1. Sumar\n* 2. Restar\n* 3. Multiplicar\n* 4. Dividir\n* 5. Salir\n");
            System.out.print("Elige una opción: ");

            opcion = entrada.next().charAt(0); // Leemos la opción elegida por el usuario

            // Evaluamos la opción elegida por el usuario mediante un switch
            switch (opcion) {
                case '1':
                    System.out.println("Has elegido la opción 1");
                    System.out.println("ingrese dos numeros");
                    int num1 = entrada.nextInt();
                    int num2 = entrada.nextInt();
                    sumarEntero(num1, num2);
                    break;
                case '2':
                    System.out.println("Has elegido la opción 2");
                    System.out.println("ingrese dos numeros");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    restaEntero(num1, num2);
                    break;
                case '3':
                    System.out.println("Has elegido la opción 3");
                    System.out.println("ingrese dos numeros");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    multiplicarEntero(num1, num2);
                    break;
                case '4':
                    System.out.println("Has elegido la opción 3");
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    dividir(num1, num2);
                    break;
                case '5':
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    break;
                case 's':
                case 'S':
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 's' && opcion != 'S'); // Continuamos en el ciclo mientras el usuario no haya elegido la
        // opción de salida
    }

    // funciones
    static void sumarEntero(final int num1, final int num2) {

        System.out.println(num1 + num2);

    }

    static void restaEntero(final int num1, final int num2) {
        System.out.println(num1 - num2);
    }

    static void multiplicarEntero(final int num1, final int num2) {
        System.out.println(num1 * num2);
    }

    static void dividir(final double num1, final double num2) {
        if (num2 == 0) {
            System.out.println("El segundo numero tiene que ser distinto de 0, ya que no se puede dividir por CERO");

        } else {
            System.out.println(num1 / num2);
        }
    }
}