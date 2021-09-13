package avictests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class OpenPDPTest extends BaseTest {

    private static final String SELECTED_QUERY_FOR_PDP = "iphone-12-pro-max";

   @Test(priority = 2)
    public void verifyThatPdpOpen() {
        getHomePage().clickiPhoneTab();
        getIphone12ListPage().openPDPiPhone();
        assertTrue(getDriver().getCurrentUrl().contains(SELECTED_QUERY_FOR_PDP));
    }
}
