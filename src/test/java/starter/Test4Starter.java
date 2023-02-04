package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Test4Steps;

@RunWith(SerenityRunner.class)
public class Test4Starter {
    @Managed
    WebDriver driver;

    @Managed
    WebDriverWait wait;

    @Steps
    Test4Steps user1;

    @Test
    public void Test4() {
        // add Samsung Galaxy S6
        user1.go_to_home_page();
        user1.go_to_phones_tab();
        user1.go_to_Samsung_Galaxy_S6();
        user1.add_product_to_cart();

        // add Samsung Galaxy S7
        user1.go_to_home_page();
        user1.go_to_phones_tab();
        user1.go_to_Samsung_Galaxy_S7();
        user1.add_product_to_cart();

        // add Sony Vaio i7
        user1.go_to_home_page();
        user1.go_to_laptops_tab();
        user1.go_to_Sony_Vaio_i7();
        user1.add_product_to_cart();

        user1.go_to_cart_page();
        user1.should_see_samsung_galaxy_s6_samsung_galaxy_s7_and_sony_vaio_i7();
    }
}
