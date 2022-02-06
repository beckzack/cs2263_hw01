package edu.isu.cs2263.hw01;

import java.io.*;
import java.util.Scanner;

/**
 * A Java class that reads single-line expressions from a text file and sends them to be evaluated
 *
 * @author Zackary Beck
 */
public class InputFromFile implements InputInterface {

    /**
     * Takes the file name/path given in the command line arguments and sends to it be read
     *
     * @param filePath Path of the user provided file
     */
    public InputFromFile(String filePath) {
        read(filePath);
    }

    /**
     * Reads each line in the given file and sends them to the evaluate class to be evaluated.
     * If the user specified file path cannot be found a FileNotFoundException is thrown by the File class
     *
     * @param filePath Path of the file to be read from
     */
    public void read(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                String expression = scanner.nextLine();
                Evaluate evaluate = new Evaluate(expression);
                new TerminalOutput(expression, evaluate.getFinalResult());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
