package java_string_demo;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] rolId = new int[6];

        try {
            rolId[0] = 202;
            rolId[1] = 203;
            rolId[2] = 202;
            rolId[3] = 2021;
            rolId[4] = 2025;
            rolId[5] = 2023;
            rolId[6] = 2024;
            rolId[7] = 220;
        } catch (Exception e){e.printStackTrace();

        }
        System.out.println("Warn the user about the limit");

        System.out.println("Print the index of: " + rolId[5]);
        System.out.println("Print the index of: " +rolId[3]);
        System.out.println("Print the index of: " +rolId[2]);
        System.out.println("Print the index of: " +rolId[1]);
        System.out.println("Print the index of: " +rolId[0]);
        System.out.println("Print the index of: " +rolId[6]);
    }
}
