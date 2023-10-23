import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia [radio=" + radio + "]";
    }

    public void crearCircunferencia(double radio) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese radio");

        double valorCircunferencia = sc.nextDouble();

        this.radio = valorCircunferencia;
    }

    // public static double area() {
    // boolean Area = (Math.PI * radio);
    // return Area;
    // }
}
/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el
 * radio
 * de tipo real. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 * c) Método para crearCircunferencia (): que le pide el radio y lo guarda en el
 * atributo del
 * objeto.
 * d) Método área (): para calcular el área de la circunferencia (Area = π ∗
 * radio!) y que luego
 * muestre en pantalla el resultado
 * e) Método perímetro (): para calcular el perímetro (Perimetro = 2 ∗ π ∗
 * radio) y que
 * devuelva ese valor y mostrarlo desde el método main de mi clase principal.
 */