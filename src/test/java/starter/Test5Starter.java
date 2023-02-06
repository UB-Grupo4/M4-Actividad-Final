package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Test5Steps;

@RunWith(SerenityRunner.class)
public class Test5Starter {
    @Managed
    WebDriver driver;

    @Managed
    WebDriverWait wait;

    @Steps
    Test5Steps user1;

    @Test
    public void Test5() {
        // add Samsung Galaxy S6
        user1.go_to_home_page();
        user1.go_to_phones_tab();
        user1.go_to_Samsung_Galaxy_S6();
        user1.add_product_to_cart();

        user1.go_to_cart_page();
        user1.remove_Samsung_Galaxy_S6();
        user1.should_not_see_Samsung_Galaxy_S6_in_cart();
    }
}
