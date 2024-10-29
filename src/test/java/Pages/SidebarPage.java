package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SidebarPage {
    WebDriver driver;
    WebElement webTablesButton;

    public SidebarPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getButton() {
        return this.driver.findElements(By.className("text"));
    }

    public void clickOnButton(String buttonName) {
        for(int i = 0; i < this.getButton().size(); ++i) {
            if (((WebElement)this.getButton().get(i)).getText().equals(buttonName)) {
                ((WebElement)this.getButton().get(i)).click();
                break;
            }
        }

    }
}
