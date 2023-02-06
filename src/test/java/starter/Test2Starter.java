package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.Test2Steps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RunWith(SerenityRunner.class)
public class Test2Starter {
    @Managed
    WebDriver driver;

    @Steps
    Test2Steps user1;

    @Test
    public void Test2() {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd',' MMMM yyyy");
        String formattedDate = today.format(formatter);

        System.out.println("\nReport name : TEST2");
        System.out.println("O.S name    : " + osName + " version " + osVersion);
        System.out.println("Date        : " + formattedDate + "\n");

        user1.is_on_home_page();
        user1.goes_to_LogIn();
        user1.should_see_a_welcome_message_after_log_in("usssyint12", "studentuser12");
    }
}
