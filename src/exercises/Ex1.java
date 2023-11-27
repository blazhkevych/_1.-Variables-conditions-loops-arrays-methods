package exercises;

/**
 * This is an Ex1 class that prints the provided lines with
 * increasing indentation.
 */
public class Ex1 {
    /**
     * The main method which executes the program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is the quoted text that we are going to print,
        // with an increasing indentation starting from the second line.
        String[] lines = {
                "\"Your time is limited,",
                "so don’t waste it",
                "living someone else’s life”",
                "Steve Jobs"
        };

        // We iterate over each line...
        for (int i = 0; i < lines.length; i++) {
            // ... and print i indentation tabs before each line.
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            // Finally, we print the line and move to the next one.
            System.out.println(lines[i]);
        }
    }
}