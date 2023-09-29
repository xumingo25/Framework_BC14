package aut.testcreation.pages.gpaparua;

import framework.engine.utils.gpaparua.Infobae_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Infobae_Base {
    By locatorEmail = By.id("email");
    By locatorPassword = By.id("password");
    By locatorLoginBtn = By.id("loginButton");
    By locatorForgotPassword = By.xpath("//button[@class='login-form-support-options-btn']");
    public Login(WebDriver driver) {
        super(driver);
    }

    public void completarFormularioLogin (String correo, String password) {
        escribirTexto(esperarPorElementoLocalizado(locatorEmail), correo);
        escribirTexto(esperarPorElementoLocalizado(locatorPassword), password);
        click(esperarPorElementoLocalizado(locatorLoginBtn));
        click(esperarPorElementoLocalizado(locatorForgotPassword));
        click(esperarPorElementoLocalizado(locatorLoginBtn));
    }
}
