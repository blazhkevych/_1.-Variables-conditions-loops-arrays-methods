package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class provides a method to print a line of specified length, direction, and character.
 * It now also includes data validation to ensure the input is valid.
 */
public class Ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 0;
        String direction = "";
        char character;

        // Validate the length
        boolean validLength = false;
        while (!validLength) {
            try {
                System.out.print("Enter the length of the line: ");
                length = sc.nextInt();

                if (length >= 0) {
                    validLength = true;
                } else {
                    System.out.println("Invalid input, length should be 0 or more.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an integer.");
                sc.next();
            }
        }

        // Validate the direction
        while (!direction.equalsIgnoreCase("H") && !direction.equalsIgnoreCase("V")) {
            System.out.print("Enter the direction of the line (H for horizontal, V for vertical): ");
            direction = sc.next();

            if (!direction.equalsIgnoreCase("H") && !direction.equalsIgnoreCase("V")) {
                System.out.println("Invalid direction. Use 'H' for horizontal and 'V' for vertical.");
            }
        }

        System.out.print("Enter the character to draw the line: ");
        character = sc.next().charAt(0); // Get the first character of the string

        printLine(length, direction, character);
    }

    /**
     * This method prints a line of specified length, direction and character.
     *
     * @param length    The length of the line.
     * @param direction The direction of the line ("H" for horizontal, "V" for vertical).
     * @param character The character to be used for the line.
     */
    public static void printLine(int length, String direction, char character) {
        if ("H".equalsIgnoreCase(direction)) {
            for (int i = 0; i < length; i++) {
                System.out.print(character);
            }
            System.out.println(); // Add a newline at the end of the line
        } else if ("V".equalsIgnoreCase(direction)) {
            for (int i = 0; i < length; i++) {
                System.out.println(character);
            }
        }
    }
}