package day060;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {
    public static void main(String[] args) throws IOException {

        //Reading a file is only one line of code
        //It returns list of String

        List<String> allLines= Files.readAllLines(Paths.get("src/day060/note.txt"));
        //System.out.println(allLines);
        for (String eachLine: allLines){
            System.out.println(eachLine);
        }
    }
}
