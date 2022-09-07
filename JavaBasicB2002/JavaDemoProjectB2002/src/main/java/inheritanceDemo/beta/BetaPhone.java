package inheritanceDemo.beta;

public class BetaPhone extends BetaPhoneImplementation {
    public void phoneBook(){
        System.out.println("We can save contact......");
    }
    public void streaming(){
        System.out.println("We can stream....");
    }

    public static void main(String[] args) {
        BetaPhone betaPhone = new BetaPhone();
        betaPhone.phoneBook();
        betaPhone.calling();
        betaPhone.streaming();
        betaPhone.mp3();
    }
}
