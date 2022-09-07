package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> emailId = new HashSet<>();

        emailId.add("david@gmail.com");
        emailId.add("mona@gmail.com");
        emailId.add("lanin@gmail.com");
        emailId.add("yellow@gmail.com");
        emailId.add("green@gmail.com");
        emailId.add("black@gmail.com");
        emailId.add("david@gmail.com");

        for (String email: emailId) {
            System.out.println("Print the clients email: " + email);

        }
}}
