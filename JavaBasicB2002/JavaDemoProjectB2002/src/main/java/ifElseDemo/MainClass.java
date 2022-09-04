package ifElseDemo;

public class MainClass {
    public static void main(String[] args) {
        int waterLevel = 6;
        if(waterLevel== 3) {
            System.out.println("raise the alarm");
        } else if (waterLevel>=5) {
            System.out.println("Stop the switch");
        } else {
            System.out.println("Resume the switch on");
        }
    }
}
