package aut.testcreation.pages.Bootcamp14pages;


import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageRumbo extends SeleniumWrapper {


    public HomePageRumbo(WebDriver driver) {
        super(driver);
    }


    // DEFINIR LOCALIZADORES-----------------------------------------------------------------------
    By localizadorBotonCookies = By.xpath("//button[contains(text(), 'Aceptar todo')]");




    // CENTRALIZAR ACCIONES------------------------------------------------------------------------

    public void aceptarCookies(){

     click(esperarXElementoLocalizado(localizadorBotonCookies));
    }





}
