package PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;


public class SignInPage extends PageObject {
    @FindBy(id="sign-username")
    WebElementFacade usernameLocator;

    @FindBy(id="sign-password")
    WebElementFacade passwordLocator;

    @FindBy(xpath="//button[@onclick=\"register()\"]")
    WebElementFacade createButton;

    @Managed
    WebDriver driver;
    @Managed
    WebDriverWait wait;
    public SignInPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String createUser(String testName, String testPwd) {
        createButton.waitUntilClickable();
        usernameLocator.sendKeys(testName);
        passwordLocator.sendKeys(testPwd);
        createButton.click();
        wait.until(alertIsPresent());
        String alertText=driver.switchTo().alert().getText();
        return alertText;
    }
}
