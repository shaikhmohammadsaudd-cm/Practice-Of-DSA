package assigment;

import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! I miss you");

        // Close the scanner to release resources
        scanner.close();
    }
}
