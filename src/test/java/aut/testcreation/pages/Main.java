package aut.testcreation.pages;

import framework.engine.utils.Infobae_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends Infobae_Base {
    By locatorBtnRegister = By.xpath("//button[@class='identity-button primary']");
    By locatorBtnLogin = By.xpath("//button[@class='identity-button secondary']");
    By locatorBtnFacebookInfobae = By.xpath("//a[@aria-label='facebook link']");
    public Main(WebDriver driver) {
        super(driver);
    }
    public void register (){ click(esperarPorElementoLocalizado(locatorBtnRegister)); }
    public void login (){ click(esperarPorElementoLocalizado(locatorBtnLogin)); }
    public void facebookInfobae (){ click(esperarPorElementoLocalizado(locatorBtnFacebookInfobae)); }
}
