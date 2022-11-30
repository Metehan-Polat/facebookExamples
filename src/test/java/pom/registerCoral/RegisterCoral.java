package pom.registerCoral;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.security.Key;

public class RegisterCoral {

    public void verifyCoralTurkiye(WebDriver driver, WebElement element)
    {
        element=driver.findElement(By.xpath("//a[@href='/']"));
    }

    public void clickBecomeaMember(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='/uye-ol']")).click();
    }
    public void fiildetails(WebDriver driver, WebElement element, Actions actions, String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6)
    {
        element=driver.findElement(By.xpath("//input[@name='ctl00$ctl00$cphMain$Widget_126$ctl02$name']"));
        actions=new Actions(driver);
        actions.click(element)
                .sendKeys(arg0).sendKeys(Keys.TAB)
                .sendKeys(arg1).sendKeys(Keys.TAB)
                .sendKeys(arg2).sendKeys(Keys.TAB)
                .sendKeys(arg3).sendKeys(Keys.TAB)
                .sendKeys(arg4).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(arg5).sendKeys(Keys.TAB)
                .sendKeys(arg6).perform();
    }
    public void checkboxClarification(WebDriver driver)
    {
        driver.findElement(By.xpath("//label[@for='cphMain_Widget_126_ctl02_chckKvkk']")).click();
    }
    public void chechboxExplicitConsentTex(WebDriver driver)
    {
        driver.findElement(By.xpath("//label[@for='cphMain_Widget_126_ctl02_chckPermissionSmsEmail']")).click();
    }
    public void clickSubscribeButton(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@id='Save']")).click();
    }
    public void verifyTextMessage(WebDriver driver,WebElement element,String arg0)

    {
        element=driver.findElement(By.xpath("//*[@id='cphMain_Widget_126_ctl02_success']/div/table/tbody/tr/td[2]/p/br[2]"));
        String b=element.getText();
        System.out.println(b);

        String a="Üyelik işlemlerinizi tamamlamak için "+arg0+" adresine gönderdiğimiz linki onaylamanızı bekliyoruz.";
        System.out.println(a);
        Assert.assertEquals(b,a);

    }
}
