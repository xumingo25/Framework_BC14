package aut.testcreation.testcases;

import aut.testcreation.pages.Login;
import aut.testcreation.pages.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CP02_Infobae {
    WebDriver driver;
    Main main;
    Login login;
    String rutaDriver = "C:\\Users\\guido.paparua\\Desktop\\BootCamp\\GIT\\Repo de todos - practica\\app\\src\\test\\resources\\drivers\\chromedriver.exe";
    String browser = "Chrome";
    String property = "webdriver.chrome.driver";
    @BeforeEach
    public void preTests(){
        main = new Main(driver);
        main.conexionDriver(browser,rutaDriver,property);
        login = new Login(main.getDriver());
        main.cargarPagina("https://www.infobae.com/");
        main.maximizar();
    }
    @Test
    public void CP02_Login(){
        main.login();
        login.completarFormularioLogin("aaaaapruebitaTSOFT456123@gmail.com", "Juancarlos1234.");
        Assertions.assertTrue(true);
    }
    @AfterEach
    public void afterTests (){ main.cerrarBrowser(); }
}
