package exercises;

import java.util.Scanner;

/**
 * This is a solution for the task of displaying all odd numbers in the input range.
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the numbers
        System.out.println("Please enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Please enter the second number:");
        int number2 = scanner.nextInt();

        // Determine the start and end of the range
        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);

        // Display all odd numbers within the range
        System.out.println("The odd numbers are:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
