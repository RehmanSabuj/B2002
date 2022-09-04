package whileDemo;

public class WhileDemo {
    public static void main(String[] args) {
        WhileDemo whileDemo = new WhileDemo();
        whileDemo.whileDemo1();

    }
    public void whileDemo1(){
        int age = 1;
        while (age > 4 && age<7){
            System.out.println("You're belongs to group blue");
            break;
        }
        while (age <4){
            System.out.println("Belongs to Yellow");
            age++;
        }
    }
}
