package snappet.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageElements {

    public static Target UserNameField = Target.the("user name field").located(By.id("UserName"));
    public static Target PasswordField = Target.the("password field").located(By.id("Password"));
    public static Target LogInBtn = Target.the("login button").located(By.xpath("//button[@class='btn btn-primary btn-login']"));
    public static Target PasswordRecovery = Target.the("Forgot password link").located(By.xpath("//a[@class='btn btn-txt btn-forget']"));

}
