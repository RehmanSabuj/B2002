package inheritanceDemo;

public class AlphaPhone extends AbstractAlphaPhone{
    public void addCamera(){
        System.out.println("Adding camera...");
    }
    public void listenMusic(){
        System.out.println("Listen music....");
    }
    public void phooneBook(){
        System.out.println("........");
    }

    @Override
    public void mp3Player() {
        System.out.println("Play song");
    }

    @Override
    public void games() {
        System.out.println("Play games");
    }

    public static void main(String[] args) {
        AlphaPhone alphaPhone = new AlphaPhone();
        alphaPhone.call();
        alphaPhone.voiceRecord();
        alphaPhone.addCamera();
        alphaPhone.listenMusic();
        alphaPhone.phooneBook();
        alphaPhone.mp3Player();
        alphaPhone.newIdea();
    }
}
