package page_objects_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.StoreFinder;

public class StoreFindTest extends BrowserDriver {
    StoreFinder storeFinder = null;

    @BeforeMethod
    public void initializeElements(){
        storeFinder = PageFactory.initElements(driver, StoreFinder.class);
    }

    @Test
    public void clickStoreFinder(){
        storeFinder.setStoreFind();
    }


}
