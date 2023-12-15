package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTest extends LoginPageFactory{

    @Test
    public void loginTest(){
        navToLogin();
        insertEmail();
        insertPassword();
        clickOnLoginBtn();
    }

    @Test(dependsOnMethods = {"loginTest"})
    public void coursesPageTitleTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String coursesPageTitle = driver.getTitle();
        System.out.println(coursesPageTitle);
        Assert.assertEquals(coursesPageTitle,"My Courses");
    }

    @Test
    public void coursesLinkExistTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        boolean flag = driver.findElement(By.linkText("Courses")).isDisplayed();
        Assert.assertTrue(flag);
    }


}