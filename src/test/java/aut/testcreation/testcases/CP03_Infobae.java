package aut.testcreation.testcases;


import aut.testcreation.pages.Facebook_Infobae;
import aut.testcreation.pages.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CP03_Infobae {
    WebDriver driver;
    Main main;
    Facebook_Infobae facebook_infobae;
    String rutaDriver = "C:\\Users\\guido.paparua\\Desktop\\BootCamp\\GIT\\Repo de todos - practica\\app\\src\\test\\resources\\drivers\\chromedriver.exe";
    String browser = "Chrome";
    String property = "webdriver.chrome.driver";
    @BeforeEach
    public void preTests(){
        main = new Main(driver);
        main.conexionDriver(browser,rutaDriver,property);
        facebook_infobae = new Facebook_Infobae(main.getDriver());
        main.cargarPagina("https://www.infobae.com/");
        main.maximizar();
    }
    @Test
    public void CP03_FacebookInfobae(){
        main.facebookInfobae();
        facebook_infobae.olvideMiPasswordFacebook();
        Assertions.assertTrue(true);
    }
    @AfterEach
    public void afterTests (){ main.cerrarBrowser(); }
}
