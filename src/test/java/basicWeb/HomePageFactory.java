package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFactory extends BaseClass{

    //WebDriver driver = null;
    @FindBy(xpath = "//a[@href='/login']")
    WebElement navToLoginLink;
    public void navToLogin(){
        navToLoginLink.click();
    }
}