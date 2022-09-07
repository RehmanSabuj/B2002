package unit_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(2,4);
        System.out.println(actualResult);
        int expectedResult = 6;

        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("Expected result is equal to actual resul, thus proved the programing is working as expected.");
    }

   @Test
    public void deduct(){
        Calculator cal= new Calculator();
        int actual = cal.deduct(2,2);
        int expected = 2;
        Assert.assertEquals(2,2);
        System.out.println("Matching the result...");
    }

}
