package exercises;

import java.util.Scanner;

/**
 * This class is designed to display Multiplication Table
 * for a range specified by the user.
 */
public class Ex8 {
    /**
     * Generate and print multiplication tables in the range start to end inclusively.
     *
     * @param start Start of the range for which multiplication tables are to be printed
     * @param end   End of the range for which multiplication tables are to be printed
     */
    public static void printTables(int start, int end) {

        for (int i = start; i <= end; i++) {
            System.out.println("Multiplication table for " + i);
            printTable(i);
            System.out.println();
        }
    }

    /**
     * Generate and print a multiplication table for a number.
     *
     * @param number The number for which to print the multiplication table
     */
    public static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
    }

    /**
     * Main method to start the program. Reads user inputs and calls
     * printTables method to generate multiplication tables.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the start of the range:");
        int start = scanner.nextInt();
        System.out.println("Please enter the end of the range:");
        int end = scanner.nextInt();
        printTables(start, end);
    }
}
