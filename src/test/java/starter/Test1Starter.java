package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.Test1Steps;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RunWith(SerenityRunner.class)
public class Test1Starter {
    @Managed
    WebDriver driver;

    @Steps
    Test1Steps user1;

    @Test
    public void Test1() {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd',' MMMM yyyy");
        String formattedDate = today.format(formatter);

        System.out.println("\nReport name : TEST1");
        System.out.println("O.S name    : " + osName + " version " + osVersion);
        System.out.println("Date        : " + formattedDate + "\n");

        user1.is_on_home_page();
        user1.goes_to_SignIn();
        user1.should_receive_a_confirmation_msg_after_creates_a_new_user("usyint12", "studentuser12");
    }
}
