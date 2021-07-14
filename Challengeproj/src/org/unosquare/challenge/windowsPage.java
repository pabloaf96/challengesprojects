package org.unosquare.challenge;

import com.project.pom.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class windowsPage extends Base {

    By windows10button = By.xpath("//*[@id=\"c-shellmenu_55\"]");
    By primerwindows10item = By.xpath("//*[@id=\"c-shellmenu_56\"]");
    By segundowindows10item = By.xpath("//*[@id=\"c-shellmenu_57\"]");
    By tercerwindows10item = By.xpath("//*[@id=\"c-shellmenu_58\"]");
    By cuartowindows10item = By.xpath("//*[@id=\"c-shellmenu_59\"]");
    By quintowidows10item = By.xpath("//*[@id=\"c-shellmenu_60\"]");
    By sextowindows10item = By.xpath("//*[@id=\"c-shellmenu_61\"]");
    By septimowindows10item = By.xpath("//*[@id=\"c-shellmenu_62\"]");
    By octavowindows10item = By.xpath("//*[@id=\"c-shellmenu_63\"]");
    By novenowindows10item = By.xpath("//*[@id=\"c-shellmenu_64\"]");
    By decimowindows10item = By.xpath("//*[@id=\"c-shellmenu_65\"]");
    By searchbutton = By.id("search");
    By searchbar = By.id("cli_shellHeaderSearchInput");

    public windowsPage(WebDriver driver) {
        super(driver);
    }

    public void clickonwindows10() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        click(windows10button);

    }

    public void printwindows10elements() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String texto = "\n" + getText(primerwindows10item) + "\n" + getText(segundowindows10item) + "\n" + getText(tercerwindows10item) + "\n" +
                getText(cuartowindows10item) + "\n" + getText(quintowidows10item) + "\n" + getText(sextowindows10item) + "\n" +
                getText(septimowindows10item) + "\n" + getText(octavowindows10item) + "\n" + getText(novenowindows10item) + "\n" +
                getText(decimowindows10item);
        System.out.println(texto);
    }

    public void searchforvisualstudio() {
        click(searchbutton);
        type("Visual studio", searchbar);
        click(searchbutton);
    }


}
