package avictests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BuyIn1ClickTest extends BaseTest {

    private static final String EXPECTED_TEXT = "Купить в 1 клик";

    @Test(priority = 4)
    public void verifyPopUpWithBuyIn1Click() {
        getHomePage().clickiPhoneTab();
        getIphone12ListPage().openPDPiPhone();
        getProductDetailPage().selectWarranty();
        getProductDetailPage().clickBuyIn1ClickButton();
        String actualText = getHomePage().getSelectedText();
        assertEquals(actualText, EXPECTED_TEXT);
    }
}
