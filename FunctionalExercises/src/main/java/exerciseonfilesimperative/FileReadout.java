package exerciseonfilesimperative;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;


public class FileReadout {
    public static void main(String[] args) {
        try {
            String searchWord = " elit";
            URL resource = FileReadout.class.getClassLoader().getResource("file_to_find_words.txt");
            long count = 0;
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(resource.getFile()));

            String line = null;

            while((line = bufferedReader.readLine()) != null) {
                if(line.contains(searchWord)) {
                    count++;
                }
            }

            System.out.println("------->>>>> Times found: " + count + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



