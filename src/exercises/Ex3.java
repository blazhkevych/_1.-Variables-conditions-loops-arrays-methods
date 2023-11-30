package exercises;

import java.util.Scanner;

/**
 * This class Ex3 prompts a user to input three digits from the keyboard, and
 * forms a number from these digits.
 * The user is supposed to enter each digit separately, one by one.
 */
public class Ex3 {
    /**
     * The main method which executes the program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new Scanner object.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first digit.
        int firstDigit = receiveValidIntegerInput("Please enter the first digit:", scanner);

        // Prompt the user to enter the second digit.
        int secondDigit = receiveValidIntegerInput("Please enter the second digit:", scanner);

        // Prompt the user to enter the third digit.
        int thirdDigit = receiveValidIntegerInput("Please enter the third digit:", scanner);

        // Form the number using the entered digits.
        int result = formNumber(firstDigit, secondDigit, thirdDigit);

        // Output the resulting number.
        System.out.println("The resulting number is: " + result);
    }

    /**
     * This method forms a number from the three provided digits.
     *
     * @param firstDigit  the first digit of the number.
     * @param secondDigit the second digit of the number.
     * @param thirdDigit  the third digit of the number.
     * @return the number formed from the three provided digits.
     */
    public static int formNumber(int firstDigit, int secondDigit, int thirdDigit) {
        return firstDigit * 100 + secondDigit * 10 + thirdDigit;
    }

    /**
     * This method prompts the user for input until a valid int is entered.
     *
     * @param message the prompt message
     * @param scanner the Scanner object to read user input
     * @return the valid user input
     */
    public static int receiveValidIntegerInput(String message, Scanner scanner) {
        System.out.println(message);

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }

        return scanner.nextInt();
    }
}