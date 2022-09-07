package unit_testing;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2,4);
        calculator.deduct(4,2);
        int actualResult = calculator.add(2,4);
        int result2 = calculator.deduct(4,2);
        System.out.println(actualResult);
        System.out.println(result2);
    }
}
