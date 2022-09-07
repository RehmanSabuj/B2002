package inheritanceDemo.beta;

public abstract class BetaPhoneImplementation implements BetaPhoneDesign, James{
    public void calling(){
        System.out.println("People can calling...");
    }
    public void messaging(){
        System.out.println("We can messaging using.....");
    }

    public void recording(){
        System.out.println("We can recording......");
}
public void mp3(){
    System.out.println("We can listen music....");
}
}
