package steps;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductPage;
import net.thucydides.core.annotations.Step;
import org.junit.After;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

//@RunWith(SerenityRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test5Steps {
//    private static final String TEST_NAME="start121zs";
//    private static final String TEST_PWD="marte45szs";

    HomePage homePage;
    CartPage cartPage;
    ProductPage productPage;

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

    @Step("is on the cart page")
    public void go_to_cart_page() {
        cartPage.navigateTo();
    }

    @Step("Go to Samsung Galaxy S6")
    public void go_to_Samsung_Galaxy_S6() {
        homePage.clickOnPhoneS6();
    }

    @Step("Go to Samsung Galaxy S7")
    public void go_to_Samsung_Galaxy_S7() {
        homePage.clickOnPhoneS7();
    }

    @Step("Go to Sony Vaio i7")
    public void go_to_Sony_Vaio_i7() {
        homePage.clickOnLaptopVaioI7();
    }

    @Step("Add product To Cart")
    public void add_product_to_cart() {
        productPage.addProductToCart();
    }

    @Step("Remove Samsung S6 from the cart")
    public void remove_Samsung_Galaxy_S6() {
        cartPage.removeSamsungS6FromCart();
    }

    @Step("Should not see Samsung Galaxy S6 in cart")
    public void should_not_see_Samsung_Galaxy_S6_in_cart() {
        assertThat(cartPage.getProductNamesFromCart().size()).isLessThan(1);
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
