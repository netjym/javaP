
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante1 = new Estudiante(1, " nicolas toledo", 4.0, true);
        Estudiante estudiante2 = new Estudiante(2, " sofia cuenca", 5.5, true);
        System.out.println("el id del estudiante 1 es: " + estudiante1.getId());
        System.out.println("el id del estudiante 2 es: " + estudiante2.getId());

        System.out.println("la ficha del estudiante " + estudiante1.getId() + " es " + estudiante1.toString());
        // System.out.println(estudiante1.toString() + " \n" + estudiante2.toString());

    }

}
