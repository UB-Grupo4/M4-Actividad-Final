package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.Test2Steps;

@RunWith(SerenityRunner.class)
public class Test2Starter {
    @Managed
    WebDriver driver;

    @Steps
    Test2Steps usuario1;

    @Test
    public void Test2() {
        usuario1.is_on_home_page();
        usuario1.goes_to_LogIn();
        usuario1.should_see_a_welcome_message_after_log_in("user3578", "strongpw");
    }
}
