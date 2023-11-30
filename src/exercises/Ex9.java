package exercises;

import java.util.Random;

/**
 * The class is designed to provide various statistical data about a one-dimensional array filled with random numbers.
 */
public class Ex9 {
    private static final int ARRAY_SIZE = 100;
    private static final int RANDOM_BOUND = 100; // Includes numbers from -100 to 100

    /**
     * Main method initializes an array with random numbers and calls methods
     * to print statistics about the array.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = random.ints(ARRAY_SIZE, -RANDOM_BOUND, RANDOM_BOUND).toArray();

        printArray(array);

        System.out.println("Min element: " + findMinElement(array));
        System.out.println("Max element: " + findMaxElement(array));
        System.out.println("Number of negative elements: " + countNegatives(array));
        System.out.println("Number of positive elements: " + countPositives(array));
        System.out.println("Number of zeroes: " + countZeroes(array));
    }

    /**
     * Finds the minimum element in an array
     *
     * @param array an array of integer values
     * @return minimum element of the array
     */
    public static int findMinElement(int[] array) {
        int minElement = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < minElement) {
                minElement = value;
            }
        }
        return minElement;
    }

    /**
     * Finds the maximum element in an array
     *
     * @param array an array of integer values
     * @return maximum element of the array
     */
    public static int findMaxElement(int[] array) {
        int maxElement = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > maxElement) {
                maxElement = value;
            }
        }
        return maxElement;
    }

    /**
     * Counts the number of negative elements in an array
     *
     * @param array an array of integer values
     * @return number of negative elements in the array
     */
    public static int countNegatives(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value < 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Counts the number of positive elements in an array
     *
     * @param array an array of integer values
     * @return number of positive elements in the array
     */
    public static int countPositives(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value > 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Counts the number of zero elements in an array
     *
     * @param array an array of integer values
     * @return number of zero elements in the array
     */
    public static int countZeroes(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method prints the elements of the provided array according to the conditions:
     * - The minimum element is printed in red.
     * - The maximum element is printed in purple.
     * - Positive numbers are printed in blue.
     * - Negative numbers are printed in yellow.
     * - Zeroes are printed in green.
     * <p>
     * Every 10 elements a new line is started, to keep the output clean and readable.
     *
     * @param array The array of integers which elements are to be printed.
     */
    public static void printArray(int[] array) {
        System.out.println("Array elements:");
        int minElement = findMinElement(array);
        int maxElement = findMaxElement(array);

        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            if (array[i] == minElement) {
                System.out.printf("\033[31m%5d\033[0m ", array[i]);      // red for a minimum
            } else if (array[i] == maxElement) {
                System.out.printf("\033[35m%5d\033[0m ", array[i]);      // purple for maximum
            } else if (array[i] > 0) {
                System.out.printf("\033[34m%5d\033[0m ", array[i]);      // blue for positives
            } else if (array[i] < 0) {
                System.out.printf("\033[33m%5d\033[0m ", array[i]);      // yellow for negatives
            } else {
                System.out.printf("\033[32m%5d\033[0m ", array[i]);      // green for zeroes
            }
        }
        System.out.println();
    }
}
