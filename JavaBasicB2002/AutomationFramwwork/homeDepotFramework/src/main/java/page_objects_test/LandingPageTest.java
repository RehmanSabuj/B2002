package page_objects_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.LandingPage;
import reporting.TestLogger;

public class LandingPageTest extends BrowserDriver {

    LandingPage landingPage = null;
    @BeforeMethod
    public void intializeElements(){
        landingPage = PageFactory.initElements(driver, LandingPage.class);
    }
    @Test
    public void clickAccountButton(){
        TestLogger.log("click search box");
        landingPage.clickSearchBox();
        TestLogger.log("clicked");
    }


}
