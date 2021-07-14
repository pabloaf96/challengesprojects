package org.unosquare.challenge;

import com.project.pom.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage extends Base {
    By pricevisualstudiocart = By.xpath("//*[@id=\"store-cart-root\"]/div/div/div/section[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/span/span[2]/span");
    By selectdropdown = By.xpath("//*[@id=\"store-cart-root\"]/div/div/div/section[1]/div/div/div/div/div/div[2]/div[2]/div[1]/select");
    By option20 = By.xpath("//*[@id=\"store-cart-root\"]/div/div/div/section[1]/div/div/div/div/div/div[2]/div[2]/div[1]/select/option[20]");
    By option20result = By.xpath("//*[@id=\"store-cart-root\"]/div/div/div/section[2]/div/div/div[1]/div/span[1]/span[2]/div/span/span[2]/span");

    public cartPage(WebDriver driver) {
        super(driver);
    }

    public boolean verify3priceamounts(int firstpricesaved, int preciovisualstudio) {
        String preciovisual = getText(pricevisualstudiocart);
        preciovisual = preciovisual.replaceAll("[$.,00]", "");
        int preciovisualstudiocart = Integer.parseInt(preciovisual);
        if(preciovisualstudiocart !=firstpricesaved || preciovisualstudiocart!=preciovisualstudio){
            return false;
        }
        else{
            return true;
        }
    }


    public boolean validatenumberofitemsprice(int preciovisualstudiocart) {
        click(selectdropdown);
        click(option20);

        String preciovisual3 = getText(option20result);
        preciovisual3 = preciovisual3.replaceAll("[$.,00]", "");

        int valoresperado = 20*(preciovisualstudiocart);
        int valorfinal = Integer.parseInt(preciovisual3);
        if (valorfinal!=valoresperado){
            return false;
        }
        else{
            return true;
        }
    }

}
