package PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class CartPage extends PageObject {

    @FindBy(id="cartur")
    WebElementFacade viewCartLocator;

    @FindBy(xpath="//*[@id=\"tbodyid\"]/tr/td[4]/a")
    WebElementFacade removeItemLocator;

    @FindBy(xpath="//button[@data-target='#orderModal']")
    WebElementFacade placeOrderLocator;

    private static final By CART_ROWS_NAME_LOCATOR = By.xpath("//*[@id='tbodyid']/tr/td[2]");

    public void navigateTo() {
        viewCartLocator.click();
    }


    public List<String> getProductNamesFromCart() {
        return getDriver().findElements(CART_ROWS_NAME_LOCATOR)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public void removeSamsungS6FromCart() {
        removeItemLocator.waitUntilClickable();
        removeItemLocator.click();
        removeItemLocator.waitUntilNotVisible();
    }

    public void buyItemsInCart() {
        placeOrderLocator.click();
    }
}