import java.util.Scanner;

public class F {

    public static int sumar(int num1, int num2) {
        int resultado = num1 + num2;
        return +resultado;

    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int resta(int num1, int num2) {
        if (num1 >= num2) {
            int resultado = num1 - num2;
            return resultado;
        } else {
            System.out.println("queda en negativo");
            return num1 - num2;
        }
    }

    private static double division(Double num1, Double num2) {
        if (num1 != 0) {
            Double resultado = num1 / num2;
            return resultado;
        } else {
            System.out.println("no se puede dividir x cero");
            return 0;
        }

    }

    public static double potencia(int num1, int num2) {
        double reultado = Math.pow(num1, num2);
        return reultado;

    }

    public static double raiz(int num1, int num2) {
        double resultado = Math.sqrt(num1);
        double resultado2 = Math.sqrt(num2);
        System.out.println(resultado2);
        return resultado;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("ingrese dos numero");
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // double num1 = sc.nextDouble();
        // double num2 = sc.nextDouble();

        // System.out.println("la suma de " + n1 + "+" + n2 + " es " + sumar(n1, n2));

        // System.out.println(resta(n1, n2));
        // System.out.println(division(num1, num2));
        // System.out.println(potencia(n1, n2));
        // System.out.println(raiz(n1, n2));

        /* IMPRIMIR LOS MAYORES DE EDAD y menores (EJEMPLO DE CONDICIONALES CON GET) */
        // if (esMayor(pasajero1.edad)) {
        // System.out.println(pasajero1.getNombre() + " es mayor");
        // } else {
        // System.out.println(pasajero1.getNombre() + " es menor de edad");
        // }
        // if (esMayor(pasajero2.edad)) {
        // System.out.println(pasajero2.getNombre() + " es mayor");
        // } else {
        // System.out.println(pasajero2.getEdad() + " es menor de edad");
        // }
        // if (esMayor(pasajero3.edad)) {
        // System.out.println(pasajero3.getNombre() + " es mayor");
        // } else {
        // System.out.println(pasajero3.getEdad() + " es menor de edad");
        // }

        /*
         * UNA FORMA DE ITERAR CON CONDICIONALES SIN SIN FOR
         * public static int sum(int k) {
         * if (k > 0) {
         * // System.out.println(k);
         * return k + sum(k - 1);
         * 
         * } else {
         * // System.out.println(k);
         * return 0;
         * }
         * }
         */

    }

}
