package filereading;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo2 {
    public void readingFile2() throws IOException {
        String fileReading = "C:\\Users\\mushi\\IdeaProjects\\B2002\\JavaBasicB2002\\JavaDemoProjectB2002\\data\\demo.txt";
        FileReader reader = new FileReader(fileReading);

        int x;
        while ((x = reader.read()) != -1){
            System.out.print((char) x);
        }
    }
}