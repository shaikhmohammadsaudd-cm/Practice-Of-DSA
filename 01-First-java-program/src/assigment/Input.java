package assigment;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
            // Create a Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Hello, " + name + "! Welcome to Java programming.");

            // Close the scanner to release resources
            scanner.close();
    }
}