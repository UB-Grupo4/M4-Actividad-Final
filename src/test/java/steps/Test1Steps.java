package steps;

import PageObjects.HomePage;
import PageObjects.SignInPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class Test1Steps {

    HomePage homePage;
    SignInPage signInPage;


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

}
