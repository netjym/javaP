
// public class Gran {
import java.util.Arrays;
import java.util.Scanner;

public class Gran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedimos el tamaño de la matriz al usuario
        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = input.nextInt();

        // Creamos la matriz y la rellenamos con valores aleatorios
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }

        // Mostramos la matriz en pantalla
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        // Pedimos al usuario el número a buscar en la matriz
        System.out.print("Ingrese un número a buscar en la matriz: ");
        int numBuscado = input.nextInt();

        // Buscamos el número en la matriz
        boolean encontrado = false;
        boolean repetido = false;
        int fila = -1;
        int columna = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == numBuscado) {
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

        // Mostramos el resultado en pantalla
        if (encontrado) {
            System.out.printf("El número %d se encuentra en la fila %d, columna %d.%n", numBuscado, fila, columna);
            if (repetido) {
                System.out.println("El número se encuentra repetido en la matriz.");
            }
        } else {
            System.out.printf("El número %d no se encuentra en la matriz.%n", numBuscado);
        }

        input.close();
    }

}

// }
