package Base;

import Pages.HomepagePage;
import Pages.SidebarPage;
import Pages.TextBoxPage;
import Pages.UserDataPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    public WebDriver driver;
    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public TextBoxPage textBoxPage;
    public UserDataPage userDataPage;




    @BeforeClass
    public void setUp () {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.homepagePage = new HomepagePage(driver);
        this.sidebarPage = new SidebarPage(driver);
        this.userDataPage = new UserDataPage(driver);
        this.textBoxPage = new TextBoxPage(driver);
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
    }

    public void jsClick(WebElement element) {
        ((JavascriptExecutor)this.driver).executeScript("arguments[0].click();", new Object[]{element});
    }
}
