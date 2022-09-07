package javaio;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public void reading() throws IOException {
        String txtFilePath = "C:\\Users\\mushi\\IdeaProjects\\B2002\\JavaBasicB2002\\JavaDemoProjectB2002\\data\\demo.txt";
        FileReader read = new FileReader(txtFilePath);

        int i;
        while ((i = read.read()) != -1){
            System.out.print((char) i);
        }
    }
}
