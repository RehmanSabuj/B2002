package inheritanceDemo;

public abstract class AbstractAlphaPhone implements AlphaPhoneDesignPhrase,Max {
    public void call(){
        System.out.println("Calling...");
    }

    public void sendText(){
        System.out.println("Be able to text....");
    }

    public void voiceRecord(){
        System.out.println("Recording conversation....");
    }
    public abstract void addCamera();

}
