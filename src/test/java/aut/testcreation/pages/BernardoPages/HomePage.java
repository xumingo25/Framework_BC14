package aut.testcreation.pages.BernardoPages;


import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumWrapper {


    public HomePage(WebDriver driver) {
        super(driver);
    }


    // DEFINIR LOCALIZADORES-----------------------------------------------------------------------
    By localizadorBotonRegistrar = By.xpath("//a[contains(text(),'Registrarte')]");




    // CENTRALIZAR ACCIONES------------------------------------------------------------------------

    public void irARegistrarse(){
       // click(localizadorBotonRegistrar);
     click(esperarXElementoLocalizado(localizadorBotonRegistrar));
    }

    
}
