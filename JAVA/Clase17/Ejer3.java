import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {

        System.out.println("ingrese una frase: ");
        Scanner sc = new Scanner(System.in);
        String frase = "eureka";
        String x = sc.next();
        if (x.equals(frase)) {
            System.out.println("correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
 * Incorrecto. Nota: investigar la función equals() en Java.
 */