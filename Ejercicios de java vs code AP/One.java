import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese sus datos");

        // Entrada de una cadena
        String name = sc.nextLine();
        System.out.println("nombre: " + name);

        // entrada de un caracter
        char gender = sc.next().charAt(0);
        System.out.println("Genero" + gender);

        // entrada de una cadena
        /// byte, short y float
        int age = sc.nextInt();
        System.out.println("edad" + age);

        long mobileNo = sc.nextLong();
        System.out.println("Telefono" + mobileNo);

        double average = sc.nextDouble();
        System.out.println("promedio" + average);

        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.

    }

}