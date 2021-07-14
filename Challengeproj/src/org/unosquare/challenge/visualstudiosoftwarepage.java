package org.unosquare.challenge;

import com.project.pom.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class visualstudiosoftwarepage extends Base {
    By visualstudioprice = By.xpath("/html/body/section/div[1]/div[1]/div[1]/div[2]/div[6]/div/div[1]/div/div/div[1]/span");
    By addtocart = By.xpath("//*[@id=\"buttonPanel_AddToCartButton\"]");
    By closepopup = By.xpath("//*[@id=\"email-newsletter-dialog\"]/div[3]/div[1]");
    int preciovisualstudio;



    public visualstudiosoftwarepage(WebDriver driver) {
        super(driver);
    }

    public boolean validatebothprices(int firstpricesaved) throws InterruptedException {
        click(closepopup);
        Thread.sleep(2000);
        String preciovisualstudiotext = getText(visualstudioprice);
        preciovisualstudiotext = preciovisualstudiotext.replaceAll("[$.,0]", "");
        int preciovisualstudio = Integer.parseInt(preciovisualstudiotext);
        if(preciovisualstudio!=firstpricesaved){
                return false;
            }
            else {
                return true;
            }
    }

    public void clickaddtocart() {
        click(addtocart);
    }
}
