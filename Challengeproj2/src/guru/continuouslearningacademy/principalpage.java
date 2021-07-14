package guru.continuouslearningacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.unosquare.challenge2.Base;

public class principalpage extends Base {
    By identifybutton = By.xpath("//*[@id=\"nav-link-accountList\"]");

    public principalpage(WebDriver driver) {
        super(driver);
    }

    public void locateidentifybutton() throws InterruptedException {
        wait(5000);
        click(identifybutton);
    }

}
