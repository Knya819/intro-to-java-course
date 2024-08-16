package com.cbfacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileManager {

    /**
     * Reads the contents of the file specified by filename and returns a List<String>
     * where each item in the list represents a line from the file.
     *
     * @param filename the relative path of the file to read from the repository root
     * @return a List<String> containing each line of the file
     * @throws IOException if an I/O error occurs reading from the file
     */
    public List<String> readFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        return Files.readAllLines(path);
    }

    /**
     * Copies the contents of the file at inputFile path to the outputFile path.
     * Creates the outputFile if it doesn't exist, and overwrites it if it does.
     *
     * @param inputFile  the relative path of the file to copy from the repository root
     * @param outputFile the relative path of the file to copy to the repository root
     * @throws IOException if an I/O error occurs during the file copy
     */
    public void copy(String inputFile, String outputFile) throws IOException {
        Path sourcePath = Paths.get(inputFile);
        Path targetPath = Paths.get(outputFile);
        Files.createDirectories(targetPath.getParent());
        Files.copy(sourcePath, targetPath, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    }

    /**
     * Reads lines from the inputFile, reverses their order, and writes them to the outputFile.
     * Creates the outputFile if it doesn't exist, and overwrites it if it does.
     *
     * @param inputFile  the relative path of the file to read from the repository root
     * @param outputFile the relative path of the file to write to the repository root
     * @throws IOException if an I/O error occurs during reading or writing
     */
    public void reverseLines(String inputFile, String outputFile) throws IOException {
        // Resolve paths relative to the root of the repository
        Path sourcePath = Paths.get(inputFile);
        Path targetPath = Paths.get(outputFile);

        // Read all lines from the input file
        List<String> lines = Files.readAllLines(sourcePath);

        // Reverse the order of the lines
        Collections.reverse(lines);

        // Ensure the parent directory of the output file exists
        Files.createDirectories(targetPath.getParent());

        // Write the reversed lines to the output file
        Files.write(targetPath, lines);
    }
}
