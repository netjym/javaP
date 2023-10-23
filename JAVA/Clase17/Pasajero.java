import java.util.ArrayList;

public class Pasajero {
    private int dni;
    private int edad;
    private String nombre;
    private String apellido;
    private String direccion;

    public Pasajero() {
    }

    public Pasajero(int dni, int edad, String nombre, String apellido, String direccion) {
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static void crearPasajero(int dni, int edad, String nombre, String apellido, String direccion) {
        Pasajero pasajero = new Pasajero(dni, edad, nombre, apellido, direccion);
    }

    public ArrayList<Pasajero> guardarPasajero(Pasajero pasajero) {
        ArrayList<Pasajero> pasajeros = new ArrayList<>();
        pasajeros.add(pasajero);
        return pasajeros;
    }

    @Override
    public String toString() {
        return "Pasajero [dni=" + dni + ", edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido
                + ", direccion=" + direccion + "]";
    }
}
