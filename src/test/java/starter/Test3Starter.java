package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.Test3Steps;

@RunWith(SerenityRunner.class)
public class Test3Starter {
    @Managed
    WebDriver driver;

    @Steps
    Test3Steps user1;

    @Test
    public void Test2() {
        user1.go_to_home_page();
        user1.go_to_phones_tab();
        user1.should_see_only_phones();
        user1.go_to_laptops_tab();
        user1.should_see_only_laptops();
        user1.go_to_monitors_tab();
        user1.should_see_only_monitors();
    }
}
