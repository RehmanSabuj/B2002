package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> courseId = new HashMap<>();

        courseId.put(101, "ENG");
        courseId.put(102, "MATH");
        courseId.put(103, "BIO");
        courseId.put(104, "SIO");
        courseId.put(105, "CIS");

        System.out.println("size of map " + courseId.size());
        System.out.println("Value of key of map 104:  " + courseId.get(104));

        for (Map.Entry<Integer, String> course: courseId.entrySet()) {
            // System.out.println("Key " + course.getKey());
           // System.out.println("Value " + course.getValue());
            System.out.println("CourseID: " + course.getValue() + " " + course.getKey());

        }
    }
}
