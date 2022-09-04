package java_string_demo;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] courseId = new int[10];
        try {
            courseId[0] = 101;
            courseId[1] = 102;
            courseId[2] = 103;
            courseId[3] = 104;
            courseId[4] = 105;
            courseId[5] = 106;
            courseId[6] = 107;
            courseId[7] = 108;
            courseId[8] = 109;
            courseId[9] = 110;
            courseId[10] = 111;
            courseId[11] = 112;
        } catch (Exception e){e.printStackTrace();

        System.out.println("Print a nice little warning that you are over the line!");
            System.out.println("Print the index of " + courseId[7]);
            System.out.println("Print the index of " + courseId[1]);
            System.out.println("Print the index of " + courseId[8]);
            System.out.println("Print the index of " + courseId[0]);
            System.out.println("Print the index of " + courseId[3]);
            System.out.println("Print the index of " + courseId[2]);
    }
}
}
