package edu.isu.cs2263.hw01;

import java.util.Scanner;

/**
 * A simple Java class that uses an infinite loop to get expressions from the user
 *
 * @author Zackary Beck
 */
public class InputFromCommandLine implements InputInterface {

    private final Scanner scanner = new Scanner(System.in);

    /**
     * A constructor that calls the run method when an object is instantiated
     */
    public InputFromCommandLine() {
        read();
    }

    /**
     * Uses an infinite loop to get expressions from the user. Sends expressions to the evaluate class to be evaluated
     */
    public void read() {
        String expression;
        boolean run = true;

        while (run) {
            expression = scanner.nextLine();

            if (expression.equals("quit")) {
                run = false;
            } else {
                new Evaluate(expression);
            }
        }
    }
}
