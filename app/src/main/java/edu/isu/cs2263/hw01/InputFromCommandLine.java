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
     * Calls the second constructor with NO_FILE as the given path
     */
    public InputFromCommandLine() {
        this("NO_FILE");
    }

    /**
     * A constructor that passes the given file path to the read method
     *
     * @param filePath The user given file (if no file was provided "NO_FILE" is the passed string
     */
    public InputFromCommandLine(String filePath) {
        read(filePath);
    }

    /**
     * Uses an infinite loop to get expressions from the user. Sends expressions to the evaluate class to be evaluated
     */
    public void read(String filePath) {
        String expression;
        boolean run = true;

        while (run) {
            expression = scanner.nextLine();

            if (expression.equals("quit")) {
                run = false;
            } else {
                if (filePath.equals("NO_FILE")) {
                    // Normal output class(eval.getFinalResult)
                    Evaluate evaluate = new Evaluate(expression);
                    new TerminalOutput(expression, evaluate.getFinalResult());
                } else {
                    Evaluate evaluate = new Evaluate(expression);
                    FileOutput fileOutput = new FileOutput(filePath);
                    fileOutput.outputResult(expression, evaluate.getFinalResult());
                }
            }
        }
    }
}
