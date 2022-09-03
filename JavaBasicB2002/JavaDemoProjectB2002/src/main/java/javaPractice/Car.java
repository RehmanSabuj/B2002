package javaPractice;

public class Car {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.race();

    }
    public void drive(){
        System.out.println("We can drive long way");
    }public void race(){
        System.out.println("We can do race");
    }
}
