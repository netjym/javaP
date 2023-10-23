public class Practica1 {
    private String perro;
    private int edad;

    public Practica1(String perro, int edad) {
        this.perro = perro;
        this.edad = edad;
    }

    public static void main(String[] args) {
        Practica1 Dog = new Practica1("caniche", 5);
        System.out.println(Dog);

    }

    public String getPerro() {
        return perro;
    }

    public void setPerro(String perro) {
        this.perro = perro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Practica1 [perro=" + perro + ", edad=" + edad + "]";
    }
}