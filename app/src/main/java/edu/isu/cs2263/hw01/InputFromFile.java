package edu.isu.cs2263.hw01;

import java.io.*;
import java.util.Scanner;

/**
 * A Java class that reads single-line expressions from a text file and sends them to be evaluated
 */
public class InputFromFile implements InputInterface {
    /**
     * Takes the file name/path given in the command line arguments and sends to it be read
     *
     * @param filePath Path/name of the file given in the command line arguments
     */

    String filePath;

    public InputFromFile(String filePath) {
        this.filePath = filePath;
        read();
    }

    /**
     * Reads each line in the given file and sends them to the evaluate class to be evaluated.
     * If the user specified file path cannot be found a FileNotFoundException is thrown by the File class
     */
    public void read() {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                String expression = scanner.nextLine();
                new Evaluate(expression);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
