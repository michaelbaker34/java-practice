package fileIo;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.*;

public class FileIoPractice {

    private static final String directory = "fileIo";
    private static final String filename = "people.txt";
    public static final Path p = Paths.get("src", directory, filename);

    public static void deleteEntry(String name) {
        try {
            List<String> lines = Files.readAllLines(p);
            for (String line : lines) {
                if (line.equalsIgnoreCase(name)) {
                    lines.remove(name);
                }
            }
            Files.write(p, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {

//        deleteEntry("Justin");

//        String directory = "fileIo";
//        String filename = "people.txt";
//
//        Path p = Paths.get("src", directory, filename);
//        List<String> lines = new ArrayList<>();

// read file at path p
//        try {
//            lines = Files.readAllLines(p);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (String name : lines) {
//            System.out.printf("%s works at Codeup.%n", name);
//        }

// create new lines of strings
        List<String> newLines = Arrays.asList("Sabrina", "Emily", "Yasin", "Ann");
// try to write new lines to file at path p
//        try {
//            Files.write(p, newLines);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

}
