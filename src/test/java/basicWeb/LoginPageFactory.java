package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory extends HomePageFactory{
    //WebDriver driver = null;


    @FindBy(xpath = "(//input[@id='email'])[1]")
    WebElement  emailTextBox;

    @FindBy(xpath = "(//input[@id='login-password'])[1]")
    WebElement passwordTextBox;

    @FindBy (xpath = "//button[@id='login']")
    WebElement loginBtn;
    String email ="kazimarvel@gmail.com";
    String password = "Asdf!234";


    public void insertEmail(){
        emailTextBox.sendKeys(email);
    }
    public void insertPassword (){
        passwordTextBox.sendKeys(password);
    }
    public void clickOnLoginBtn(){
     loginBtn.click();
    }
}
