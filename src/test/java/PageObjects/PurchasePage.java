package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class PurchasePage extends PageObject {

    @FindBy(id="name")
    WebElementFacade userNameLocator;

    @FindBy(id="card")
    WebElementFacade creditCardLocator;

    @FindBy(xpath="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
    WebElementFacade purchaseButtonLocator;

    @FindBy(xpath="/html/body/div[10]/h2")
    WebElementFacade purchaseConfirmationLocator;

    public void completeForumAndPurchase() {
        purchaseButtonLocator.waitUntilClickable();
        userNameLocator.sendKeys("user1");
        creditCardLocator.sendKeys("Card1234");
        purchaseButtonLocator.click();
    }

    public String getPurchaseConfirmationText() {
        String purchaseText = purchaseConfirmationLocator.getText();
        return purchaseText;
    }
}
