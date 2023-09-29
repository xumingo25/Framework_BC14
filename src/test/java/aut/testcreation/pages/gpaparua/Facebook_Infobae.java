package aut.testcreation.pages.gpaparua;

import framework.engine.utils.gpaparua.Infobae_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Facebook_Infobae extends Infobae_Base {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    By locatorFacebookLink = By.xpath("//a[@aria-label='facebook link']");
    By locatorCloseBtn = By.xpath("//div[@aria-label='Cerrar']");
    By locatorFacebookForgotPasswordLink = By.xpath("//a[@href='https://www.facebook.com/recover/initiate?ars=royal_blue_bar']");
    public Facebook_Infobae(WebDriver driver) {
        super(driver);
    }
    public void olvideMiPasswordFacebook () {
        scrollByLocator(locatorFacebookLink);
        click(esperarPorElementoLocalizado(locatorFacebookLink));
        cambiarVentana();
        click(esperarPorElementoLocalizado(locatorCloseBtn));
        click(esperarPorElementoLocalizado(locatorFacebookForgotPasswordLink));
    }
}
