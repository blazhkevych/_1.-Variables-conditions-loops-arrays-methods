package exercises;

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

        // Prompt the user to enter a value.
        System.out.println("Please enter a value:");
        double value = scanner.nextDouble();

        // Prompt the user to enter a percentage.
        System.out.println("Please enter a percentage:");
        double percentage = scanner.nextDouble();

        // Calculate the result.
        double result = calculatePercentage(value, percentage);

        // Output the result.
        System.out.println("The result is: " + result);
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
