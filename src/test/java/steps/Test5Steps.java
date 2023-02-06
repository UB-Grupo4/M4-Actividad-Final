package steps;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class Test5Steps {

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

    @Step("is on the cart page")
    public void go_to_cart_page() {
        cartPage.navigateTo();
    }

    @Step("Go to Samsung Galaxy S6")
    public void go_to_Samsung_Galaxy_S6() {
        homePage.clickOnPhoneS6();
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
}
