package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This is an Ex2 class. It reads two numbers from user input.
 * The first number is a value, and the second number is a percentage to be calculated from the value.
 * Then it calculates and outputs the result.
 */
public class Ex2 {
    /**
     * The main method which executes the program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        double value = getValidDoubleInput("Please enter a value:", scanner);

        double percentage;
        do {
            percentage = getValidDoubleInput("Please enter a percentage:", scanner);
            if (percentage < 0 || percentage > 100) {
                System.out.println("Invalid input. Percentage must be between 0 and 100. Please try again.");
            }
        } while (percentage < 0 || percentage > 100);

        // Calculate the result.
        double result = calculatePercentage(value, percentage);

        // Output the result.
        System.out.println("The result is: " + result);
    }

    /**
     * This method prompts the user for input until a valid double is entered.
     *
     * @param message the prompt message
     * @param scanner the Scanner object to read user input
     * @return the valid user input
     */
    public static double getValidDoubleInput(String message, Scanner scanner) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();  // Discard the invalid input.
            }
        }
    }

    /**
     * This method calculates a percentage of a given value.
     *
     * @param value      the value to calculate percentage from
     * @param percentage the percentage to be calculated
     * @return the result of the percentage calculation
     */
    public static double calculatePercentage(double value, double percentage) {
        return (value * percentage) / 100;
    }
}