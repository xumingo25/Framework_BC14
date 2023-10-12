package aut.testcreation.pages.Bootcamp14pages.HotelPage;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class HotelPage extends SeleniumWrapper {


    public HotelPage(WebDriver driver) {
        super(driver);
    }


    // DEFINIR LOCALIZADORES-----------------------------------------------------------------------


    By locatorBotonHoteles = By.xpath("//span[contains(text(), 'Hoteles')]");


    By locatorDondeIr = By.cssSelector("input[aria-label='Buscar alojamiento en']");


    By locatorFechaIngreso = By.cssSelector("button[aria-label='Fecha de entrada']");






    By locatorFirstname = By.name("firstname");
    By locatorLastname = By.name("lastname");
    By locatorMail = By.name("reg_email__");
    By locatorReMail = By.name("reg_email_confirmation__");
    By locatorPassword = By.name("reg_passwd__");
    By locatorDia = By.name("birthday_day");

    By locatorAnio = By.id("year");
    By locatorGeneros = By.xpath("//label[contains(@for,'u_0_')]");
    By locatorPronombre = By.name("preferred_pronoun");
    By locatorCustomGenero = By.name("custom_gender");
    By locatorBotonIngresar = By.xpath("//button[@type='submit']");
    By locatorCorreoYaAsociado = By.xpath("//h3[contains(text(), 'tienes una cuenta de Facebook')]");


    // CENTRALIZAR ACCIONES------------------------------------------------------------------------



    public void completarCamposBusquedaHoteles(String Lugar) {

        click(esperarXElementoLocalizado(locatorBotonHoteles));
        esperarXSegundos(2000);



      // escribirTexto(esperarXElementoLocalizado(locatorDondeIr),Lugar);
       // esperarXSegundos(2000);
       // click(locatorDondeIr);



        WebElement dondeIrElement = esperarXElementoLocalizado(locatorDondeIr);
        escribirTexto(dondeIrElement, Lugar);
        esperarXSegundos(2000);

        // Envía la tecla Enter
        dondeIrElement.sendKeys(Keys.ENTER);

        esperarXSegundos(4000);




        click(esperarXElementoLocalizado(locatorFechaIngreso));
        esperarXSegundos(2000);




    }
}