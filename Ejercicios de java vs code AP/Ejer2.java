import java.util.Scanner;

// Dada una cantidad de grados centígrados se debe mostrar su equivalente en
// grados Fahrenheit utilizando un método/función que lo calcule y lo muestre por
// pantalla. La fórmula correspondiente es: F = 32 + (9 * C / 5).
public class Ejer2 {
    public static void main(String[] args) {
        System.out.println("ingrese temperatura en grados centigrados: ");
        Scanner sc = new Scanner(System.in);
        Double c = sc.nextDouble();
        System.out.println("La convercion de " + c + " grados " + "= " + (32 + (9 * c / 5) + " Grados Fahrenhit."));
    }
}
