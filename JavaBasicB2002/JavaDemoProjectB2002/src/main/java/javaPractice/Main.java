package javaPractice;

public class Main {
    public static void main(String[] args) {
        /*Main newPen = new Main();
        newPen.paint();
        newPen.write();*/
        IPhone myPhone = new IPhone();
        myPhone.video();
        myPhone.phoneCall();
        myPhone.gaming();
        myPhone.sendText();

        System.out.println("Hello Java \n nice to be here");
    }
    public void write(){
        System.out.println("Writing using the pen");
    }

    public void paint(){
        System.out.println("We can paint using the pen");
    }

}
