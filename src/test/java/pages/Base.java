package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Base {
    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Método para la conexión del navegador que sea necesario
    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome.exe");
        driver = new ChromeDriver();
        return driver;
    }

    //Crear métodos propios para mantenerlos sin cambios en las versiones
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

}
