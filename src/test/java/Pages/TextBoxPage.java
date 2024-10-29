package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TextBoxPage extends BaseTest {

    WebDriver driver;
    WebElement usernameAndEmailFields;
    WebElement adressFields;
    WebElement submitButton;
    WebElement submissionBox;
    WebElement errorButton;

    public TextBoxPage (WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getUsernameAndEmailFields() {
        return this.driver.findElements(By.className(".mr-sm-2.form-control"));

    }

    public List<WebElement> getAdressFields() {
        return this.driver.findElements(By.className("form-control"));
    }

    public WebElement getSubmitButton() {
        return this.driver.findElement(By.id("submit"));
    }

    public List<WebElement> getSubmissionBox() {
        return this.driver.findElements(By.className("mb-1"));
    }

    public WebElement getErrorButton() {
        return this.driver.findElement(By.cssSelector(".mr-sm-2.field-error.form-control"));
    }

    //-------------------------------------------------------

    public List<String> submissionBoxInput() {
        List<String> submissionTexts = new ArrayList<>();
        for (WebElement box : this.getSubmissionBox()) {
            submissionTexts.add(box.getText());
        }
        return submissionTexts;
    }




    public void clickOnSubmitButton(){
        getSubmitButton().click();

    }



}


