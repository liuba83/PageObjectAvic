package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailPage extends BasePage {

    private static final String WARRANTY_TITLE_12M = "//select[@name='warranty']";
    private static final String DROPDOWN_WARRANTY = "12 месяцев";
    private static final String BUY_IN_ONE_CLICK_BUTTON = "//a[text()='Купить в 1 клик']";

    public ProductDetailPage (WebDriver driver) {
        super (driver);
    }

    public void selectWarranty() {
        Select dropdown = new Select (driver.findElement(By.xpath(WARRANTY_TITLE_12M)));
        dropdown.selectByVisibleText(DROPDOWN_WARRANTY);
    }

    public String getSelectedOption() {
        Select dropdown = new Select (driver.findElement(By.xpath(WARRANTY_TITLE_12M)));
       String selectedOption =  dropdown.getFirstSelectedOption().getText();
       return selectedOption;
    }

    public void clickBuyIn1ClickButton() {
        driver.findElement(By.xpath(BUY_IN_ONE_CLICK_BUTTON));
    }
}
