
// CLASE PASAJERO

import java.util.LinkedList;

public class Pasajero {

    /*
     * Ingresar las personas con sus respectivos apellido, nombre , Número de
     * Documento, edad y calle donde vive.
     * Imprimir un informe de los pasajeros.
     * Identificar los mayores de edad y menores de edad.
     * Imprimir los mayores de edad y menores de edad.
     */
    // contructor
    private String apllido;
    private String nombre;
    private int dni;
    private int edad;
    private String ciudad;

    // CONTRUCTOR VACIO
    public Pasajero() {

    }

    public Pasajero(String apllido, String nombre, int dni, int edad, String ciudad) {
        this.apllido = apllido;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.ciudad = ciudad;

    }

    public String getApllido() {
        return apllido;
    }

    public void setApllido(String apllido) {
        this.apllido = apllido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Pasajero [apllido=" + apllido + ", nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", ciudad="
                + ciudad + "]";
    }

    public static void main(String[] args) {
        // OBJEETOS PASAJEROS
        Pasajero pasajero1 = new Pasajero("Toledo", "Nicolas", 36080268, 17, "San miguel");

        Pasajero pasajero2 = new Pasajero("Cuenca", "Sofia", 45033255, 24, "San miguel");

        Pasajero pasajero3 = new Pasajero("Perez", "Gonzalo", 21455265, 40, "Belgrano");
        // System.out.println(pasajero1 + "\n" + pasajero2 + "\n" + pasajero3);

        // LISTA DE PASAJEROS
        LinkedList<Pasajero> registro = new LinkedList<>();
        registro.add(pasajero1);
        registro.add(pasajero2);
        registro.add(pasajero3);

        // MOSTRAR REGISTRO
        for (int i = 0; i < registro.size(); i++) {

            System.out.println("esto es recorrer la lista " + registro.get(i));

        }
        // LLAMA LA FUNCION SELEC REGISTRO Y MUESTRA SI SIN MAYORES O NO
        selecMayores(registro);

        // Pasajero pasajero4 = new Pasajero(null, null, 0, 0, 0);
        // System.out.println(pasajero4);
        // Pasajero pasajero5 = new Pasajero(null, null, 0, 0, 0);
        // System.out.println(pasajero5);
        // Pasajero pasajero6 = new Pasajero(null, null, 0, 0, 0);
        // System.out.println(pasajero6);

    }

    // FUNCION PARA BUSCAR EN LISTA LOS MAYORES Y MENORES E IMPRIMIR EN PANTALLA
    public static void selecMayores(LinkedList<Pasajero> pasajeros) {
        for (Pasajero pasajero : pasajeros) {
            if (mayor(pasajero.getEdad())) {
                System.out.println(pasajero.getNombre() + " es mayor");

            } else {
                System.out.println(pasajero.getNombre() + " es menor");

            }
        }

    }

    public static boolean mayor(int edad) {
        return edad >= 18;

    }

}