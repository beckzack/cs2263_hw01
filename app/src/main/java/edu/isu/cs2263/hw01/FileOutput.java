package edu.isu.cs2263.hw01;

import java.io.*;

/**
 * A simple Java class that outputs an expression and its results to both a user-specified file and the command line
 *
 * @author Zackary Beck
 */
public class FileOutput implements OutputInterface {

    private String filePath;

    /**
     * Constructs an object of type FileOutput using the given file path
     *
     * @param filePath The path to the file to output expressions and results to
     */
    public FileOutput(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Outputs the expression and result to the given file if it already exists. If it doesn't already exist, it creates
     * a new file with the given name and outputs to that
     *
     * @param expression Expression string to be output
     * @param result Result of the expression when evaluated from left to right
     */
    public void outputResult(String expression, int result) {
        try {
            File file = new File(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

            if (file.createNewFile()) { // returns true if the file does not already exist and creates the file in one go
                bufferedWriter.write(expression + "\n\t-> " + result);
                bufferedWriter.newLine();
                System.out.println("\t-> " + result);
            } else {
                bufferedWriter.write(expression + "\n\t-> " + result);
                bufferedWriter.newLine();
                System.out.println("\t-> " + result);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
