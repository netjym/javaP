import java.util.Scanner;

// Escribir un programa que pida una frase y la muestre toda en mayúsculas y
// después toda en minúsculas. Nota: investigar la función toUpperCase() y
// toLowerCase() en Java.
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese una Frase");
        Scanner Sc = new Scanner(System.in);
        String frase = Sc.nextLine();
        System.out.println("la frase convertida en mayuscula" + " " + frase.toUpperCase());
        System.out.println("La frase convertida en minuscula " + " " + frase.toLowerCase());
        
    }

}
