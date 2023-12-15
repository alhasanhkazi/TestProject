package basicWeb;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseClass {
    WebDriver driver;
    public void getBaseUrl (){
        driver.get("https://www.letskodeit.com/");
    }

    @BeforeMethod
    public void launchChrome() {
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        getBaseUrl();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
