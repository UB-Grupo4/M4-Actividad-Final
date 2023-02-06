package steps;

import PageObjects.*;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class Test2Steps {

    HomePage homePage;
    LogInPage logInPage;

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
}
