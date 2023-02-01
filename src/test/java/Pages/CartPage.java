package Pages;

import net.serenitybdd.core.pages.PageObject;
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

    private static final By VIEW_CART_LOCATOR = By.id("cartur");
    private static final By CART_ROWS_NAME_LOCATOR = By.xpath("//*[@id='tbodyid']/tr/td[2]");
    private static final By REMOVE_ITEM_LOCATOR = By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");
    private static final By PLACE_ORDER_LOCATOR = By.xpath("//button[@data-target='#orderModal']");
    private static final By USER_NAME_LOCATOR = By.id("name");
    private static final By CREDIT_CARD_LOCATOR = By.id("card");

    private WebDriver driver;
    private WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void navigateTo() {
        driver.findElement(VIEW_CART_LOCATOR).click();
    }

    public void navigateToWaitForProduct(String productName) {
        this.navigateTo();
        By productLocator = By.xpath("//td[contains(text(),'" + productName + "')]");
        WebElement productRow = driver.findElement(productLocator);
        WebElement removeButton = productRow.findElement(REMOVE_ITEM_LOCATOR);
        wait.until(elementToBeClickable(removeButton));
    }

    public List<String> getProductNamesFromCart() {
        return driver.findElements(CART_ROWS_NAME_LOCATOR)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
    public void removeProductFromCart(String productName) {
        By productLocator = By.xpath("//td[contains(text(),'" + productName + "')]");
        WebElement productRow = driver.findElement(productLocator);
        WebElement removeButton = productRow.findElement(REMOVE_ITEM_LOCATOR);
        wait.until(elementToBeClickable(removeButton));
        removeButton.click();
        wait.until(stalenessOf(productRow));
    }
    public void buyItemsInCart() {
        driver.findElement(PLACE_ORDER_LOCATOR).click();
        driver.findElement(USER_NAME_LOCATOR).sendKeys("User1");
        driver.findElement(CREDIT_CARD_LOCATOR).sendKeys("Card1234");
    }
}