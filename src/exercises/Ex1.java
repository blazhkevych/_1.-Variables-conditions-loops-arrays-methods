package exercises;

/**
 * This is a class that prints the provided lines with increasing indentation.
 */
public class Ex1 {
    /**
     * The main method which executes the program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The quoted text to be printed.
        String[] lines = {
                "Your time is limited,",
                "so don’t waste it",
                "living someone else’s life",
                "Steve Jobs"
        };

        // Prints the lines with increasing indentation.
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            System.out.println(lines[i]);
        }
    }
}