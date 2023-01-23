package pstore.steps;

import io.cucumber.junit.CucumberSerenityRunner;
//import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
//import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

@RunWith(CucumberSerenityRunner.class)
//@RunWith(SerenityRunner.class)
public class Test5_6 {
    private static final String WEBSITE = "https://www.demoblaze.com/index.html";
    private static final By PHONES_LOCATOR = By.xpath("//a[@onclick=\"byCat('phone')\"]");
    private static final By LAPTOPS_LOCATOR = By.xpath("//a[@onclick=\"byCat('notebook')\"]");
    private static final By PHONE_S6_LOCATOR = By.xpath("//a[@href=\"prod.html?idp_=1\"]"); // ToDo: create locators from ids numbers
    private static final By ADD_TO_CART_PHONE_S6_LOCATOR = By.xpath("//a[@onclick=\"addToCart(1)\"]"); // ToDo: create locators from ids numbers
    private static final By LAPTOP_VAIO_LOCATOR = By.xpath("//a[@href=\"prod.html?idp_=9\"]"); // ToDo: create locators from ids numbers
    private static final By ADD_TO_CART_LAPTOP_VAIO_LOCATOR = By.xpath("//a[@onclick=\"addToCart(9)\"]"); // ToDo: create locators from ids numbers
    private static final By VIEW_CART_LOCATOR = By.id("cartur");
    private static final By CART_FIRST_ROW_NAME_LOCATOR = By.xpath("//*[@id='tbodyid']/tr/td[2]");
    private static final By PLACE_ORDER_LOCATOR = By.xpath("//button[@data-target='#orderModal']");
    private static final By DELETE_ITEM_LOCATOR = By.xpath("//a[contains(@onclick,'deleteItem')]");


    @Managed
    WebDriver driver;
    WebDriverWait wait;


    @Step
    public void i_have_an_item_in_cart(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get(WEBSITE);
        driver.findElement(PHONES_LOCATOR).click();
        driver.findElement(PHONE_S6_LOCATOR).click();
        WebElement addToCartButton = driver.findElement(ADD_TO_CART_PHONE_S6_LOCATOR);
        wait.until(elementToBeClickable(addToCartButton));
        addToCartButton.click();
        wait.until(alertIsPresent());
        driver.switchTo().alert().accept();
    }

    @Step
    public void remove_s6_from_cart(){
        driver.findElement(VIEW_CART_LOCATOR).click();
        driver.findElement(DELETE_ITEM_LOCATOR).click();
        //String title = driver.findElement(CART_FIRST_ROW_NAME_LOCATOR).getText();
        //assertThat(title).isEqualToIgnoringCase("Samsung galaxy s6");
    }

    @Step
    public void cart_should_be_empty(){
        assertThat(driver.findElements(CART_FIRST_ROW_NAME_LOCATOR).size()).isLessThan(1);
    }

//    @Step
//    public void test6_do_checkout(){
//        driver.findElement(LAPTOPS_LOCATOR).click();
//        driver.findElement(LAPTOP_VAIO_LOCATOR).click();
//        WebElement addToCartButton2 = driver.findElement(ADD_TO_CART_LAPTOP_VAIO_LOCATOR);
//        wait.until(elementToBeClickable(addToCartButton2));
//        addToCartButton2.click();
//        wait.until(alertIsPresent());
//        driver.switchTo().alert().accept();
//        driver.findElement(VIEW_CART_LOCATOR).click();
//        driver.findElement(PLACE_ORDER_LOCATOR).click();
//    }

//    @After
//    public void tearDown(){
//        driver.quit();
//    }
}
