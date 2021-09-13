package avictests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class FilterTest extends BaseTest {

    private static final String SELECTED_QUERY = "iphone-12";

    @Test(priority = 1)
    public void verifyThatUrlContainsSelectedTab() {
        getHomePage().clickiPhoneTab();
        assertTrue(getDriver().getCurrentUrl().contains(SELECTED_QUERY));
    }
}
