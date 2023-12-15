package basicWeb;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class LandingPageTest extends LandingPageFactory{


    @Test
    public void coursesLinkExistTest(){
        HomePageFactory hpf = new HomePageFactory();
        LoginPageFactory  lpf = new LoginPageFactory();
        hpf.navToLogin();
        lpf.insertEmail();
        lpf.insertPassword();
        lpf.clickOnLoginBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        boolean flag = courses.isDisplayed();
        Assert.assertTrue(flag);
    }
}
