package steps;

import PageObjects.HomePage;
import PageObjects.LogInPage;
import net.thucydides.core.annotations.Step;
import org.junit.After;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

//@RunWith(SerenityRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test3Steps {
//    private static final String TEST_NAME="start121zs";
//    private static final String TEST_PWD="marte45szs";

    HomePage homePage;
    LogInPage logInPage;

//    @Managed
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @Before
//    public void setUp() {
//        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        homePage = new HomePage(driver);
//        logInPage = new LogInPage(driver);
//    }

    @Step("is on the home page")
    public void go_to_home_page() {
        homePage.open();
    }

    @Step("is on the phones tab")
    public void go_to_phones_tab() {
        homePage.clickOnPhones();
    }

    @Step("is on the laptops tab")
    public void go_to_laptops_tab() {
        homePage.clickOnLaptops();
    }

    @Step("is on the monitors tab")
    public void go_to_monitors_tab() {
        homePage.clickOnMonitors();
    }

    @Step("should see only phones")
    public void should_see_only_phones() {
        assertThat(homePage.hasPhones()).isTrue();
        assertThat(homePage.hasLaptops()).isFalse();
        assertThat(homePage.hasMonitors()).isFalse();
    }

    @Step("should see only laptops")
    public void should_see_only_laptops() {
        assertThat(homePage.hasPhones()).isFalse();
        assertThat(homePage.hasLaptops()).isTrue();
        assertThat(homePage.hasMonitors()).isFalse();
    }

    @Step("should see only monitors")
    public void should_see_only_monitors() {
        assertThat(homePage.hasPhones()).isFalse();
        assertThat(homePage.hasLaptops()).isFalse();
        assertThat(homePage.hasMonitors()).isTrue();
    }
    @After
    public void close_browser() {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd',' MMMM yyyy");
        String formattedDate = today.format(formatter);

        System.out.println("\nReport name : TEST2");
        System.out.println("O.S name    : " + osName + " version " + osVersion);
        System.out.println("Date        : " + formattedDate + "\n");
//        driver.quit();
    }
}
