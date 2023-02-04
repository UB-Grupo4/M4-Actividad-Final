package steps;

import PageObjects.HomePage;
import PageObjects.SignInPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

//@RunWith(SerenityRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test1Steps {
//    private static final String TEST_NAME="";
//    private static final String TEST_PWD="marrtrrasadfgs";

    HomePage homePage;
    SignInPage signInPage;

//    @Managed
//    WebDriver driver;
//    WebDriverWait wait;

//    @Before
//    public void setUp() {
//        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        homePage = new HomePage(driver);
//        signInPage = new SignInPage(driver);
//    }

    @Step("is on the home page")
    public void is_on_home_page() {
        homePage.open();
    }

    @Step("goes to sing in")
    public void goes_to_SignIn() {
        homePage.clickOnSignIn();
    }

    @Step("should receive a conformation message after creating a new user")
    public void should_receive_a_confirmation_msg_after_creates_a_new_user(String name, String pwd) {
        String alertText = signInPage.createUser(name, pwd);
        assertThat(alertText).isEqualToIgnoringCase("Sign up successful.");
    }

    @After
    public void close_browser() {
//        driver.quit();
    }

}
