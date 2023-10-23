import java.util.Scanner;

public class Funtion {
    public static void main(String[] args) {
        // se declaran y se asignan valores despues
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("favor de ingresar un numero entero: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        suma(num1, num2);
        // saludar();
    }

    // funciones (porcion de codigo que funcionad e sub programa)
    // parametros son los valores que necesita el metodo para determinada funcion
    public static void saludar() {
        System.out.println("hola mundo");
    }

    public static void suma(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    // son metodos == a funciones en otros lenguajes
    // void no va a devolver nada
    public static void multiplicar() {

    }

    public static void resta() {

    }

}
