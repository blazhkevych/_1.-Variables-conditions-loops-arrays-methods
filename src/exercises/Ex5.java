package exercises;

import java.util.Scanner;

/**
 * This class is used to identify the season based on the month number entered by user
 */
public class Ex5 {
    /**
     * Main method
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the month number (from 1 to 12): ");

        int monthNumber = scanner.nextInt();

        // Checking the validity of the entered number
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("The entered number is not in the range from 1 to 12. Please enter a valid month number.");
            return;
        }

        String season = switch (monthNumber) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid month number";
        };

        System.out.println("The season is: " + season);
    }
}
