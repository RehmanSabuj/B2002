package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class LandingPage {
    WebDriver driver= null;

    @FindBy(how = How.ID, using = "headerSearch")
    WebElement homePage;

    @FindBy(how = How.CLASS_NAME, using = "T-Shirts")
    WebElement tshirts;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/div[2]/div[2]/form/div[1]/button/svg/path")
    WebElement searchBox;

    public void clickSearchBox(){
        homePage.click();
        homePage.sendKeys("t-shirts");
    }
}
