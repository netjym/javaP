import java.util.Scanner;

public class InvertirPalabra {
    // crear una funcion, Dada una cadena de texto devuelva la cadena invertida

    public static String invertir_Palabra(String cadena) {
        Scanner sc = new Scanner(System.in);

        int longitudCadena = 0;
        String palabra = "";
        String newPalabra = "";

        longitudCadena = cadena.length();
        palabra = sc.nextLine();

        while (longitudCadena != 0) {
            newPalabra += palabra.substring(longitudCadena - 1, longitudCadena);
            longitudCadena--;

        }
        System.out.println(newPalabra);
        return null;
        // return newPalabra;
    }

    public static void main(String[] args) {

        String texto = "hola mundo";

        String pal = "";
        for (int i = 0; i < texto.length(); i++) {
            pal += texto.length();
        }
        System.out.println(pal);

        // System.out.println(invertir_Palabra("hola"));

        String palabra = "";
        String palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner sc = new Scanner(System.in);

        // System.out.print("Ingrese una texto: ");
        palabra = sc.nextLine();

        longitudPalabra = palabra.length();

        while (longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;
            // System.out.println(palabraInvertida + " = " + longitudPalabra + "
            // valordelongitud");

        }

        // System.out.println(palabraInvertida);

        // String cadena = "hola mundo";
        // cadena.substring(10, 4);
        // System.out.println(cadena.substring(10, 4));
        // System.out.println("coco".substring(4, 4));
    }

}