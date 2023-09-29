package aut.testcreation.pages.gpaparua;

import framework.engine.utils.gpaparua.Infobae_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register extends Infobae_Base {
    By locatorEmail = By.id("email");
    By locatorNombre = By.id("firstName");
    By locatorApellido = By.id("lastName");
    By locatorSelectPais = By.xpath("//input[@class='field-select-input login-form-input']");
    By locatorPaisArgentina = By.xpath("//button[contains(text(), 'Argentina')]");
    By locatorPassword = By.id("password");
    By locatorConfirmPassword = By.id("confirmPassword");
    By locatorCheckTerminos = By.xpath("//span[@class='login-form-agree-terms-ctn-geekmark']");
    By locatorLoginBtn = By.id("loginButton");
    public Register(WebDriver driver) {
        super(driver);
    }

    public void completarFormularioRegistro (String correo, String nombre, String apellido, String pais, String password, String confirmPassword) {
        escribirTexto(esperarPorElementoLocalizado(locatorEmail), correo);
        escribirTexto(esperarPorElementoLocalizado(locatorNombre), nombre);
        escribirTexto(esperarPorElementoLocalizado(locatorApellido), apellido);
        click(esperarPorElementoLocalizado(locatorSelectPais));
        escribirTexto(esperarPorElementoLocalizado(locatorSelectPais), pais);
        click(esperarPorElementoLocalizado(locatorPaisArgentina));
        escribirTexto(esperarPorElementoLocalizado(locatorPassword), password);
        escribirTexto(esperarPorElementoLocalizado(locatorConfirmPassword), confirmPassword);
        click(esperarPorElementoLocalizado(locatorCheckTerminos));
        click(esperarPorElementoLocalizado(locatorLoginBtn));
    }
}
