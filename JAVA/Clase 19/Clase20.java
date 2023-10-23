
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Clase20 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(4);
        num.add(3);
        num.add(2);
        num.add(1);
        for (int i = 0; i < num.size(); i++) {

            // System.out.println(num);
            // System.out.println(i);

        }

        // 1
        int[] numeros = new int[10];
        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        numeros[4] = 4;
        numeros[5] = 5;
        numeros[6] = 6;
        numeros[7] = 7;
        numeros[8] = 8;
        numeros[9] = 9;
        // System.out.println("numeros en el array");
        for (int i = 0; i < numeros.length; i++) {
            // System.out.println("Numero en la posicion " + i + " : " + numeros[i]);

        }
        // 2
        String[] nombres = new String[5];
        nombres[0] = "Nicolas";
        nombres[1] = "Joaquin";
        nombres[2] = "Emilia";
        nombres[3] = "Sofia";
        nombres[4] = "Samuel";

        for (int i = 0; i < nombres.length; i++) {
            // System.out.println("Posicion" + i + " : " + nombres[i]);
        }

        // 3
        int[] numerosAleatorios = new int[6];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 6) + 1;
            // System.out.println(numerosAleatorios[i]);
        }
        int[] cant = new int[6];
        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numeroActual = numerosAleatorios[i];
            cant[numeroActual - 1]++;
        }
        for (int i = 0; i < cant.length; i++) {
            // System.out.println("El número " + (i + 1) + " apareció " + cant[i] + "
            // veces.");
        }

        // 4
        // String[] persona = new String[5];
        // persona[0] = "Remera";
        // persona[1] = "Pantalon";
        // persona[2] = "Reloj";
        // persona[3] = "Zapatos";
        // persona[4] = "Camisa";
        //
        // for (int i = 0; i < persona.length; i++) {
        // System.out.println(persona[i]);

        // }
        // 5
        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        enteros.add(6);
        enteros.add(7);
        enteros.add(8);
        enteros.add(9);
        enteros.add(10);
        // System.out.println("Esta es la lista original " + enteros);

        enteros.remove(3);

        enteros.add(20);
        enteros.add(25);

        // for (int i = 0; i < enteros.size(); i++) {
        // }
        // System.out.println("Esta es la lista modificada" + enteros);

        // int[] enteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int[] newEnteros = null;

        // System.out.println();
        // System.out.println(Arrays.toString(enteros));

        // for (int i = 0; i < enteros.length; i++) {
        // if (enteros[i] == 5) {
        // newEnteros = new int[enteros.length - 1];
        // for (int index = 0; index < i; index++) {
        // newEnteros[index] = enteros[index];

        // }
        // for (int j = i; j < enteros.length - 1; j++) {
        // newEnteros[j] = enteros[j + 1];

        // }
        // break;
        // }
        // System.out.println(Arrays.toString(newEnteros));
        // }

        // 6
        /*
         * Crear una lista de Personas con al menos 5 objetos -
         * Mostrar la lista- agregar dos objetos más y
         * eliminar los dos primeros
         */

        /*
         * String[] personas = new String[1];
         * personas[0] = "Matias ," + " Toledo ," + " 36 ," + " Caseros ," + " hijo ";
         * System.out.println(Arrays.toString(personas));
         */

        // ArrayList<String> personas = new ArrayList<>();
        // personas.add("matias");

        // System.out.println(personas);

    }

}