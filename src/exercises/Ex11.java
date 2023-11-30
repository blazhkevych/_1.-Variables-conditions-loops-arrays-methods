package exercises;

import java.util.Scanner;

/**
 * This class provides a method to print a line of specified length, direction, and character.
 */
public class Ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the line: ");
        int length = sc.nextInt();

        System.out.print("Enter the direction of the line (H for horizontal, V for vertical): ");
        String direction = sc.next();

        System.out.print("Enter the character to draw the line: ");
        char character = sc.next().charAt(0); // Get the first character of the string

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
        // Check if the direction is horizontal
        if ("H".equalsIgnoreCase(direction)) {
            // If horizontal, print a horizontal line
            for (int i = 0; i < length; i++) {
                System.out.print(character); // print character without a newline
            }
        } else if ("V".equalsIgnoreCase(direction)) {
            // If vertical, print a vertical line
            for (int i = 0; i < length; i++) {
                System.out.println(character); // print character with a newline
            }
        } else {
            // If the direction is not recognized, print an error message
            System.out.println("Invalid direction. Use 'H' for horizontal and 'V' for vertical.");
        }
    }
}
