import java.util.Scanner;

/**
* This program receives the length of logs from user.
* From information given, it calculates how much the truck would be able,
* to contain, with usage of try catch, etc.
*
* @author  Sarah Andrew
* @version 1.0
*
* @since   2023-02-16
*/

public final class Logging {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Create a new scanner
        final Scanner scanner = new Scanner(System.in);

        // Gets user input
        System.out.println("Enter the log length (0.25, 0.5 or 1): ");
        final String logLengthStr = scanner.nextLine();

        // Usage of try catch to detect string input.
        try {
            // Convert string to double
            final double logDoub = Double.parseDouble(logLengthStr);

            // declare variables & constants.
            final double MAP_LOGS = 20;
            final double MAX_WEIGHT = 1110;
            final double OP_1 = 0.25;
            final double OP_2 = 0.5;
            final double OP_3 = 1;

            // Determining amount based on options of logs.
            if (logDoub == OP_1 || logDoub == OP_2 || logDoub == OP_3) {
                // Calculate the max number logs on truck
                final double truckSize = MAX_WEIGHT / (logDoub * MAP_LOGS);

                // Display to user
                System.out.println("The truck will be able to take "
                                  + logDoub + " (m) logs in length ");
                System.out.println("carrying " + truckSize + " logs.");

            // Condition if user enters negative, end.
            } else if (logDoub < 0) {
                System.out.println("Please enter positive digits.");
            } else {
                // Executes when user enters number not specified above.
                System.out.println("Please enter numbers listed above.");
            }

        } catch (NumberFormatException error) {
            // Displays error to user.
            System.out.print("Please enter valid input."
                + error.getMessage());
        }
        // Closes scanner
        scanner.close();
    }
}
