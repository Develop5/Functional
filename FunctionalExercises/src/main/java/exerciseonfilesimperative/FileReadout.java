package exerciseonfilesimperative;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;


public class FileReadout {
    public static void main(String[] args) {
        // open the file
        // for each line check if the searchWord appears
        // count number of lines that meet the above criteria
        try {
            String searchWord = "consectetur";
            URL resource = FileReadout.class.getClassLoader().getResource("file_to_find_words.txt");
            System.out.println("-----> File path: " + resource.getFile());
            long count = 0;
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(resource.getFile()));
            String line = null;
            while((line = bufferedReader.readLine()) != null) {
                if(line.contains(searchWord)) {
                    count++;
                }
            }

            System.out.printf(" ---> The word \'%s\' was found %d times  <---\n", searchWord, count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



