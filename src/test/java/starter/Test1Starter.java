package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.Test1Steps;

@RunWith(SerenityRunner.class)
public class Test1Starter {
    @Managed
    WebDriver driver;

    @Steps
    Test1Steps usuario1;

    @Test
    public void Test1() {
        usuario1.is_on_home_page();
        usuario1.goes_to_SignIn();
        usuario1.should_receive_a_confirmation_msg_after_creates_a_new_user("user3578", "strongpw");
    }
}
