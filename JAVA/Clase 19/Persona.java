import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int nacimiento;
    private String signo;

    public Persona(String nombre, String apellido, int edad, int nacimiento, String signo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.signo = signo;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nacimiento=" + nacimiento
                + ", signo=" + signo + "]";
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public static void main(String[] args) {

        // 6
        /*
         * Crear una lista de Personas con al menos 5 objetos -
         * Mostrar la lista- agregar dos objetos más y
         * eliminar los dos primeros
         */
        Persona persona1 = new Persona("matias", "Toledo", 37, 12 / 06 / 1986, null);
        Persona persona2 = new Persona("Yesica", "Toledo", 32, 29 / 01 / 1991, null);
        Persona persona3 = new Persona("Nicolas", "Toledo", 31, 12 / 03 / 1992, null);
        Persona persona4 = new Persona("Samuel", "Toledo", 27, 25 / 05 / 1995, null);
        Persona persona5 = new Persona("Melisa", "Toledo", 24, 15 / 07 / 1998, null);
        // Crear lista persoas
        ArrayList<Persona> personas = new ArrayList<>();
        // Agregar a la lista los objetos personas
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        // Recorrer la lista y mostrarla
        System.out.println("Esta es la lista original");
        for (Persona persona : personas) {
            System.out.println(persona);

        }
        // Elimina dos objetos de la lista
        personas.remove(persona1);
        personas.remove(persona2);
        // Creo dos objetos nuevos
        Persona persona6 = new Persona("Sofia", "Cuenca", 24, 15 / 07 / 1998, null);
        Persona persona7 = new Persona("Joaquin", "Toledo", 13, 18 / 11 / 2009, null);
        // Agrego dos objetos nuevos a la lista
        personas.add(0, persona6);
        personas.add(1, persona7);
        // Recorro la lista actualizada
        System.out.println("Esta es la lista actualizada ");
        for (Persona persona : personas) {
            System.out.println(persona);

        }
    }

}
