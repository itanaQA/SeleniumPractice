package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomepagePage extends BaseTest {
    WebDriver driver;
    WebElement elementsButton;

    public HomepagePage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getElementsButton() {
        return this.driver.findElements(By.className("card-body"));
    }

    public void clickOnCard(String cardName) {
        for (int i = 0; i < this.getElementsButton().size(); ++i) {
            if (((WebElement) this.getElementsButton().get(i)).getText().equals(cardName)) {
                ((WebElement) this.getElementsButton().get(i)).click();
                break;
            }
        }

    }
}
