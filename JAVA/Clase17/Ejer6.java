
import java.util.Arrays;
import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero: ");

        int num = entrada.nextInt();

        int[][] vector = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                vector[i][j] = (int) (Math.random() * 100);
                // System.out.println(vector);
            }
        }
        for (int[] fila : vector) {
            System.out.println(Arrays.toString(fila));

        }
        System.out.println("ingrese un numero a buscar en el vector: ");
        int numBuscado = entrada.nextInt();

        boolean encontrado = false;
        boolean repetido = false;
        int fila = -1;
        int columna = -1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (vector[i][j] == numBuscado) {
                    if (encontrado) {
                        repetido = true;

                    } else {
                        encontrado = true;
                        fila = i;
                        columna = j;
                    }
                }
            }
        }
        if (encontrado) {
            System.out.printf("el numero %d se encuentra en la fila %d, columna %d.\n", numBuscado, fila, columna);
            if (repetido) {
                System.out.println("el numero se encuentra repetido en el vector. ");
            }
        } else {
            System.out.printf("el numero %d no se encuentra en el vector.%n", numBuscado);
        }
        entrada.close();
    }
}

/*
 * Realizar un algoritmo que rellene un array de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * donde se encuentra el número y si se encuentra repetido.
 */
