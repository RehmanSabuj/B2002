package javaio;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {
    public void fileReading() throws IOException {

        String filePath = "C:\\Users\\mushi\\IdeaProjects\\B2002\\JavaBasicB2002\\JavaDemoProjectB2002\\data\\demo.txt";
        FileReader reader = new FileReader(filePath);

        int i;
        while((i = reader.read())!= -1){
            System.out.print((char) i);
        }
    }
}
