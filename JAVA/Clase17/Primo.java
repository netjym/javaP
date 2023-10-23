import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero n; ");
        int n = sc.nextInt();

        if (esPrimo(n)) {
            System.out.println("el numero es primo");

        } else {
            System.out.println("el numero no es primo");
        }
    }

    private static Boolean esPrimo(int n) {
        boolean bandera = true;
        if (n == 1 || n == 2 || n == 3) {
            return true;
        }

        if (n > 3) {
            for (int i = 2; i < n; i++) {
                if ((n % i) == 0) {
                    return bandera = false;
                }

            }
        }
        return bandera;
    }

}
