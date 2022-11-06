package exerciseonfilesfunctional;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileReadout {
    public static void main(String[] args) {
        try {
            String searchWord = " elit";
            URL resource = FileReadout.class.getClassLoader().getResource("file_to_find_words.txt");
            long count = Files.lines(Paths.get(resource.getFile()))
                    .filter(line -> line.contains(searchWord))          // filter
                    .count();                                           // reduce

            System.out.printf("The word %s occured %d times\n", searchWord, count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}



