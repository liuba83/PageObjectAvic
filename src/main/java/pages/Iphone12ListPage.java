package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Iphone12ListPage extends BasePage {

    private static final String PDP_IPHONE = "//span[contains(text(), '235017')]";

    public Iphone12ListPage (WebDriver driver) {
        super (driver);
    }

    public void openPDPiPhone() {
        driver.findElement(By.xpath(PDP_IPHONE)).click();
    }
}
