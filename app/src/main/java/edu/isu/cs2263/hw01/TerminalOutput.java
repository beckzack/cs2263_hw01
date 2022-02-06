package edu.isu.cs2263.hw01;

/**
 * A simple Java class to output an int to the command line
 *
 * @author Zackary Beck
 */
public class TerminalOutput implements OutputInterface{
    /**
     * Constructs a TerminalOutput object and calls the outputResult method using the given expression and result
     *
     * @param expression Expression that returned the given int result
     * @param result The result of the expression
     */
    public TerminalOutput(String expression, int result) {
        outputResult(expression, result);
    }

    /**
     * Outputs the result to the command line with a tabbed arrow format
     *
     * @param expression Expression string to be output
     * @param result Result of the expression when evaluated from left to right
     */
    public void outputResult(String expression, int result) {
        System.out.println("\t-> " + result);
    }
}
