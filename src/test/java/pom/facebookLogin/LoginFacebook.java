package pom.facebookLogin;

import io.cucumber.java.zh_cn.而且;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LoginFacebook {
    public void clickSignInButton(WebDriver driver)
    {
        driver.findElement(By.xpath("//button[@name='login']")).click();
    }

    public void invalidUsernameOrPassword(WebDriver driver, WebElement element)
    {
        element=driver.findElement(By.xpath("//*[text()='Geçersiz kullanıcı adı veya şifre']"));
        String a=element.getText();
        String b="Geçersiz kullanıcı adı veya şifre";
        Assert.assertEquals(a,b);
    }

    public void password(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@type='password']"));
        element.sendKeys("veli123...");

    }
    public void wrongPassword(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@type='password']"));
        element.sendKeys("veli123..");

    }
    public void email(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("veli95830@gmail.com..");

    }
    public void wrongEmail(WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("veli95@gmail.com..");

    }
    public void enterEmailAddress(String arg0,WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys(arg0);
    }
    public void enterPassword(String agrs0,WebDriver driver,WebElement element)
    {
        element=driver.findElement(By.xpath("//input[@type='password']"));
        element.sendKeys(agrs0);

    }

    public void usernameInProfile(WebDriver driver,WebElement element)

    {
        element=driver.findElement(By.xpath("//*[@id='scrollview']/div/div/div/div[1]/div/div[3]/div[1]/div[2]/span/span[2]/span"));
        String a=element.getText();
        String b="Veli";
        Assert.assertEquals(a,b);

    }
    public void clickAccount(WebDriver driver)
    {
        driver.findElement(By.xpath("//i[@style='background-image:url('https://static.xx.fbcdn.net/rsrc.php/v3/yy/r/-NVv0Fv5vzD.png');background-position:0 -147px;background-size:auto;width:20px;height:20px;background-repeat:no-repeat;display:inline-block']")).click();

    }
    public void signOut(WebDriver driver)
    {
        driver.findElement(By.xpath("//*[@id='scrollview']/div/div/div/div[1]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div/span")).click();
    }


}
