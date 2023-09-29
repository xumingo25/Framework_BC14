package framework.engine.selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public WebDriver driver;
    public static ThreadLocal<WebDriver> hiloLocal = new ThreadLocal<>();

    /**
     * inicializa el WebDriver segun la seleccion del browser
     * @param browser: chrome | firefox
     * @return Webdriver
     */
    public WebDriver inicializarDriver(String browser){

        System.out.println("browser value is: "+browser);
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                hiloLocal.set(new ChromeDriver());
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                return getDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                hiloLocal.set(new FirefoxDriver());
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                return getDriver();
            case "chrome":
                WebDriverManager.chromedriver().setup();
                hiloLocal.set(new ChromeDriver());
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                return getDriver();
            case "edge":
                WebDriverManager.edgedriver().setup();
                hiloLocal.set(new EdgeDriver());
                getDriver().manage().deleteAllCookies();
                getDriver().manage().window().maximize();
                getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                return getDriver();
            default:
                throw new RuntimeException("Navegador no configurado: " + browser);
        }
    }

    public WebDriver createWebDriver() {
        String webDriver = System.getProperty("browser", "edge");
        switch (webDriver) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "edge":
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            default:
                throw new RuntimeException("Error en el webdriver: " + webDriver);
        }
    }



    /**
     * retorna el WebDriver desde el ThreadLocal
     * @return WebDriver
     */
    public static synchronized WebDriver getDriver(){
        return hiloLocal.get();
    }
}