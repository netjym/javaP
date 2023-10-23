import java.util.Scanner;

public class Ejer5 {

    public static void main(String[] args) {

        System.out.println("* MENU\n* 1. Sumar\n* 2. Restar\n* 3. Multiplicar\n* 4. Dividir\n* 5. Salir\n");
        System.out.println("Seleccione una opcion: ");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        for (int i = 0; i < menu; i++) {
            if (menu == 1) {
                System.out.println("ingrese dos numeros");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                sumarEntero(num1, num2);
                i++;

            }
            if (menu == 2) {
                System.out.println("ingrese dos numeros");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                restaEntero(num1, num2);
                i++;

            }
            if (menu == 3) {
                System.out.println("ingrese dos numeros");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                multiplicarEntero(num1, num2);
                i++;
            }
            if (menu == 4) {
                System.out.println("ingrese dos numeros");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                dividir(num1, num2);
                i++;
            }

            if (menu == 5) {
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
            }
        }
    }

    static void sumarEntero(int num1, int num2) {

        System.out.println(num1 + num2);

    }

    static void restaEntero(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    static void multiplicarEntero(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    static void dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("El segundo numero tiene que ser distinto de 0, ya que no se puede dividir por CERO");

        } else {
            System.out.println(num1 / num2);
        }
    }
}

/*
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:
 * MENU
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * 5. Salir
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado
 * por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que
 * se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción
 * 5,
 * en vez de salir del programa directamente, se debe mostrar el siguiente
 * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si
 * el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se
 * vuelve a mostrar el menú.
 * Nota: Para resolver este ejercicio se recomienda crear una función para cada
 * opción.
 */