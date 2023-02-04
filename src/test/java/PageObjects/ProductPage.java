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

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*; //todo remove

public class ProductPage extends PageObject{
    @FindBy(xpath="//*[@id='tbodyid']/div[2]/div/a[text()='Add to cart']")
    WebElementFacade addToCartLocator;

    @Managed
    WebDriver driver;
    @Managed
    WebDriverWait wait;

    public void addProductToCart() {
        addToCartLocator.waitUntilClickable();
        addToCartLocator.click();
        this.wait.until(alertIsPresent());
        this.driver.switchTo().alert().accept();
    }
}