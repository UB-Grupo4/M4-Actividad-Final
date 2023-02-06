package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Test3Steps;

@RunWith(SerenityRunner.class)
public class Test3Starter {
    @Managed
    WebDriver driver;

    @Managed
    WebDriverWait wait;

    @Steps
    Test3Steps user1;

    @Test
    public void Test3() {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd',' MMMM yyyy");
        String formattedDate = today.format(formatter);

        System.out.println("\nReport name : TEST3");
        System.out.println("O.S name    : " + osName + " version " + osVersion);
        System.out.println("Date        : " + formattedDate + "\n");
        
        user1.go_to_home_page();

        // see phones tab
        user1.go_to_phones_tab();
        user1.should_see_only_phones();

        // see laptops tab
        user1.go_to_laptops_tab();
        user1.should_see_only_laptops();

        // see monitors tab
        user1.go_to_monitors_tab();
        user1.should_see_only_monitors();
    }
}
