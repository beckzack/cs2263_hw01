package edu.isu.cs2263.hw01;

/**
 * A simple interface for outputting strings
 *
 * @author Zackary Beck
 */
public interface OutputInterface {
    /**
     * Method to output strings using println
     *
     * @param expression Expression string to be output
     * @param result Result of the expression when evaluated from left to right
     */
    void outputResult(String expression, int result);
}
