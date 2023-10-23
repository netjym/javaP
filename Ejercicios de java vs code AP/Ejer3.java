import java.util.Scanner;
import java.lang.Math;

// Escribir un programa que lea un número entero por teclado y muestre por pantalla el
// doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
public class Ejer3 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        Integer x = sc.nextInt();

        System.out.println("El doble de " + x + " es " + x * 2);
        System.out.println("El Triple de " + x + " es " + x * 3);
        System.out.println("La raiz cuadrada de " + x + " es " + Math.sqrt(x));
    }
}
