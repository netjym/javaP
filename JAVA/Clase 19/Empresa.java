import java.util.Scanner;

public class Empresa {

    /*
     * 1- Una Empresa necesita desarrollar un sistema de software de registro de
     * pasajeros que
     * suben en el único colectivo que sale de la terminal de Retiro a Córdoba, el
     * colectivo tiene sólo capacidad para 6 pasajeros.
     * Se necesita lo siguiente:
     * ● Ingresar las personas con sus respectivos apellido, nombre , Número de
     * Documento, edad y calle donde vive.
     * ● Imprimir un informe de los pasajeros.
     * ● Identificar los mayores de edad y menores de edad.
     * ● Imprimir los mayores de edad y menores de edad.
     */
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Toledo", "Nicolas", 36080268, 31, "San miguel");
        System.out.println(pasajero1);
        Pasajero pasajero2 = new Pasajero("Cuenca", "Sofia", 45033255, 24, "San miguel");
        System.out.println(pasajero2);
        Pasajero pasajero3 = new Pasajero("Perez", "Gonzalo", 21455265, 40, "Belgrano");
        System.out.println(pasajero3);
        // Pasajero pasajero4 = new Pasajero(null, null, 0, 0, 0);
        // Pasajero pasajero5 = new Pasajero(null, null, 0, 0, 0);
        // System.out.println(pasajero5);
        // Pasajero pasajero6 = new Pasajero(null, null, 0, 0, 0);
        // System.out.println(pasajero6);
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese datos de pasajero ");

        // ArrayList<String> pasajero4 = new ArrayList<String>();

        System.out.println("**********************************************");
        // Se pide los datos por teclados
        System.out.println("introduce apellido ");
        String apellido = sc.next();
        // pasajero4.add(apellido);

        System.out.println("introduce nombre");
        String nombre = sc.next();
        // pasajero4.add(nombre);

        System.out.println("introduce dni");
        int dni = sc.nextInt();

        System.out.println("introduce edad");
        int edad = sc.nextInt();

        System.out.println("introduce ciudad");
        String ciudad = sc.next();

        // para imprimir el nuevo pasajero pasado x teclado se pasan las variables
        // declaradas
        // en los input
        Pasajero pasajero4 = new Pasajero(apellido, nombre, dni, edad, ciudad);
        System.out.println(pasajero4);
        // System.out.println((pasajero4));

    }

}