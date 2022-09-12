package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
public class HomePage {
    WebDriver driver = null;
    @FindBy(how = How.CLASS_NAME, using = "search_query")
    WebElement searchBox;
    @FindBy(how = How.LINK_TEXT, using = "Contact us")
    WebElement contactUs;
    //List<WebElement> contactUs;
    //@FindBy(how = How.PARTIAL_LINK_TEXT, using = "contact")
    //WebElement contactUs1;
    public void clickContactUs(){
        contactUs.click();
        TestLogger.log("Click contact us button");
    }
    public String getPageTitle(){
        String pageTitle = driver.getTitle();
        TestLogger.log("page title" + pageTitle);
        return pageTitle;
    }
    public void search(){
        searchBox.sendKeys("T-Shirt");
    }
}
