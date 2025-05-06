import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn
{
@FindBy(id = "userName")
private WebElement userName;
@FindBy(id="password")
private WebElement password;
@FindBy(id = "login")
private WebElement send;

public void actionLogIn(String name, String Password)
{
    userName.sendKeys(name);
    password.sendKeys(Password);
    send.click();

}

}
