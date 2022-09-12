package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class ContactUsPage {
    @FindBy(how = How.ID, using = "message")
    WebElement messageBox;
    @FindBy(how = How.ID, using = "submitButton")
    WebElement submitButton;
    @FindBy(how = How.XPATH, using = "//div[@id='center_column']/div/p")
    WebElement errorMessage;

    public void sendText() {
        TestLogger.log("Sending text to message box");
        messageBox.sendKeys("Hello ....");
        TestLogger.log("Message written in message box");
        //submitButton.click();
        clickSubmitButton();
    }
    public void clickSubmitButton() {
        TestLogger.log("Click submit button");
        submitButton.click();
        TestLogger.log("Clicked Button");
    }

    public String getErrorMessage() {
        String error = errorMessage.getText();
        return error;
    }
}