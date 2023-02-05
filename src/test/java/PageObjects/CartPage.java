package PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.stalenessOf;

public class CartPage extends PageObject {

    @FindBy(id="cartur")
    WebElementFacade viewCartLocator;

    @FindBy(xpath="//*[@id='tbodyid']/tr/td[2]")
    WebElementFacade cartRowsNameLocator;

    @FindBy(xpath="//*[@id=\"tbodyid\"]/tr/td[4]/a")
    WebElementFacade removeItemLocator;

    @FindBy(xpath="//button[@data-target='#orderModal']")
    WebElementFacade placeOrderLocator;

    @FindBy(id="name")
    WebElementFacade userNameLocator;

    @FindBy(id="card")
    WebElementFacade creditCardLocator;

    @FindBy(xpath="//td[contains(text(),'Samsung galaxy s6')]")
    WebElementFacade samsungS6Locator;

//    private static final By VIEW_CART_LOCATOR = By.id("cartur");
    private static final By CART_ROWS_NAME_LOCATOR = By.xpath("//*[@id='tbodyid']/tr/td[2]");
//    private static final By REMOVE_ITEM_LOCATOR = By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");
//    private static final By PLACE_ORDER_LOCATOR = By.xpath("//button[@data-target='#orderModal']");
//    private static final By USER_NAME_LOCATOR = By.id("name");
//    private static final By CREDIT_CARD_LOCATOR = By.id("card");

    @Managed
    WebDriver driver;
    @Managed
    WebDriverWait wait;

//    public CartPage(WebDriver driver) {
//        this.driver = driver;
//        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//    }

    public void navigateTo() {
        viewCartLocator.click();
    }

    //ToDo Refactorize(?)
    public void navigateToWaitForProduct(String productName) {
        this.navigateTo();
        By productLocator = By.xpath("//td[contains(text(),'" + productName + "')]");
        WebElement productRow = driver.findElement(productLocator);
        removeItemLocator.waitUntilClickable();
    }

    // ToDo Refactorize (?)
    public List<String> getProductNamesFromCart() {

        // ToDo: After the refactorization the element is not a WebElement is a WebElementFacade and it is not possible to
        // ToDo: use the same functions the lines below is testing

        //  System.out.println("PRINTTTTTTTTTTTTTTTTTTTTTTTT OLD");
//        System.out.println(driver.findElements(CART_ROWS_NAME_LOCATOR)
//                .stream()
//                .map(WebElement::getText)
//                .collect(Collectors.toList()));
//
//        System.out.println("PRINTTTTTTTTTTTTTTTTTTTTTTTT");
//        System.out.println(cartRowsNameLocator.getText());

        return getDriver().findElements(CART_ROWS_NAME_LOCATOR)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
//
//    //ToDo Refactorize (?)
//    public void removeProductFromCart(String productName) {
//        By productLocator = By.xpath("//td[contains(text(),'" + productName + "')]");
//        WebElement productRow = driver.findElement(productLocator);
//        WebElement removeButton = productRow.findElement(REMOVE_ITEM_LOCATOR);
//        wait.until(elementToBeClickable(removeButton));
//        removeButton.click();
//        wait.until(stalenessOf(productRow));
//    }

    public void removeSamsungS6FromCart() {
        removeItemLocator.waitUntilClickable();
        removeItemLocator.click();
        samsungS6Locator.waitUntilNotVisible();
    }

    public void buyItemsInCart() {
        placeOrderLocator.click();
        userNameLocator.sendKeys("user1");
        creditCardLocator.sendKeys("Card1234");
    }
}