package steps;

import PageObjects.HomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class Test3Steps {

    HomePage homePage;

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
        assertThat(homePage.hasMonitors()).isFalse();
        assertThat(homePage.hasLaptops()).isFalse();
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
}
