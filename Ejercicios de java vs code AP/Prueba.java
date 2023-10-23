
import java.util.Scanner; // Import the Scanner class

public class Prueba {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username");
        System.out.println("ingrese edad");

        int edad = myObj.nextInt();
        System.out.println("su edad es: " + edad);

        String userName = myObj.nextLine(); // Read user input
        System.out.println("Username is: " + userName); // Output user input
    }
}
