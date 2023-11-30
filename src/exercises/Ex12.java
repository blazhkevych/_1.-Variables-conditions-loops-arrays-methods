package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * The Ex12 class hosts the sorting logic.
 */
public class Ex12 {
    /**
     * The enum Order describes the sorting order.
     * ASC for ascending and DESC for descending.
     */
    public enum Order {
        DESC
    }

    /**
     * Sorts the provided array in the provided order.
     *
     * @param arr   The array to be sorted.
     * @param order The order to sort the array in.
     * @return The sorted array.
     */
    public static int[] sortArray(int[] arr, Order order) {
        int[] sortedArray = arr.clone();
        java.util.Arrays.sort(sortedArray);

        if (order == Order.DESC) {
            for (int i = 0; i < sortedArray.length / 2; i++) {
                int temp = sortedArray[i];
                sortedArray[i] = sortedArray[sortedArray.length - i - 1];
                sortedArray[sortedArray.length - i - 1] = temp;
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        System.out.println("The original array is:");
        System.out.println(Arrays.toString(array));

        System.out.println("Enter the order of sorting (ASC/DESC):");
        Order order = Order.valueOf(input.next().toUpperCase());

        int[] sortedArray = sortArray(array, order);

        System.out.println("The sorted array in " + order + " order is:");
        System.out.println(Arrays.toString(sortedArray));
    }
}
