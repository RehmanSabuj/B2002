package javaPractice;

public class SamsungPhone {
    public static void main(String[] args) {

        String name = "David";

        SamsungPhone samSung = new SamsungPhone();
        String phone = samSung.watchingSports();
        System.out.println(phone);
        samSung.listenMusic();
        //samSung.contact();

    }

    public String watchingSports() {
        String yankeesGames = "It was very fun the way game end!";
        return yankeesGames;
    }
    public void listenMusic(){
        System.out.println("We can listen music in our phone.");
    }
    public void contact(String name){
        System.out.println("contacting to " + name);
    }
}
