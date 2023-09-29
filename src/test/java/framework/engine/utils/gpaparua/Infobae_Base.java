package framework.engine.utils.gpaparua;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class Infobae_Base {
    protected WebDriver driver;
    protected WebDriverWait espera;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public Infobae_Base(WebDriver driver) {this.driver = driver;}

    public void click(By localizador) {
        driver.findElement(localizador).click();
    }

    public void click(WebElement elemento) {
        elemento.click();
    }

    public void escribirTexto(By localizador, String texto) {
        driver.findElement(localizador).sendKeys(texto);
    }

    public void escribirTexto(WebElement elemento, String texto) {
        elemento.sendKeys(texto);
    }

    public WebElement buscarElementoWeb(By localizador) {
        return driver.findElement(localizador);
    }

    public List<WebElement> buscarElementosWeb(By localizador) {
        return driver.findElements(localizador);
    }

    public void esperarXSegundos(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            System.out.println("Ups! Error. No te preocupes :) lo estamos solucionando.");
        }
    }

    public void cargarPagina(String url) {
        driver.get(url);
    }

    public WebElement esperarPorElementoLocalizado(By localizador) {
        espera = new WebDriverWait(this.getDriver(), 20);
        return espera.until(ExpectedConditions.presenceOfElementLocated(localizador));
    }

    public String obtenerTexto(By localizador) {
        return driver.findElement(localizador).getText();
    }

    public String obtenerTexto(WebElement elemento) {
        return elemento.getText();
    }

    public void maximizar() {
        driver.manage().window().maximize();
    }

    public void cerrarBrowser() {
        driver.quit();
    }

    public WebDriver conexionDriver(String browser, String ruta, String property) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty(property, ruta);
            this.driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty(property, ruta);
            this.driver = new FirefoxDriver();
        }
        return this.driver;
    }

    public void scrollByLocator (By localizador) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", esperarPorElementoLocalizado(localizador));
    }

    public void cambiarVentana () {
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        windowHandles.remove(currentWindowHandle);
        driver.switchTo().window(windowHandles.iterator().next());
    }
}
