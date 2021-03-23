import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.*;

public class FileIoPractice {

/*  - write code in the main method that prints the following messages:
    “Justin works at Codeup.”
    “Casey works at Codeup.”
    “Ry works at Codeup.”
    “David works at Codeup.”
    - create an array list of new names for the people in your breakout room
    - add code to your main method that replaces the contents of `people.txt`
    with the people in your breakout room
    - set the contents of the text file back to Codeup staff
    - create a static method, `deleteEntry`, that takes in the name of someone (a string)
    and when invoked, rewrites a new list to the `people.txt` file with all entries
    except the passed in name (bonus: make the name to delete case insensitive) */

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

        deleteEntry("Justin");

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
//        List<String> newLines = Arrays.asList("Sabrina", "Emily", "Yasin", "Ann");
// try to write new lines to file at path p
//        try {
//            Files.write(p, newLines);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

}
