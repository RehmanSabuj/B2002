package javainputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AppPropertiesConsumer {
    static AppProperties appProperties = new AppProperties();

    public static void main(String[] args) throws IOException {
        login();
       // appProperties.loadProperties();
    }

    public static void login() throws IOException {
        System.out.println("Use userName: " + appProperties.loadProperties().getProperty("userName"));
        System.out.println("Pass your password: " + appProperties.loadProperties().getProperty("password"));;
    }
}
