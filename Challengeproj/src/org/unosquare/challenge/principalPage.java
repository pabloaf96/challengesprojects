package org.unosquare.challenge;

import com.project.pom.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class principalPage extends Base{

    String url = "https://www.microsoft.com/en-us/?spl=1";
    By officeNavItem = By.id("shellmenu_1");
    By windowsNavItem = By.id("shellmenu_2");
    By surfaceNavItem = By.id("shellmenu_3");
    By xboxNavItem = By.id("shellmenu_4");
    By dealsNavItem = By.xpath("//*[@id=\"shellmenu_5\"]");
    By supportNavItem = By.id("l1_support");

    public principalPage(WebDriver driver) {
        super(driver);
    }

    public void initiatedriver(){
        chromeDriverConnection();
        visit(url);

    }


    public void validatemenuitems() throws InterruptedException{
        Thread.sleep(5000);
        Assert.assertEquals(getText(officeNavItem),"Office");
        System.out.println("Office item displayed");
        Assert.assertEquals(getText(windowsNavItem),"Windows");
        System.out.println("Windows item displayed");
        Assert.assertEquals(getText(surfaceNavItem),"Surface");
        System.out.println("Surface item displayed");
        Assert.assertEquals(getText(xboxNavItem),"Xbox");
        System.out.println("Xbox item displayed");
        Assert.assertEquals(getText(dealsNavItem),"Deals");
        System.out.println("Deals item displayed");
        Assert.assertEquals(getText(supportNavItem),"Support");
        System.out.println("Support item displayed");
    }

    public void gotowindows() {
        click(windowsNavItem);
    }




}
