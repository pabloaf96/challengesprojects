package org.unosquare.challenge;

import com.project.pom.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class visualStudioSearchPage extends Base {
    By popupUSAbutton = By.id("R1MarketRedirect-close");
    By price1 = By.xpath("//*[@id=\"coreui-productplacement-30l7ywa_0\"]/div/div/span[3]/span[1]");
    By price2 = By.xpath("//*[@id=\"coreui-productplacement-30l7ywa_1\"]/div/div/span[3]/span[1]");
    By price3 = By.xpath("//*[@id=\"coreui-productplacement-30l7ywa_2\"]/div/div/span[3]/span[1]");
    By firstsoftwaredisplayed = By.xpath("//*[@id=\"coreui-productplacement-30l7ywa_dg7gmgf0dst3\"]");


    public visualStudioSearchPage(WebDriver driver) {
        super(driver);
    }

    public void printprice() {
        System.out.println("\n" + getText(price1)+"\n"+getText(price2)+"\n"+getText(price3));
    }

    public int saveprice() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        String text = getText(price1);
        text = text.replaceAll("[$.,00]", "");
        System.out.println(text);
        int firstpricesaved = Integer.parseInt(text);
        return firstpricesaved;
    }

    public void clickonvisualstudioresult() {
        click(firstsoftwaredisplayed);
    }


}
