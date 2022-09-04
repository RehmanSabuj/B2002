package switchdemo;

public class SwitchDemo {
    public void modeDetector(){
        String activity = " ";

        switch (activity){
            case "Eating":
            System.out.println("Mode is good because of: " + activity);
            break;

            case "PoorSleep":
                System.out.println("Mode is Sad because of: " + activity);
                break;
            case "ModeIsBad":
                System.out.println("Mode is not good because of: " + activity);
                break;

            default:
                System.out.println("Nothing happen");

}
    }
}
