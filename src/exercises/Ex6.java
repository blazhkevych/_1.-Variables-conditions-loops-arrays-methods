package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This class is used to convert meters into various other units (miles, inches, yards)
 */
public class Ex6 {
    /**
     * Main method
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##########");  // Adjust as needed

        System.out.println("Please enter the distance in meters: ");

        double meters = scanner.nextDouble();

        System.out.println("Please select the unit you want to convert to (1. Miles, 2. Inches, 3. Yards): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                //1 meter = 0.000621371 miles
                double miles = meters * 0.000621371;
                System.out.println(meters + " meters = " + df.format(miles) + " miles");
                break;
            case 2:
                //1 meter = 39.3701 inches
                double inches = meters * 39.3701;
                System.out.println(meters + " meters = " + inches + " inches");
                break;
            case 3:
                //1 meter = 1.09361 yards
                double yards = meters * 1.09361;
                System.out.println(meters + " meters = " + yards + " yards");
                break;
            default:
                System.out.println("Invalid option selected");
                break;
        }

        scanner.close();
    }
}
