package basicWeb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPageFactory extends LoginPageFactory{

    @FindBy(linkText = "Courses")
    WebElement courses;
}
