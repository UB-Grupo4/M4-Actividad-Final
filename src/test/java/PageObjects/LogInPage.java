package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends PageObject {
    @FindBy(xpath = "//button[@onclick=\"logIn()\"]")
    WebElementFacade loginButtonLocator;
    @FindBy(id = "loginusername")
    WebElementFacade usernameLoginLocator;
    @FindBy(id = "loginpassword")
    WebElementFacade passwordLoginLocator;

    public void logInUser(String testName, String testPwd) {
        loginButtonLocator.waitUntilClickable();
        usernameLoginLocator.sendKeys(testName);
        passwordLoginLocator.sendKeys(testPwd);
        loginButtonLocator.click();
    }
}
