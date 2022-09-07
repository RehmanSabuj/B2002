package inheritanceDemo;

public class AlphaAdvancePhone extends AlphaPhone{
    public void takeSelfie(){
        System.out.println("selfie.....");
    }
    public void takeSelfie(String cameraLayout){
        System.out.println("Method overloaded....");
    }
    public void listenMusic(){
        System.out.println("Listen music....");
        System.out.println("We can override the parent class method...");
    }
}
