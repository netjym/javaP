import java.util.Scanner;

public class ExampleArray {
    public static void main(String[] args) throws Exception {
        // se crea Array del tipo char (char,strin,integer etc)
        char[] cadena = new char[10];
        // variable frase
        String frase = "hola mundo";
        // imprimer posicion 5 de la frase
        // System.out.println(frase.charAt(5));

        for (int i = 0; i < cadena.length; i++) {
            cadena[i] = frase.charAt(i);

            // System.out.print(cadena[i]);
        }
        System.out.print("muestra lo guardado\n");
        System.out.println("invertido");
        // metodo para invertir la cadena en un array
        for (int i = cadena.length - 1; i >= 0; i--) {
            System.out.print(cadena[i] + "|");

        }
        System.out.println("\n");

        System.out.print("muestra lo guardado\n");
        for (int i = 0; i < cadena.length; i++) {
            System.out.print(cadena[i] + "|");
        }

    }

}
