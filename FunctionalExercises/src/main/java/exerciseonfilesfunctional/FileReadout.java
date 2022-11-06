package exerciseonfilesfunctional;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileReadout {
    public static void main(String[] args) {
        // if there is a way to get a stream of the lines from the file
        // we can use filter and reduce

        // reduce comes in many flavors. There are some specialized reduce functions

        // Functional programming relies on lazy evaluation for performance
        // Lazy evaluation relies on immutability for correctness
        // So, functional programming relies on immutability
        try {
            String searchWord = "consectetur";
            URL resource = exerciseonfilesimperative.FileReadout.class.getClassLoader().getResource("file_to_find_words.txt");
            String path = resource.getFile().toString().replace("/", "\\").substring(1);        // Windows path conversion needed for Files

            long count = Files.lines(Paths.get(path))
                    .filter(line -> line.contains(searchWord))          // filter
                    .count();                                           // reduce

            System.out.printf("********** The word %s occurred %d times\n", searchWord, count);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}



