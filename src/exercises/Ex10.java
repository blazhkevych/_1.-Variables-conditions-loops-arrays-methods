package exercises;

import java.util.Arrays;
import java.util.Random;

/**
 * This class demonstrates how to filter arrays based on different conditions.
 */
public class Ex10 {

    // Line break limit when printing the array
    private static final int LINE_BREAK = 10;
    public static void main(String[] args) {
        //Initializing the array with random numbers
        Random random = new Random();
        int[] arr = random.ints(100L, -100, 100).toArray();

        //Printing the source array
        System.out.println("Source array: ");
        printArrayInFormat(arr);

        //Filtering and printing arrays
        int[] evenNumbersArray = filterEvenNumbers(arr);
        System.out.println("\nEven numbers array: ");
        printArrayInFormat(evenNumbersArray);

        int[] oddNumbersArray = filterOddNumbers(arr);
        System.out.println("\nOdd numbers array: ");
        printArrayInFormat(oddNumbersArray);

        int[] negativeNumbersArray = filterNegativeNumbers(arr);
        System.out.println("\nNegative numbers array: ");
        printArrayInFormat(negativeNumbersArray);

        int[] positiveNumbersArray = filterPositiveNumbers(arr);
        System.out.println("\nPositive numbers array: ");
        printArrayInFormat(positiveNumbersArray);
    }

    /**
     * Filters even numbers from an input array.
     *
     * @param arr input array
     * @return array of even numbers
     */
    private static int[] filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    /**
     * Filters odd numbers from an input array.
     *
     * @param arr input array
     * @return array of odd numbers
     */
    private static int[] filterOddNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n % 2 != 0)
                .toArray();
    }

    /**
     * Filters negative numbers from an input array.
     *
     * @param arr input array
     * @return array of negative numbers
     */
    private static int[] filterNegativeNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n < 0)
                .toArray();
    }

    /**
     * Filters positive numbers from an input array.
     *
     * @param arr input array
     * @return array of positive numbers
     */
    private static int[] filterPositiveNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n > 0)
                .toArray();
    }

    /**
     * Prints the array elements in a formatted way, 10 elements per line.
     *
     * @param arr input array
     */
    private static void printArrayInFormat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%5d ", arr[i]);
            if ((i + 1) % LINE_BREAK == 0) {
                System.out.println();
            }
        }
    }
}
