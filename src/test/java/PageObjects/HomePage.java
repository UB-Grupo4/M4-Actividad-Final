package PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
//import org.openqa.selenium.By;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions; // todo remove
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*; //todo remove

@DefaultUrl("https://www.demoblaze.com/index.html")
public class HomePage extends PageObject {
    @FindBy(xpath = "//a[@onclick=\"byCat('phone')\"]")
    WebElementFacade phonesLocator;
    @FindBy(xpath = "//a[@onclick=\"byCat('notebook')\"]")
    WebElementFacade laptopsLocator;
    @FindBy(xpath ="//a[@onclick=\"byCat('monitor')\"]")
    WebElementFacade monitorLocator;
    @FindBy(id="signin2")
    WebElementFacade signupLocator;
    @FindBy(id="login2")
    WebElementFacade loginLocator;
    @FindBy(id="nameofuser")
    WebElementFacade loggedUserLocator;
    @FindBy(xpath="//a[@href='prod.html?idp_=8']") // ToDo: create locators from ids numbers
    WebElementFacade laptopVaioI5Locator;
    @FindBy(xpath="//a[@href='prod.html?idp_=10']")
    WebElementFacade monitorApple24Locator;
    @FindBy(xpath="//a[@href='prod.html?idp_=1']")
    WebElementFacade phoneS6Locator;

    @FindBy(xpath="//a[@href='prod.html?idp_=4']")
    WebElementFacade phoneS7Locator;
    @FindBy(xpath="//a[@href='prod.html?idp_=9']")
    WebElementFacade laptopVaioI7Locator;

    @FindBy(xpath="//a[@href='prod.html?idp_=1']")
    List<WebElementFacade> phoneS6LocatorList;
    @FindBy(xpath="//a[@href='prod.html?idp_=8']")
    List<WebElementFacade> laptopVaioI5LocatorList;
    @FindBy(xpath="//a[@href='prod.html?idp_=10']")
    List<WebElementFacade> monitorApple24LocatorList;

    @Managed
    WebDriver driver;
    @Managed
    WebDriverWait wait;


//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//        //wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//    }

    public void navigateTo() { //ToDo remove
        this.driver.get("https://www.demoblaze.com/index.html");
        this.driver.manage().window().maximize();
    }

    public void clickOnPhones() {
        phonesLocator.click();
        laptopVaioI5Locator.waitUntilNotVisible();
        monitorApple24Locator.waitUntilNotVisible();
    }

    public void clickOnLaptops(){
        laptopsLocator.click();
        phoneS6Locator.waitUntilNotVisible();
        monitorApple24Locator.waitUntilNotVisible();
    }

    public void clickOnMonitors() {
        monitorLocator.click();
        laptopVaioI5Locator.waitUntilNotVisible();
        phoneS6Locator.waitUntilNotVisible();
    }

    public void clickOnSignIn() {
        signupLocator.waitUntilClickable();
        signupLocator.click();
    }

    public void clickOnLogIn() {
        loginLocator.waitUntilClickable();
        loginLocator.click();
    }

    public String getWelcomeMessage() {
        loggedUserLocator.waitUntilPresent();
        return loggedUserLocator.getText();
    }

    // Product methods
    private void clickOnProduct(WebElementFacade productName) {
        productName.waitUntilClickable();
        productName.click();
    }

    public void clickOnPhoneS7(){
        clickOnProduct(phoneS7Locator);
    }
    public void clickOnPhoneS6(){
        clickOnProduct(phoneS6Locator);
    }
    public void clickOnLaptopVaioI7(){
        clickOnProduct(laptopVaioI7Locator);
    }
    public boolean hasPhones() {
        return phoneS6LocatorList.size() > 0;
    }
    public boolean hasLaptops() {
        return laptopVaioI5LocatorList.size() > 0;
    }
    public boolean hasMonitors() {
        return monitorApple24LocatorList.size() > 0;
    }

}
