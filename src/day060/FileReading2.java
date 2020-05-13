package day060;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReading2 {
    public static void main(String[] args) throws IOException {
        try {
    List<String> allLines = Files.readAllLines(Paths.get("src/day060/note.txt"));
    //System.out.println(allLines);
    for (String each : allLines) {
        System.out.println(each);
    }
    }catch(NoSuchFileException e){
    System.out.println("We caught NoSuchFileException");
   System.out.println(e.getMessage());
}


    }
}
