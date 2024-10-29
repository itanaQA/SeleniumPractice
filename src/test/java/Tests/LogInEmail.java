package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LogInEmail extends BaseTest {

    public LogInEmail() {
    }

    @BeforeMethod
    public void pageSetUp() {
        this.driver.navigate().to("https://demoqa.com/");
        scrollToElement(homepagePage.getElementsButton().get(0));
        this.homepagePage.clickOnCard("Elements");
        this.sidebarPage.clickOnButton("Text Box");

    }


    @Test
    public void userCanSubmitValidEmail() {

        String name = "John";
        String validEmail = "test123@gmail.com";
        String currentAddress = "123 Maple Street";
        String permanentAddress = "456 Elm Street";

        userDataPage.inputName(name);
        userDataPage.inputEmail(validEmail);
        userDataPage.inputCurrentAddress(currentAddress);
        scrollToElement(userDataPage.getPermanentAddress());
        userDataPage.inputPermanentAddress(permanentAddress);
        scrollToElement(textBoxPage.getSubmitButton());
        textBoxPage.clickOnSubmitButton();
        textBoxPage.getSubmissionBox();
        List<String> submissionResults = textBoxPage.submissionBoxInput();
        System.out.println(submissionResults);

        Assert.assertTrue(submissionResults.contains("Name:" + name));
        Assert.assertTrue(submissionResults.contains("Email:" + validEmail));
        Assert.assertTrue(submissionResults.contains("Current Address :" + currentAddress));
        Assert.assertTrue(submissionResults.contains("Permananet Address :" + permanentAddress));


    }


    @Test (priority = 10)
    public void userCannotSubmitInvalidEmail() throws InterruptedException {

        String name = "John";
        String validEmail = "test123 ";
        String currentAddress = "123 Maple Street";
        String permanentAddress = "456 Elm Street";

        userDataPage.inputName(name);
        userDataPage.inputEmail(validEmail);
        userDataPage.inputCurrentAddress(currentAddress);
        scrollToElement(userDataPage.getPermanentAddress());
        userDataPage.inputPermanentAddress(permanentAddress);
        scrollToElement(textBoxPage.getSubmitButton());
        textBoxPage.clickOnSubmitButton();
        Assert.assertTrue(textBoxPage.getErrorButton().isDisplayed());

    }
}






