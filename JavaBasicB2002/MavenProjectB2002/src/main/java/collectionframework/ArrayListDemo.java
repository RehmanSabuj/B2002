package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public void studentList(){
//        int[] myArray = new int[6];
//
//        myArray[0] = 2;

        List<Integer> studentId = new ArrayList<Integer>();
        String name = new String("David");
        System.out.println(name);

       // ArrayList studentList = new ArrayList<Integer>();

        studentId.add(100);
        studentId.add(200);
        studentId.add(366);
        studentId.add(433);
        studentId.add(522);
        studentId.add(null);
        studentId.add(522);  // list can have duplicate value

        System.out.println(studentId.get(3));
        System.out.println("Length of the list " + studentId.size());

        for(int i = 0; i <=studentId.size() -1; i++){
            System.out.println("Get the value of elements: " + i);
        }
        for (Integer integer: studentId) {
            System.out.println("Print the elements of: " + integer);

        }
        studentId.forEach(x -> System.out.println("ID: " + x));

    }
}
