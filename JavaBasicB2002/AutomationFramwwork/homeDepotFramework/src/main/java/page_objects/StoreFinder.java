package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StoreFinder {

    @FindBy(how = How.LINK_TEXT, using = "<a class=\"TaskLinks__link\" href=\"//www.homedepot.com/l/\">Store Finder</a>")
    WebElement storeFind;

    public void setStoreFind(){
        storeFind.click();
    }
}
