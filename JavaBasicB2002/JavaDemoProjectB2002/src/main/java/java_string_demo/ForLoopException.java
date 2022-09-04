package java_string_demo;

public class ForLoopException {
    public static void main(String[] args) {
        int[] subjects = new int[6];

try {
    subjects[0] = 101;
    subjects[1] = 102;
    subjects[2] = 103;
    subjects[3] = 104;
    subjects[4] = 105;
    subjects[5] = 106;
    subjects[6] = 107;
    subjects[7] = 108;
    subjects[8] = 109;
} catch(Exception e){
    e.printStackTrace();
}
        System.out.println("This is a waring for limitation");

        System.out.println("Print the index of: " + subjects[2]);
        System.out.println("Print the index of: " + subjects[3]);
        System.out.println("Print the index of: " + subjects[1]);
        System.out.println("Print the index of: " + subjects[0]);
        System.out.println("Print the index of: " + subjects[5]);


    for(int i=3; i<6; i++){
        //int[] subjects = new int[5];
        int v = subjects[i];
        System.out.println("Print the sum of subjects: " + i);
    }
}
}
