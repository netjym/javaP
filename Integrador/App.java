
public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona(20416708, "carlos", "Muñoz", 40, "h", 86, 180);
        System.out.println(persona1);

        Persona persona2 = new Persona(42780900, "Camila", "Perez", 21, "m", 56, 160);
        System.out.println(persona2);

        Persona persona3 = new Persona(38940550, "Ezequiel", "Palacios", 24, "H", 70, 177);
        System.out.println(persona3);

        Persona persona4 = new Persona(17456263, "Marta", "Alcaraz", 56, "o", 60, 160);
        System.out.println(persona4);
    }

}
/*
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