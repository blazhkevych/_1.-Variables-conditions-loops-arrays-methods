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
        System.out.println("Please enter the first digit:");
        int firstDigit = scanner.nextInt();

        // Prompt the user to enter the second digit.
        System.out.println("Please enter the second digit:");
        int secondDigit = scanner.nextInt();

        // Prompt the user to enter the third digit.
        System.out.println("Please enter the third digit:");
        int thirdDigit = scanner.nextInt();

        // Form the number using the entered digits.
        int result = makeNumber(firstDigit, secondDigit, thirdDigit);

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
    public static int makeNumber(int firstDigit, int secondDigit, int thirdDigit) {
        return firstDigit * 100 + secondDigit * 10 + thirdDigit;
    }
}
