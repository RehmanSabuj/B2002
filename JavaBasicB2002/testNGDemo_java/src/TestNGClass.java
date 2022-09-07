import org.testng.annotations.Test;

public class TestNGClass {

    @Test
    public void setUp(){
        System.out.println("Hello testing");
    }
    @Test
    public void testSetUp(){
        System.out.println("I am inside");
    }
}
