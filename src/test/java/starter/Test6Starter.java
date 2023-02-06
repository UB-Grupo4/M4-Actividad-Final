package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Test6Steps;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RunWith(SerenityRunner.class)
public class Test6Starter {
    @Managed
    WebDriver driver;

    @Managed
    WebDriverWait wait;

    @Steps
    Test6Steps user1;

    @Test
    public void Test6() {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd',' MMMM yyyy");
        String formattedDate = today.format(formatter);

        System.out.println("\nReport name : TEST6");
        System.out.println("O.S name    : " + osName + " version " + osVersion);
        System.out.println("Date        : " + formattedDate + "\n");
        
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
        user1.buy_selected_products();
        user1.should_see_purchase_confirmation();
    }
}
