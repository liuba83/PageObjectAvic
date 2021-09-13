package avictests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WarrantyTest extends BaseTest {

    private static final String WARRANTY_TITLE = "12 месяцев";

    @Test(priority = 3)
    public void verifyThat12mWarrantySelected() {
        getHomePage().clickiPhoneTab();
        getIphone12ListPage().openPDPiPhone();
        getProductDetailPage().selectWarranty();
        String selectedOption = getProductDetailPage().getSelectedOption();
        assertTrue(selectedOption.equals(WARRANTY_TITLE));
    }
}
