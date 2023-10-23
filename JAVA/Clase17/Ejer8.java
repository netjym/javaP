
/*
* Escriba un programa que averigüe si dos arrays de N enteros del mismo
* tamaño son iguales (la comparación deberá detenerse en cuanto se detecte
* alguna diferencia entre los elementos).
*/
import java.util.Scanner;
import java.util.Arrays;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese tamaño del primer array: ");
        // entrada del tamaño del array 1

        int n = entrada.nextInt();

        int[] list1 = new int[n];

        System.out.println("ingrese numeros enteros para lista 1: ");
        for (int i = 0; i < n; i++) {
            list1[i] = entrada.nextInt();
        }
        // ******************************************************** */
        System.out.println(Arrays.toString(list1));

        // ******************************************************* */
        System.out.println("ingrese tamaño del segundo array: ");
        // entrada del tamaño del array 2

        int N = entrada.nextInt();

        int[] list2 = new int[N];

        System.out.println("ingrese numeros enteros para lista 2: ");

        for (int j = 0; j < N; j++) {
            list2[j] = entrada.nextInt();
        }
        // ********************************************************/
        System.out.println(Arrays.toString(list2));

        sonIguales(list1, list2);
    }

    // **************************************************** */
    // funcion para coparar los arrays
    public static boolean sonIguales(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            System.out.println("tienen distinta longitud");
            return false;

        }
        for (int i = 0; i < list2.length; i++) {
            int Valorlista1 = list1[i], valorlista2 = list2[i];

            if (Valorlista1 != valorlista2) {
                System.out.println("no son iguales");
                return true;
            }
        }

        System.out.println("son iguales");
        return true;
    }

}
