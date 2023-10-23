
public class Estudiante {
    private int id;
    private String nombreCompleto;
    private double promedio;
    private Boolean presentismo;

    // contructor vacio
    // se puede llamar a este metodo para crear un objeto

    public Estudiante() {
    }

    // contructor con los parametros de los atributos
    public Estudiante(int id, String nombreCompleto, double promedio, Boolean presentismo) {
        // this palabra reservada( hace referencia a uno mismo) contructor
        this.id = id; //
        this.nombreCompleto = nombreCompleto;
        this.promedio = promedio;
        this.presentismo = presentismo;
    }

    // get (obtener)
    // set (modificar)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Boolean getPresentismo() {
        return presentismo;
    }

    public void setPresentismo(Boolean presentismo) {
        this.presentismo = presentismo;
    }

    public static void saludar() {
        System.out.println("hola ");

    }

    @Override
    public String toString() {
        return "Estudiante [id = " + id + ", nombreCompleto = " + nombreCompleto + ", promedio = " + promedio
                + ", presentismo = " + presentismo + "]";
    }

}
