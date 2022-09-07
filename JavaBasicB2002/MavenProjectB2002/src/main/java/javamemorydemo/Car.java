package javamemorydemo;

public class Car {
    String color;
    int numberOfCar;
    public Car(String color, int numberOfCar){
        color=this.color;
        numberOfCar= this.numberOfCar;

    }
    public static Car getMyCar() {
        Car blueCar = new Car("blue", 3);
        return blueCar;
        }

    public static void main(String[] args) {
        getMyCar();
        System.out.println("Hello...");

    }
}
