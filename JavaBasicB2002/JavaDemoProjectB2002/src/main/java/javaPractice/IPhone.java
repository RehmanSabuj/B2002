package javaPractice;

public class IPhone {
       public static void main(String[] args) {
           IPhone myPhone = new IPhone();
           String textMessage = myPhone.sendText();
           System.out.println(textMessage);
       }
        /* myPhone.phoneCall();
        myPhone.gaming();
        myPhone.video();

    }*/
    public void phoneCall(){
        System.out.println("We can contact with people using phone");
    }
    public void gaming(){
        System.out.println("We can play games");
    }
    public void video(){
        System.out.println("record the videos");
    }
    public String sendText(){
        String message = "Hello, how are you doing?";
        return message;
    }
}
