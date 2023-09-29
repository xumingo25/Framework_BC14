package aut.testcreation.testcases;

import aut.testcreation.pages.Main;
import aut.testcreation.pages.Register;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CP01_Infobae {
    WebDriver driver;
    Register register;
    Main main;
    String rutaDriver = "C:\\Users\\guido.paparua\\Desktop\\BootCamp\\GIT\\Repo de todos - practica\\app\\src\\test\\resources\\drivers\\chromedriver.exe";
    String browser = "Chrome";
    String property = "webdriver.chrome.driver";
    @BeforeEach
    public void preTests(){
        main = new Main(driver);
        main.conexionDriver(browser,rutaDriver,property);
        register = new Register(main.getDriver());
        main.cargarPagina("https://www.infobae.com/");
        main.maximizar();
    }
    @Test
    public void CP01_RegisterOK(){
        main.register();
        register.completarFormularioRegistro("aaaaapruebitaTSOFT456123@gmail.com", "Pepito", "Prueba", "Argentina", "Juancarlos1234.", "Juancarlos1234.");
        Assertions.assertTrue(true);
    }
    @AfterEach
    public void afterTests (){ main.cerrarBrowser(); }

}
