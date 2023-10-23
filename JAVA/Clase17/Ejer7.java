import java.util.Arrays;
import java.util.Scanner;

public class Ejer7 {
    /*
     * Realizar un algoritmo que calcule la suma de todos los elementos de un array
     * de tamaño N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamaño del array; ");
        int tamaño = entrada.nextInt();

        int[] array = new int[tamaño];

        System.out.println("ingrese un numero: ");
        // agrega elementos en el array vacio por teclado
        for (int i = 0; i < tamaño; i++) {
            array[i] = entrada.nextInt();

        }
        // suma los elementos del array
        int suma = 0;
        for (int i = 0; i < tamaño; i++) {
            suma += array[i];
        }
        System.out.println(Arrays.toString(array)); // muestra el array
        System.out.println("la suma de los elemento en el array es : " + suma); // muestra la suma de los elementos

    }

}