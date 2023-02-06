package steps;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class Test4Steps {

    HomePage homePage;
    CartPage cartPage;
    ProductPage productPage;

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

    @Step("Should see Samsung Galaxy S6, Samsung Galaxy S7 and Sony Vaio i7")
    public void should_see_samsung_galaxy_s6_samsung_galaxy_s7_and_sony_vaio_i7() {
        assertThat(cartPage.getProductNamesFromCart()).contains("Sony vaio i7");  //ToDo add this strings to a map with its selector
        assertThat(cartPage.getProductNamesFromCart()).contains("Samsung galaxy s7"); //ToDo add this strings to a map with its selector
        assertThat(cartPage.getProductNamesFromCart()).contains("Samsung galaxy s6");  //ToDo add this strings to a map with its selector
    }
}
