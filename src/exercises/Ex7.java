package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int number1 = 0;
        int number2 = 0;

        while(!validInput) {
            try {
                System.out.println("Please enter the first number:");
                number1 = scanner.nextInt();

                System.out.println("Please enter the second number:");
                number2 = scanner.nextInt();

                validInput = true;
            } catch(InputMismatchException e) {
                System.out.println("Invalid input, please enter an integer.");
                scanner.nextLine();
            }
        }

        int start = Math.min(number1, number2);
        int end = Math.max(number1, number2);

        boolean hasOdd = false;
        System.out.println("The odd numbers are:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                hasOdd = true;
            }
        }

        if (!hasOdd) {
            System.out.println("There are no odd numbers in the given range.");
        }
    }
}