import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double distancia, velocidad, tiempo;

        System.out.println("ingrese el valor de distancia en klm");
        distancia = input.nextDouble();
        System.out.println("ingrese velocidad en klm/h");
        velocidad = input.nextDouble();
        tiempo = distancia / velocidad;
        System.out.println(
                "el tiempo que tardara en recorrer: " + distancia + "kilometros es de : " + tiempo + "horas: ");
    }
}
