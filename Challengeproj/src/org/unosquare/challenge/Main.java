package org.unosquare.challenge;

import com.project.pom.Base;
import com.sun.xml.internal.ws.policy.AssertionValidationProcessor;
import org.openqa.selenium.WebDriver;

public class Main {



    public static void main(String[] args) throws InterruptedException {
        // write your code here

        principalPage p = new principalPage(Base.driver);
        p.initiatedriver();
        p.validatemenuitems();
        p.gotowindows();

        windowsPage w = new windowsPage(Base.driver);
        w.clickonwindows10();
        w.printwindows10elements();
        w.searchforvisualstudio();

        visualStudioSearchPage s = new visualStudioSearchPage(Base.driver);
        s.printprice();
        int price1 = s.saveprice();
        s.clickonvisualstudioresult();

        visualstudiosoftwarepage v = new visualstudiosoftwarepage(Base.driver);
        v.validatebothprices(price1);
        v.clickaddtocart();

        cartPage c = new cartPage(Base.driver);
        c.verify3priceamounts(v.preciovisualstudio, price1);
        c.validatenumberofitemsprice(price1);



    }
}