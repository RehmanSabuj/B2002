package javaPractice;

public class NewPhone {
    public static void main(String[] args) {
        NewPhone funnyPhone = new NewPhone();
        String color = funnyPhone.colorfulPhone();
        funnyPhone.crackPhone();
        funnyPhone.libanPhone();
        funnyPhone.oldPhone();
        System.out.println(color);

    }
    public void libanPhone(){
        System.out.println("It is a new phone");
    }
    public void oldPhone(){
        System.out.println("It is a old phone but functions good");
    }
    public void crackPhone(){
        System.out.println("This phone is broken");
    }
    public String colorfulPhone(){
        String phone = "This phone has too many color picture";
        return phone;
    }
}
