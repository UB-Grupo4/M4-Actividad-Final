package PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*; //todo remove

public class ProductPage extends PageObject{
    @FindBy(xpath="//*[@id='tbodyid']/div[2]/div/a[text()='Add to cart']")
    WebElementFacade addToCartLocator;

    public void addProductToCart() {
        addToCartLocator.waitUntilClickable();
        addToCartLocator.click();
        waitFor(alertIsPresent());
        getDriver().switchTo().alert().accept();
    }
}