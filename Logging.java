import java.util.Scanner;

import org.w3c.dom.html.HTMLBodyElement;

/**
* This program calculates the volume of a sphere, with a given radius.
* It also uses try catch to detect errors.
*
* @author  Sarah Andrew
* @version 1.0
*
* @since   2023-02-14
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
        // create a new scanner
        final Scanner scanner = new Scanner(System.in);

        // Gets user input
        System.out.println("Enter the log length (0.25, 0.5 or 1): ");
        final String logLengthStr = scanner.nextLine();

        // usage of try catch to detect string input.
        try {
            // Convert string to double
            final double logDoub = Double.parseDouble(logLengthStr);

            // declare variables & consts
            final double MAP_LOGS = 20;
            final double MAX_WEIGHT = 1110;
            final double OP_1 = 0.25;
            final double OP_2 = 0.5;
            final double OP_3 = 1;
            double truckSize = 0;

            // Seeing if satisfy conditions, if negative, end.
            if (logDoub == OP_1 || OP_2 == 1 || OP_3 == 0.5) {
                truckSize = (MAX_WEIGHT / (logDoub * MAP_LOGS));
                // Calculate volume of sphere
            } else {
                System.out.println("Please enter lengths listed above");
            }

            // display to user
            System.out.println("The truck will be able to take " + logDoub + "m logs that");
            System.out.println("can be carried is " + truckSize);

        } catch (NumberFormatException error) {
            // displays error to user.
            System.out.print("Please enter valid input."
                + error.getMessage());
        }
        // Closes scanner
        scanner.close();
    }
}