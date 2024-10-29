package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserDataPage {


    WebDriver driver;
    WebElement name;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;


    public UserDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    //-------------------------------------------------

    public void inputName(String name) {
        getName().clear();
        getName().sendKeys(name);

    }

    public void inputEmail(String email) {
        getEmail().clear();
        getEmail().sendKeys(email);
    }

    public void inputCurrentAddress(String currentAddress) {
        getCurrentAddress().clear();
        getCurrentAddress().sendKeys(currentAddress);
    }

    public void inputPermanentAddress(String permanentAddress) {
        getPermanentAddress().click();
        getPermanentAddress().sendKeys(permanentAddress);
    }


}
