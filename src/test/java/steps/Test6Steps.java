package steps;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductPage;
import PageObjects.PurchasePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class Test6Steps {

    HomePage homePage;
    CartPage cartPage;
    ProductPage productPage;
    PurchasePage purchasePage;

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

    @Step("Buy selected products")
    public void buy_selected_products() {
        cartPage.buyItemsInCart();
        purchasePage.completeForumAndPurchase();
    }
    @Step("Should see purchase confirmation")
    public void should_see_purchase_confirmation() {
        assertThat(purchasePage.getPurchaseConfirmationText()).isEqualToIgnoringCase("Thank you for your purchase!");
    }
}
