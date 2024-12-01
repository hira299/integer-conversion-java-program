package bank_account;
import java.util.Scanner;

public class Labbb14 {
    public static void main(String[] args) {
        // Displaying a brief introduction
        System.out.println("LAB 14 - Integer Conversion Program");

        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking integer input from the user
        System.out.print("Enter an integer value: ");
        int userInput = scanner.nextInt();

        // Converting the integer to binary, hexadecimal, and octal using Integer wrapper class methods
        String binary = Integer.toBinaryString(userInput);
        String hexadecimal = Integer.toHexString(userInput);
        String octal = Integer.toOctalString(userInput);

        // Displaying the converted values
        System.out.println("Binary representation: " + binary);
        System.out.println("Hexadecimal representation: " + hexadecimal.toUpperCase());
        System.out.println("Octal representation: " + octal);

        // Closing the scanner
        scanner.close();
    }
}
