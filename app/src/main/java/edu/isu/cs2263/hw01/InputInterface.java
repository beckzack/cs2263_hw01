package edu.isu.cs2263.hw01;

/**
 * A simple interface for getting input
 *
 * @author Zackary Beck
 */
public interface InputInterface {
    /**
     * Either uses an infinite loop to get input from the user or reads the input from a given text file
     *
     * @param filePath The path of the given file (if -o option was provided)
     */
    void read(String filePath);
}
