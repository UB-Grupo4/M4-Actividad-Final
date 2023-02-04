package steps;

import PageObjects.*;
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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

//@RunWith(SerenityRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test2Steps {
//    private static final String TEST_NAME="start121zs";
//    private static final String TEST_PWD="marte45szs";

    HomePage homePage;
    LogInPage logInPage;

//    @Managed
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @Before
//    public void setUp() {
//        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        homePage = new HomePage(driver);
//        logInPage = new LogInPage(driver);
//    }

    @Step("is on the home page")
    public void is_on_home_page() {
        homePage.open();
    }

    @Step("goes to sing in")
    public void goes_to_LogIn() {
        homePage.clickOnLogIn();
    }

    @Step("should see a welcome message after log in")
    public void should_see_a_welcome_message_after_log_in(String name, String pwd) {
        logInPage.logInUser(name, pwd);
        String loggedUserName = homePage.getWelcomeMessage();
        assertThat(loggedUserName).isEqualToIgnoringCase("Welcome " + name);
    }

    @After
    public void close_browser() {
//        driver.quit();
    }
}
