package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

    private static final String IPHONE12_TAB = "//div[contains(@class, 'top-links__left')]//a[contains(@href, 'iphone-12')]";
    private static final String ACTUAL_TEXT = "//div[@class='modal-top']//div[text()='Купить в 1 клик']";

    public HomePage (WebDriver driver) {
        super (driver);
    }

    public void clickiPhoneTab() {
        driver.findElement(By.xpath(IPHONE12_TAB)).click();
    }

    public String getSelectedText() {
        String actualText = driver.findElement(By.xpath(ACTUAL_TEXT)).getText();
        return actualText;
    }

}
