package java_string_demo;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] studentId = new int[5];

        try {
            studentId[0] = 201;
            studentId[1] = 202;
            studentId[2] = 203;
            studentId[3] = 204;
            studentId[4] = 205;
            studentId[5] = 206;
        } catch
        (Exception e) {
            e.printStackTrace();
            System.out.println("Over the limit!, plz fixed the problem");

            System.out.println("Print the element of StudentId: " + studentId[0]);
            System.out.println("Print the element of StudentId: " + studentId[2]);
            System.out.println("Print the element of StudentId: " + studentId[3]);
        }

            for (int x=0; x<=4; x++){
                System.out.println(x);
                System.out.println(studentId[x]);
        }
    }
}
