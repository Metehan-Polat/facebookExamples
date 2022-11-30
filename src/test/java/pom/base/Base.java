package pom.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Base {

    private static WebDriver driver;
    private static WebElement element;

    private   static Select select;
    private   static Actions actions;
    public static Select getSelect() {
        return select;
    }

    public static void setSelect(Select select) {
        Base.select = select;
    }

    public static Actions getActions() {
        return actions;
    }

    public static void setActions(Actions actions) {
        Base.actions = actions;
    }



    public static WebDriver getDriver() {
        return driver;
    }


    public static WebElement getElement() {
        return element;
    }







    public void driverChromeMethod()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    public void driverFirefoxMethod()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public void driver(String a)
    {
        if (a.contains("Chrome"))
        {
            driverChromeMethod();
        }
        else if (a.contains("Firefox"))
        {
            driverFirefoxMethod();
        }
        else System.out.println("The requested browser was not found");
    }


    public void quitMethod()
    {
        driver.quit();
    }
}
