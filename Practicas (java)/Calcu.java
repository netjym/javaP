public class Calcu {
    public static double sumar(Double num1, Double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;

    }

    private static Object division(double num1, double num2) {
        if (num2 == 0) {
            return "NO SE PUEDE DIVIDIR ENTRE CERO";
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        double x = 0;
        double z = 10;
        System.out.println(sumar(x, z));
        System.out.println(division(x, z));
    }
}
