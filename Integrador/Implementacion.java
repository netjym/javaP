
// import java.util.List;
import java.util.Scanner;

public class Implementacion {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dni: ");
        int dni = sc.nextInt();

        System.out.println("Ingrese nombre: ");
        String nombre = sc.next();

        System.out.println("Introduce apellido: ");
        String apellido = sc.next();

        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();

        System.out.println("Introduzca el Genero: ");
        String sexo = sc.next().toUpperCase();

        switch (sexo) {
            case "H":
                System.out.println("Hombre");
                break;
            case "M":
                System.out.println("Mujer");
                break;
            case "O":
                System.out.println("Otro");
                break;
            default:
                System.out.println("El genero es incorrecto");
                break;
        }

        System.out.println("Introduce peso: ");
        double peso = sc.nextInt();

        System.out.println("Introduce altura: ");
        double altura = sc.nextInt();

        Persona persona = new Persona(dni, nombre, apellido, edad, sexo, peso, altura);

        System.out.println(persona);

        System.out.println(calcularIMC(peso, altura));

        System.out.println("Es mayor de edad? " + esMayorDeEdad(edad));

    }

    public static double calcularIMC(double peso, double altura) {
        double imc = peso / ((altura / 100.0) * 2);
        imc = Math.round(imc * 100.0) / 100.0;

        System.out.println("el indice de masa corporal es de:" + imc);

        if (imc < 20) {
            System.out.println("Bajo peso");
            return -1;// PESO_BAJO;

        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Peso ideal");
            return 0;// PESO_IDEAL;

        } else {
            System.out.println("Sobre peso");
            return 1;// SOBREPESO;
        }

    }

    public static boolean esMayorDeEdad(int edad) {

        return edad >= 18;
    }

}
/*
 * 
 * 
 * 
 * Realizar una clase llamada Persona que tenga los siguientes atributos: DNI,
 * nombre, apellido,
 * edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno
 * desea añadir algún otro
 * atributo, puede hacerlo.
 * ********************************************************
 * Los métodos que se implementarán son:
 * • Un constructor por defecto.
 * • Un constructor con todos los atributos como parámetro.
 * • Métodos getters y setters de cada atributo.
 * • Método estático crearPersona(): el método crear persona, le pide los
 * valores de los atributos
 * al usuario y después se le asignan a sus respectivos atributos para llenar el
 * objeto
 * Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H,
 * M o
 * O. Si no es correcto se deberá mostrar un mensaje. Devuelve la Persona
 * creada.
 * ********************************************************************
 * 
 * • Método calcularIMC(): calculara si la persona está en su peso ideal (peso
 * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, la función
 * devuelve un -1. Si
 * esta fórmula da por resultado un valor menor que 20, la función devuelve un
 * -1 significa que el
 * peso está por debajo del peso ideal. Si la fórmula da por resultado un número
 * entre 20 y 25
 * (incluidos), significa que el peso es el ideal y la función devuelve un 0.
 * Finalmente, si el
 * resultado de la fórmula es un valor mayor que 25 significa que la persona
 * tiene sobrepeso, y la
 * función devuelve un 1. Se recomienda hacer uso de constantes para devolver
 * estos valores.
 * 
 * *************************************************************************
 * • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano.
 * **************************************************************************
 * 
 * • Método estático buscarPorDni(): recibe como parámetros una colección de
 * personas y un DNI
 * y busca la persona según su DNI y la devuelve.
 * **************************************************************************
 * A continuación, en la clase App/main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, guardarlos en una
 * colección, a
 * continuación, llamaremos todos los métodos para cada objeto, deberá comprobar
 * si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada
 * objeto si la persona es mayor de edad. Puedes crear estas funciones como
 * métodos y llamarlas
 * con cada objeto o hacerlo todo en el App/main.
 */