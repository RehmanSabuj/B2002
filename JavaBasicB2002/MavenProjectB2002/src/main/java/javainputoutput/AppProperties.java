package javainputoutput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AppProperties {
    String userName = "Mushiur";
    String password = "Mushiur1@";

    public String getUserName(String userName) throws IOException {
        userName = loadProperties().getProperty("userName");
        return userName;
    }
    public String getPassword(String password) throws IOException {
        password = loadProperties().getProperty("password");
        return password;
    }
    public Properties loadProperties() throws IOException {
        File file = new File("C:\\Users\\mushi\\IdeaProjects\\B2002\\JavaBasicB2002\\MavenProjectB2002\\src\\main\\resources\\app.propertise");
        FileReader fileReader = new FileReader(file);

        Properties properties= new Properties();
        properties.load(fileReader);
//        System.out.println("UserName: " + properties.getProperty("userName"));
//        System.out.println("Password: " + properties.getProperty("password"));
        return properties;
    }
}
