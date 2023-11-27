package exercises;

import java.util.Scanner;

/**
 * This class Ex4 switches the first and the sixth digits,
 * and the second and the fifth digits in a six-digit number provided by the user.
 */
public class Ex4 {
    /**
     * The main method which executes the program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new Scanner object.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a six-digit number.
        System.out.println("Please enter a six-digit number:");
        int number = scanner.nextInt();

        if (number < 100000 || number > 999999) {
            System.out.println("Invalid input! Please enter a six-digit number.");
        } else {
            // Perform the digit swapping.
            int result = switchDigits(number);

            // Output the resulting number.
            System.out.println("The resulting number after swapping is: " + result);
        }
    }

    /**
     * This method switches the first and last digits, and the second and fifth digits of a six-digit number.
     *
     * @param number the six-digit number to perform the swapping on
     * @return the number obtained after swapping the digits
     */
    public static int switchDigits(int number) {
        int[] digits = new int[6];

        // Extract the digits.
        for (int i = 5; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Switch the digits.
        int temp = digits[0];
        digits[0] = digits[5];
        digits[5] = temp;

        temp = digits[1];
        digits[1] = digits[4];
        digits[4] = temp;

        // Form the new number.
        int newNumber = 0;
        for (int i = 0; i < 6; i++) {
            newNumber = newNumber * 10 + digits[i];
        }

        return newNumber;
    }
}
