package javaPractice;

public class ConstructorObjects {

// default constructor
    public ConstructorObjects(){
        System.out.println("I'm default constructor!");
    }
    // custom contractor

    public ConstructorObjects(String blueClor) {
        System.out.println("Build a phone" + blueClor + "color");
    }

    public ConstructorObjects(String typeOfPhoneMemory, int memorySize) {
        System.out.println("Build a phone with " + typeOfPhoneMemory + "and size " + memorySize + "gb");
    }
    public ConstructorObjects(String produce, int amount, int display){
        System.out.println("Made in " + produce + " numberOfPhone " + amount + " medium " + display + " inchDisplay");

    }

   public static void main(String[] args) {
        ConstructorObjects xPhone = new ConstructorObjects();
        xPhone.yourPhone();
        ConstructorObjects newPhone = new ConstructorObjects("Blue");
        newPhone.call("Sadaf");

        ConstructorObjects largeMemory = new ConstructorObjects("YellowColors ",  525);
        largeMemory.call("Karl");

        ConstructorObjects nPhone = new ConstructorObjects("China", 100, 8);
        nPhone.call("Ravel");
    }
    public void yourPhone(){
        System.out.println("Your phone");
    }
    public void call(String name){
        System.out.println("calling " + name);
    }

}
