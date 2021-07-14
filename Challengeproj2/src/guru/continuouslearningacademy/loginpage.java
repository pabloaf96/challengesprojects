package guru.continuouslearningacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.unosquare.challenge2.Base;

public class loginpage extends Base {

    By newaccountbutton = By.xpath("//*[@id=\"createAccountSubmit\"]");

    public loginpage(WebDriver driver) {
        super(driver);
    }

    public void clickonnewaccountbutton() throws InterruptedException {
        wait(5000);
        click(newaccountbutton);
    }
}
